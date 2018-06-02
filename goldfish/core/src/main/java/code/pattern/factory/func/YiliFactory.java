package code.pattern.factory.func;

import code.pattern.factory.one.Milk;
import code.pattern.factory.one.Yili;

/**
 * Created by Tom on 2018/3/4.
 */
public class YiliFactory implements Factory {

    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
