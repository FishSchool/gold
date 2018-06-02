package code.pattern.builder.one;/**
 * TODO:
 *
 * @Description:
 * @Version 1.0.0
 * @Author ZYQ
 * @Date 2018-04-15 16:30
 **/

/**
 * @Title:
 * @Package my.code.pattern.Builder.one
 * @Description:
 * @Author ZYQ
 * @Date 2018-04-15 16:30
 *
 */


public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}