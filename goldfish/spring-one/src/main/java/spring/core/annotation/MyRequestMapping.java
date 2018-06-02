package spring.core.annotation;

import java.lang.annotation.*;

/**
 * TODO:
 *
 * @Author ZYQ
 * @Date 2018-04-27 2:08
 **/
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestMapping {


    String value() default "";
}
