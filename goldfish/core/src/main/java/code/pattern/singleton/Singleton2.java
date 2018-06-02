package code.pattern.singleton;

/**
 * TODO:恶汉式
 *
 * @Version 1.0.0
 * @Author Ace
 * @Date 2018-04-05 22:17
 **/
public class Singleton2 {

    private Singleton2() {
    }

    private static Singleton2 singleton = new Singleton2();

    public static synchronized Singleton2 getSingleton() {
        return singleton;
    }


}
