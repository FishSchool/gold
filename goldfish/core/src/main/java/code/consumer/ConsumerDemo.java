/**
 * TODO:
 *
 * @Author ZYQ
 * @Date 2018-04-25 16:36
 **/
package code.consumer;


import code.commonEntity.Person;

import java.util.function.Consumer;

/**
 * TODO:
 * @Version 1.0.0
 * @Package my.code.customer
 * @Author ZYQ
 * @Date 2018-04-25 16:36
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("未调用Consumer方法");

        System.out.println(person.getName());
        Consumer<Person> personConsumer = Person -> person.setName("调用后更改的参数值");
        personConsumer.accept(person);
        System.out.println(person.getName());
    }
}
