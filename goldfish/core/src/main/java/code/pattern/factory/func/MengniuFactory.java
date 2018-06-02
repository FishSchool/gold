package code.pattern.factory.func;

import code.pattern.factory.one.Mengniu;
import code.pattern.factory.one.Milk;

/**
 * Created by Tom on 2018/3/4.
 */
public class MengniuFactory implements  Factory {


    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}
