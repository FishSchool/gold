package code.pattern.strategy.two;

/**
 * TODO:
 *
 * @Version 1.0.0
 * @Author Ace
 * @Date 2018-04-05 21:39
 **/
public interface Payment {


    public PayStatus pay(Order order);
}
