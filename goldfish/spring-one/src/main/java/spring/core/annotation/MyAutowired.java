package spring.core.annotation;

import java.lang.annotation.*;

/**
 * TODO:
 *
 * @Author ZYQ
 * @Date 2018-04-27 2:11
 **/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAutowired {
    String value() default "";
}
