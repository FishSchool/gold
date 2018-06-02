package spring.core.annotation;
import java.lang.annotation.*;
/**
 * TODO:
 *
 * @Author ZYQ
 * @Date 2018-04-27 2:13
 **/
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestParam {
    String value() default "";
}
