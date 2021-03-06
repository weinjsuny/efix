package org.efix.util.parse;

import org.efix.util.MutableInt;
import org.efix.util.buffer.Buffer;
import org.efix.util.buffer.BufferUtil;

import static org.junit.Assert.*;

public abstract class AbstractParserTest {

    protected static final byte SEPARATOR = '=';

    @SafeVarargs
    protected static <T> void shouldParse(String string, Verifier<T> verifier, Parser<T>... parsers) {
        Buffer buffer = BufferUtil.fromString(string + (char) SEPARATOR);
        MutableInt offset = new MutableInt();
        int end = buffer.capacity();

        T expected = verifier.parse(string);
        for (Parser<T> parser : parsers) {
            offset.set(0);
            T actual = parser.parse(SEPARATOR, buffer, offset, end);

            assertEquals(end, offset.get());
            assertEquals(string, expected, actual);
        }
    }

    protected static void shouldFailParse(String string, Parser<?>... parsers) {
        Buffer buffer = BufferUtil.fromString(string);
        MutableInt offset = new MutableInt();
        int end = buffer.capacity();

        for (Parser<?> parser : parsers) {
            offset.set(0);
            try {
                parser.parse(SEPARATOR, buffer, offset, end);
                fail(String.format("should fail to parse \"%s\"", string));
            } catch (ParserException e) {
                assertTrue(true);
            }
        }
    }

    protected interface Parser<T> {

        T parse(byte separator, Buffer buffer, MutableInt offset, int end);

    }

    protected interface Verifier<T> {

        T parse(String string);

    }

}
