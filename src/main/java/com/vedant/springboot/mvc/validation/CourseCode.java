package com.vedant.springboot.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
    //define the course code
    public String value() default "VED";

    //define error message
    public String message() default "Must start with VED";

    //define groups
    public Class<?>[] groups() default {};

    // required to allow metadata to be passed to validation clients
    Class<? extends Payload>[] payload() default {};
}
