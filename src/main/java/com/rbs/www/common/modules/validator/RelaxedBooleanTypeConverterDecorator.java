package com.rbs.www.common.modules.validator;

import org.springframework.core.convert.TypeDescriptor;
import org.springframework.expression.TypeConverter;

import java.util.Collection;

/**
 * Decorator for {@linkplain TypeConverter} that can convert numbers,
 * collections and arrays to boolean value. Not matching types delegates to
 * the decorated converter.
 *
 * <h2>Number -> Boolean:</h2>
 * <tt>value = 0 ? false : true</tt>
 *
 * <h2>Collection -> Boolean:</h2>
 * <tt>value.isEmpty()? ? false : true</tt>
 *
 * <h2>Array -> Boolean:</h2>
 * <tt>value.length == 0 ? false : true</tt>
 *
 * <h2>Else</h2>
 * delegate to decorated
 *
 */
public class RelaxedBooleanTypeConverterDecorator implements TypeConverter {

    private static final TypeDescriptor BOOLEAN_TYPE = TypeDescriptor.valueOf(Boolean.class);
    private static final TypeDescriptor NUMBER_TYPE = TypeDescriptor.valueOf(Number.class);

    private final TypeConverter decorated;

    public RelaxedBooleanTypeConverterDecorator(TypeConverter decorated) {
        this.decorated = decorated;
    }


    public boolean canConvert(TypeDescriptor sourceType, TypeDescriptor targetType) {
        return targetType.isAssignableTo(BOOLEAN_TYPE)
                && (
                    sourceType.isAssignableTo(NUMBER_TYPE)
                    || sourceType.isCollection()
                    || sourceType.isArray()
                )
                || decorated.canConvert(sourceType, targetType);
    }

    public Object convertValue(Object value, TypeDescriptor sourceType, TypeDescriptor targetType) {
        if (targetType.isAssignableTo(BOOLEAN_TYPE)) {
            if (value instanceof Number) {
                return ((Number) value).intValue() != 0;
            }
            if (sourceType.isCollection()) {
                return ! ((Collection) value).isEmpty();
            }
            if (sourceType.isArray()) {
                return ((Object[]) value).length != 0;
            }
            return value;

        } else {
            return decorated.convertValue(value, sourceType, targetType);
        }
    }
}
