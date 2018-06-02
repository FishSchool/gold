/**
 * TODO:
 *
 * @Author ZYQ
 * @Date 2018-04-15 23:12
 **/
package code.pattern.builder.one;

/**
 * TODO:套餐构造器让其生成一个套餐
 *
 * @Version 1.0.0
 * @Package my.code.pattern.builder.one
 * @Author ZYQ
 * @Date 2018-04-15 23:12
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
