package code.pattern.strategy.two;

/**
 * TODO:
 *
 * @Version 1.0.0
 * @Author Ace
 * @Date 2018-04-05 21:59
 **/
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setId(90304034);
        order.setAnmout(88.88);
        order.setOrderId(190123490);
        Payment payment = PayManner.JD_PAY.getPayment();
        PayStatus status =payment.pay(order);
        System.out.println(status);
    }
}
