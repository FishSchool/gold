package code.pattern.observer.one;


import code.pattern.observer.one.core.Event;

import java.lang.reflect.Method;

public class ObserverTest {
    public static void main(String[] args) throws Exception {
        Observer observer = new Observer();

        Method msg = Observer.class.getMethod("msg", new Class<?>[]{Event.class});


        SecurityManager securityManager=System.getSecurityManager();
        Subject subject = new Subject();
        subject.addListener(EventType.ON_ADD, observer, msg);
        subject.add();


    }
}
