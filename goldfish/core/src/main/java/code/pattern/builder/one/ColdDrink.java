package code.pattern.builder.one;

/**
 * TODO:创建一个类目抽象类,为冷饮,并填写包装方法为瓶子包装
 *
 * @Description:
 * @Version 1.0.0
 * @Author ZYQ
 * @Date 2018-04-15 15:29
 **/
public abstract class ColdDrink implements Item {


    @Override

    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}