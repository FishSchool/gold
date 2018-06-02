package code.pattern.observer.one.core;

import java.lang.reflect.Method;

/**
 * TODO:
 *
 * @Version 1.0.0
 * @Author Ace
 * @Date 2018-04-10 14:56
 **/
public class Event {
    /**
     * 事件源
     */
    private Object source;

    /**
     * 通知目标
     */
    private Object target;

    /**
     * 回调方法
     */
    private Method callback;

    /**
     * 触发事件
     */
    private String trigger;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    private long time;


    /**
     * @param target
     * @param callback
     */

    public Event(Object target, Method callback) {
        this.target = target;
        this.callback = callback;
    }


    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getCallback() {
        return callback;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", target=" + target +
                ", callback=" + callback +
                ", trigger='" + trigger + '\'' +
                '}';
    }


}
