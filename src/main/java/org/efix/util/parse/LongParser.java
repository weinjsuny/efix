package org.efix.util.parse;

import org.efix.util.MutableInt;
import org.efix.util.buffer.Buffer;
import org.efix.util.type.LongType;

import static org.efix.util.parse.ParserUtil.*;


@SuppressWarnings("Duplicates")
public class LongParser {

    protected static final int MAX_UNSIGNED_LONG_LENGTH = LongType.MAX_UNSIGNED_LONG_LENGTH - 1;
    protected static final int MAX_NEGATIVE_LONG_LENGTH = LongType.MAX_NEGATIVE_LONG_LENGTH - 1;

    public static long parseLong(byte separator, Buffer buffer, MutableInt offset, int end) {
        int start = offset.get();
        int off = start;

        checkFreeSpace(end - off, LongType.MIN_LENGTH + 1);

        byte b = buffer.getByte(off++);
        if (isDigit(b)) { // fast path
            long value = digit(b);

            do {
                b = buffer.getByte(off++);
                if (isDigit(b)) {
                    value = (value << 3) + (value << 1) + digit(b);
                } else if (b == separator) {
                    checkValueLength(off - start - 1, MAX_UNSIGNED_LONG_LENGTH);
                    offset.set(off);
                    return value;
                } else {
                    throwInvalidChar(b);
                }
            } while (off < end);

        } else if (b == '-') {
            b = buffer.getByte(off++);
            if (isDigit(b)) {
                long value = digit(b);

                while (off < end) {
                    b = buffer.getByte(off++);
                    if (isDigit(b)) {
                        value = (value << 3) + (value << 1) + digit(b);
                    } else if (b == separator) {
                        checkValueLength(off - start - 1, MAX_NEGATIVE_LONG_LENGTH);
                        offset.set(off);
                        return -value;
                    } else {
                        throwInvalidChar(b);
                    }
                }

            } else {
                throwInvalidChar(b);
            }
        } else {
            throwInvalidChar(b);
        }

        throw throwSeparatorNotFound(separator);
    }

    public static long parseULong(byte separator, Buffer buffer, MutableInt offset, int end) {
        int start = offset.get();
        int off = start;

        checkFreeSpace(end - off, LongType.MIN_LENGTH + 1);

        long value = 0;
        byte b = buffer.getByte(off++);
        if (isDigit(b))
            value = digit(b);
        else
            throwInvalidChar(b);

        do {
            b = buffer.getByte(off++);
            if (isDigit(b)) {
                value = (value << 3) + (value << 1) + digit(b);
            } else if (b == separator) {
                checkValueLength(off - start - 1, MAX_UNSIGNED_LONG_LENGTH);
                offset.set(off);
                return value;
            } else {
                throwInvalidChar(b);
            }
        } while (off < end);

        throw throwSeparatorNotFound(separator);
    }

    protected static void checkValueLength(int length, int max) {
        if (length > max)
            throw new ParserException(String.format("number is too long, length %s, max length %s", length, max));
    }

}