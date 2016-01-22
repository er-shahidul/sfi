package com.rbs.www.common.modules.validator;

import org.hibernate.validator.internal.engine.resolver.DefaultTraversableResolver;
import org.springframework.expression.Expression;
import org.springframework.expression.TypeConverter;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.expression.spel.support.StandardTypeConverter;

import javax.validation.Path;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;

public class CustomTraversableResolver extends DefaultTraversableResolver {

    private static final TypeConverter TYPE_CONVERTER
            = new RelaxedBooleanTypeConverterDecorator(new StandardTypeConverter());

    @Override
    public boolean isCascadable(Object traversableObject,
                                Path.Node traversableProperty,
                                Class<?> rootBeanType,
                                Path pathToTraversableObject,
                                ElementType elementType) {
        CascadeIf cascadeAnnotation = ReflectionUtils.extractFieldLevelAnnotation(
                rootBeanType, traversableProperty.toString(), CascadeIf.class
        );

        return super.isCascadable(
                traversableObject, traversableProperty, rootBeanType, pathToTraversableObject, elementType
        ) && (cascadeAnnotation == null || evaluate(
                traversableObject, cascadeAnnotation.value()
        ));
    }

    private boolean evaluate(Object rootObject, String expressionString) {
        StandardEvaluationContext context = new StandardEvaluationContext();
        context.setRootObject(rootObject);
        context.setTypeConverter(TYPE_CONVERTER);

        Expression expression = new SpelExpressionParser().parseExpression(expressionString);

        Boolean result = expression.getValue(context, Boolean.class);
        return result == null ? false : result;
    }
}
