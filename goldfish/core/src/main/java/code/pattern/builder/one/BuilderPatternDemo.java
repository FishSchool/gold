/**
 * TODO:
 *
 * @Author ZYQ
 * @Date 2018-04-15 23:14
 **/
package code.pattern.builder.one;

/**
 * TODO:
 *
 * @Version 1.0.0
 * @Package my.code.pattern.builder.one
 * @Author ZYQ
 * @Date 2018-04-15 23:14
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
