/**
 * TODO:
 *
 * @Author ZYQ
 * @Date 2018-04-24 21:50
 **/
package code.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * TODO:
 * @Version 1.0.0
 * @Package my.code.pattern.proxy.cglib
 * @Author ZYQ
 * @Date 2018-04-24 21:50
 */
public class Proxy implements MethodInterceptor {



    public Object getInstance(Object obj ){
        Enhancer enhancer = new Enhancer();
        //cglib是通过子类继承来实现的
        enhancer.setSuperclass(obj.getClass());
        //这是设置返回到哪里,和java Proxy源码有异曲同工之妙
        enhancer.setCallback(this);
        //返回该对象实例
        return enhancer.create();
    }
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println(method.getName());
        System.out.println("这里是调用其他的逻辑");
        Object o=proxy.invokeSuper(obj, args);
        System.out.println("逻辑调用完毕");

        return o;
    }

}
