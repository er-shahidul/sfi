package com.rbs.www.common.services;

import org.apache.commons.lang3.SerializationUtils;

import javax.xml.bind.DatatypeConverter;
import java.io.Serializable;

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

    public static String toBase64Binary(final Byte[] array) {
        if (array == null) return null;
        return DatatypeConverter.printBase64Binary(TypeConversionUtils.toPrimitiveType(array));
    }

    public static Byte[] serialize(Serializable obj) {
        if (obj == null) return null;
        return toObjectType(SerializationUtils.serialize(obj));
    }

    public static Object deserialize(Byte[] objectData) {
        if (objectData == null) return null;
        return SerializationUtils.deserialize(toPrimitiveType(objectData));
    }
}
