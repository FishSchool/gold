package code.pattern.builder.one;
/**
 * TODO:创建一个冷饮的实体类为可乐.
 *
 * @Version 1.0.0
 * @Author ZYQ
 * @Date 2018-04-15 22:09
 **/

/**
 * @Package my.code.pattern.Builder.one
 * @Author ZYQ
 * @Date 2018-04-15 22:09
 */

public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}