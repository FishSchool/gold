package code.pattern.builder.one;

/**
 * TODO:
 *
 * @Description: ${TODO}
 * @Version 1.0.0
 * @Author ZYQ
 * @Date 2018-04-15 16:02
 **/
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}