package code.pattern.observer.one;

import code.pattern.observer.one.core.Event;

/**
 * TODO:
 *
 * @Version 1.0.0
 * @Author Ace
 * @Date 2018-04-10 14:46
 **/
public class Observer {

   public void msg(Event event){
       System.out.println("===========这是一个观察者============");
       System.out.println("事件内容"+event);
   }

}
