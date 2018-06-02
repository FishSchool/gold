/**
 * TODO:
 *
 * @Author ZYQ
 * @Date 2018-04-25 16:04
 **/
package code.supplier;

import code.commonEntity.Person;

import java.util.function.Supplier;

/**
 * TODO:
 * @Version 1.0.0
 * @Package my.code.supplier
 * @Author ZYQ
 * @Date 2018-04-25 16:04
 */
public class SupplierDemo {


    private static Supplier<Person> supplier;
    private static Person person;
    private static Runnable runnable;
    private static Person person1;

    public static void main(String[] args) {
        person1 = new Person();
        person1.setAge(1);
        person1.setName("nihao");
        supplier = () -> person1;
        person = supplier.get();
        System.out.println(person.toString());

    }

}
