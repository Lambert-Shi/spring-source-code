package org.example.condition;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author shiKui
 */
public class HotelCondition implements Condition {
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String has = context.getEnvironment().getProperty("businessLicense");
        return "true".equals(has);
    }
}
