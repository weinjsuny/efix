package org.f1x.util.concurrent;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UnsafeArrayTest {

    @Test
    public void shouldSetAndGetObjects() {
        int length = 1024;
        UnsafeArray<Object> array = new UnsafeArray<>(length);
        Assert.assertEquals(length, array.length());

        for (int i = 0; i < length; i++) {
            assertEquals(null, array, i);

            Object current = "1";
            array.set(i, current);
            assertEquals(current, array, i);

            current = "2";
            array.setOrdered(i, current);
            assertEquals(current, array, i);

            current = "3";
            array.setVolatile(i, current);
            assertEquals(current, array, i);

            Object updated = "4";
            assertFalse(array.compareAndSet(i, updated, updated));
            assertEquals(current, array, i);

            assertTrue(array.compareAndSet(i, current, updated));
            assertEquals(updated, array, i);
        }
    }

    protected static void assertEquals(Object expected, UnsafeArray<Object> array, int index) {
        Assert.assertEquals(expected, array.get(index));
        Assert.assertEquals(expected, array.getVolatile(index));
    }

}
