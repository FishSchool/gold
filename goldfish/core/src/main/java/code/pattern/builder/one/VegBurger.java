package code.pattern.builder.one;

/**
 * TODO:创建一个蔬菜汉堡
 *
 * @Description:
 * @Version 1.0.0
 * @Author ZYQ
 * @Date 2018-04-15 15:31
 **/
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}