
/**
 * TODO:
 *
 * @Version 1.0.0
 * @Author ZYQ
 * @Date 2018-04-15 22:33
 **/
package code.pattern.builder.one;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO:创建一个套餐类让其存放item
 * @Package my.code.pattern.builder.one
 * @Author ZYQ
 * @Date 2018-04-15 22:33
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }


    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
