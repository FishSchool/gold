/**
 * TODO:
 *
 * @Author ZYQ
 * @Date 2018-04-24 21:49
 **/
package code.pattern.proxy.cglib;

/**
 * TODO:
 * @Version 1.0.0
 * @Package my.code.pattern.proxy.cglib
 * @Author ZYQ
 * @Date 2018-04-24 21:49
 */
public class TestCglibProxy {


    public static void main(String[] args) {

        Proxy proxy = new Proxy();
        Zhangsan instance = (Zhangsan)proxy.getInstance(new Zhangsan());
        instance.findLove("张三");
        instance.getLove("张三");
    }
}
