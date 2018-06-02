package code.pattern.factory.simple;


import code.pattern.factory.one.Mengniu;
import code.pattern.factory.one.Milk;
import code.pattern.factory.one.Telunsu;
import code.pattern.factory.one.Yili;

/**
 * Created by Tom on 2018/3/4.
 */
public class SimpleFactory {

    public Milk getMilk(String name){
        if("特仑苏".equals(name)){
            return new Telunsu();
        }else if("伊利".equals(name)){
            return new Yili();
        }else if("蒙牛".equals(name)){
            return new Mengniu();
        }else {
            System.out.println("不能生产您所需的产品");
            return null;
        }
    }

}
