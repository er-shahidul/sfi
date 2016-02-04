package com.rbs.www.common.modules.validator;

import org.springframework.expression.*;
import org.springframework.beans.factory.*;
import org.springframework.context.expression.BeanFactoryResolver;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.expression.spel.support.StandardTypeConverter;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

import static org.springframework.util.StringUtils.hasText;

public class SpELAssertValidator implements ConstraintValidator<SpELAssert, Object>, BeanFactoryAware {

    private static final TypeConverter TYPE_CONVERTER
            = new RelaxedBooleanTypeConverterDecorator(new StandardTypeConverter());

    private Expression expression;
    private Expression applyIfExpression;
    private List<Method> functions = new LinkedList<>();
    private BeanFactory beanFactory;

    @Override
    public void initialize(SpELAssert constraint) {
        ExpressionParser parser = new SpelExpressionParser();

        expression = parser.parseExpression(constraint.value());
        if (hasText(constraint.applyIf())) {
            applyIfExpression = parser.parseExpression(constraint.applyIf());
        }
        for (Class<?> clazz : constraint.helpers()) {
            functions = ReflectionUtils.extractStaticMethods(clazz);
        }
    }

    @Override
    public boolean isValid(Object object, ConstraintValidatorContext context) {
        if (object == null) return true;
        EvaluationContext evalContext = createEvaluationContext(object);

        return !isApplyIfValid(evalContext) || evaluate(expression, evalContext);
    }

    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    private boolean isApplyIfValid(EvaluationContext context) {
        return applyIfExpression == null || evaluate(applyIfExpression, context);
    }

    private boolean evaluate(Expression expression, EvaluationContext context) {
        Boolean result = expression.getValue(context, Boolean.class);
        return result == null ? false : result;
    }

    private StandardEvaluationContext createEvaluationContext(Object rootObject) {
        StandardEvaluationContext context = new StandardEvaluationContext();

        context.setRootObject(rootObject);
        context.setTypeConverter(TYPE_CONVERTER);

        if (beanFactory != null) {
            context.setBeanResolver(new BeanFactoryResolver(beanFactory));
        }
        if (!functions.isEmpty()) {
            for (Method helper : functions) {
                context.registerFunction(helper.getName(), helper);
            }
        }

        return context;
    }
}
