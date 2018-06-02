package code.pattern.observer.one;

import code.pattern.observer.one.core.EventListener;

/**
 * TODO:
 *
 * @Version 1.0.0
 * @Author Ace
 * @Date 2018-04-10 14:46
 **/
public class Subject extends EventListener {

    public void add() {
        System.out.println("========这是一个添加方法============");
        this.trigger(EventType.ON_ADD);
    }


    public void remove() {
        System.out.println("==========这是一个删除方法=============");
        this.trigger(EventType.ON_REMOVE);
    }
}
