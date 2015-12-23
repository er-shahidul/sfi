package com.rbs.www.common.services;

public class TypeConversionUtils {
    public static byte[] toPrimitiveType(final Byte[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        final byte[] result = new byte[array.length];
        for (int i = 0; i < array.length; i++)
            result[i] = array[i];

        return result;
    }

    public static Byte[] toObjectType(final byte[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        final Byte[] result = new Byte[array.length];
        for (int i = 0; i < array.length; ++i)
            result[i] = array[i];

        return result;
    }
}