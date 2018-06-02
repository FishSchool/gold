package code.pattern.factory.func;

import code.pattern.factory.one.Milk;
import code.pattern.factory.one.Sanlu;

/**
 * Created by Tom on 2018/3/4.
 */
public class SanluFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Sanlu();
    }
}
