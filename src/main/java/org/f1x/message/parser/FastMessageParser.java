package org.f1x.message.parser;

import org.f1x.util.ByteSequence;
import org.f1x.util.buffer.Buffer;
import org.f1x.util.parse.NumbersParser;
import org.f1x.util.parse.TimeOfDayParser;
import org.f1x.util.parse.TimestampParser;

public class FastMessageParser implements MessageParser {

    private static final char SOH = 1;

    private final TimestampParser utcTimestampParser = TimestampParser.createUTCTimestampParser();
    private final TimestampParser localTimestampParser = TimestampParser.createLocalTimestampParser();
    private final ByteSequence charSequenceBuffer = new ByteSequence();

    private Buffer buffer;
    private int start;
    private int offset; // next byte to read
    private int limit;
    private int tagNum;
    private int valueOffset, valueLength;


    public final FastMessageParser wrap(Buffer buffer) {
        this.buffer = buffer;
        this.start = 0;
        this.limit = buffer.capacity();
        reset();

        return this;
    }

    public FastMessageParser wrap(Buffer buffer, int offset, int length) {
        buffer.checkBounds(offset, length);
        this.buffer = buffer;
        this.start = offset;
        this.limit = offset + length;
        reset();

        return this;
    }

    @Override
    public final boolean next() {
        try {
            final boolean result = _next();
            if (result) {
                if (valueLength == 0)
                    throw new FixParserException("Tag " + tagNum + " has empty value at position " + offset);

            }
            return result;

        } catch (FixParserException e) {
            throw new FixParserException("Parser error (at " + offset + "): " + e.getMessage());
        }
    }


    // terrible cycle eats 40% performance
    private boolean _next() {
        boolean isParsingTagNum = true;
        tagNum = 0;
        while (offset < limit) {
            byte ch = buffer.getByte(offset++);
            if (isParsingTagNum) {
                if (ch >= '0' && ch <= '9') {
                    tagNum = 10 * tagNum + (ch - '0');
                } else if (ch == '=') {
                    if (tagNum == 0)
                        throw new FixParserException("Unexpected '=' character instead of a tag number digit");
                    isParsingTagNum = false;
                    valueOffset = offset;
                    valueLength = 0;
                } else {
                    throw new FixParserException("Unexpected character (0x" + Integer.toHexString(ch) + " where a tag number digit or '=' is expected");
                }

            } else {
                if (ch == SOH)
                    return true;

                valueLength++;
            }
        }
        return false;
    }


    @Override
    public int tag() {
        return tagNum;
    }

    @Override
    public byte byteValue() {
        if (valueLength > 1)
            throw new FixParserException("Value is not a single byte");

        return buffer.getByte(valueOffset);
    }

    @Override
    public int intValue() {
        return NumbersParser.parseInt(buffer, valueOffset, valueLength);
    }

    @Override
    public long longValue() {
        return NumbersParser.parseLong(buffer, valueOffset, valueLength);
    }

    @Override
    public double doubleValue() {
        return NumbersParser.parseDouble(buffer, valueOffset, valueLength);
    }

    @Override
    public CharSequence charSequence() {
        charSequenceBuffer.wrap(buffer, valueOffset, valueLength);
        return charSequenceBuffer;
    }

    @Override
    public void byteSequence(ByteSequence sequence) {
        sequence.wrap(buffer, valueOffset, valueLength);
    }

    @Override
    public String string() {
        char[] chars = new char[valueLength];
        for (int i = 0; i < valueLength; i++)
            chars[i] = (char) buffer.getByte(valueOffset + i);

        return new String(chars);
    }

    @Override
    public boolean booleanValue() {
        if (valueLength > 1)
            throw new FixParserException("Field is not a character");

        if (buffer.getByte(valueOffset) == 'Y') return true;

        if (buffer.getByte(valueOffset) == 'N') return false;

        throw new FixParserException("Field cannot be parsed as FIX boolean");
    }

    @Override
    public long utcTimestamp() {
        return utcTimestampParser.getUTCTimestampValue(buffer, valueOffset, valueLength);
    }

    @Override
    public long utcDate() {
        return utcTimestampParser.getUTCDateOnly(buffer, valueOffset, valueLength);
    }

    @Override
    public long localDate() {
        return localTimestampParser.getUTCDateOnly(buffer, valueOffset, valueLength);
    }

    @Override
    public int utcTime() {
        return TimeOfDayParser.parseTimeOfDay(buffer, valueOffset, valueLength);
    }

    @Override
    public final FastMessageParser reset() {
        tagNum = valueOffset = valueLength = 0;
        offset = start;

        return this;
    }

    @Override
    public int fieldOffset() {
        return offset;
    }

    @Override
    public int fieldLength() {
        return valueOffset;
    }

}

