package code.pattern.builder.one;

/**
 * TODO:创建一个类目抽象类,汉堡,并生成包装方法
 *
 * @Description:
 * @Version 1.0.0
 * @Author ZYQ
 * @Date 2018-04-15 15:27
 **/
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
