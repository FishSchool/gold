package code.pattern.observer.one.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * TODO:
 *
 * @Version 1.0.0
 * @Author Ace
 * @Date 2018-04-10 15:07
 **/
public class EventListener {

    private Map<Enum, Event> events = new HashMap<Enum, Event>();

    public void addListener(Enum e, Object target, Method callback) {

        events.put(e, new Event(target, callback));
    }


    public void trigger(Event event) {

        event.setSource(this);
        event.setTime(System.currentTimeMillis());
        try {
            event.getCallback().invoke(event.getTarget(), event);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }

    public void trigger(Enum anEnum) {

        if (this.events.containsKey(anEnum)) {
            Event event = events.get(anEnum);
            event.setTrigger(anEnum.toString());
            trigger(event);
        }

    }
}
