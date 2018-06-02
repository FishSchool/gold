package code.pattern.singleton;

/**
 * TODO:懒汉是
 *
 * @Version 1.0.0
 * @Author Ace
 * @Date 2018-04-05 22:08
 **/
public class Singleton {

    private Singleton() {
    }

    private static Object object = new Object();
    static private Singleton singleton;

    public static Singleton getSingleton() {
        if (null == singleton) {
            synchronized (object) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }


}
