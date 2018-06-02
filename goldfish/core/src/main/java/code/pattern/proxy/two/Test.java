package code.pattern.proxy.two;

/**
 * TODO:
 *
 * @Version 1.0.0
 * @Author Ace
 * @Date 2018-04-04 2:10
 **/
public class Test {
    public static void main(String[] args) {

        Ace evis = new Ace();
        ProxyFactory factory = new ProxyFactory();
        Person person = (Person) factory.getInstance(evis);
        System.out.println("------------------未用代理----------------------------");
        System.out.println(evis.goShopping());
        System.out.println("-------------用代理后-------------------");
        Object o=person.goShopping();
    }
}
