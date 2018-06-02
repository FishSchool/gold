package code.pattern.proxy.two;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * TODO:代理模式中的代理类
 *
 * @Version 1.0.0
 * @Author Ace
 * @Date 2018-04-04 1:59
 **/
public class ProxyFactory implements InvocationHandler{
    private Object target;

    public Object getInstance(Object o){

        this.target=o;
        Class<?> aClass=o.getClass();
        /**
         * 这个h源码中是表示继承InvocationHandler的ProxyFactory这个代理类
         */
        return Proxy.newProxyInstance(aClass.getClassLoader(),aClass.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /**
         * 这里调用了传进来o的方法
         */
        Object obj=method.invoke(target,args);
        System.out.println(obj);
        System.out.println("[蛋糕, 苹果, 衣服, 鞋子]");
        System.out.println("买完了回家");
        return obj;
    }
}
