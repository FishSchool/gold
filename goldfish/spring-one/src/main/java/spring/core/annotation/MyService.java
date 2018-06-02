/**
 * TODO:
 *
 * @Author ZYQ
 * @Date 2018-04-27 2:15
 **/
package spring.core.annotation;

import java.lang.annotation.*;

/**
 * TODO:
 * @Version 1.0.0
 * @Package spring.annotation
 * @Author ZYQ
 * @Date 2018-04-27 2:15
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyService {
    String value() default "";
}
