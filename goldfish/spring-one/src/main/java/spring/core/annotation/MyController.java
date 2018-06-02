package spring.core.annotation;

import java.lang.annotation.*;

/**
 * TODO:
 *
 * @Author ZYQ
 * @Date 2018-04-27 2:05
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyController {
    String value() default "";
}
