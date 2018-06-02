package code.pattern.strategy.two;

/**
 * TODO:
 *
 * @Version 1.0.0
 * @Author Ace
 * @Date 2018-04-05 21:46
 **/
public class Unionpay implements  Payment {


    @Override
    public PayStatus pay(Order order) {
        PayStatus status = new PayStatus();
        status.setCode(1);
        status.setMsg("使用银联支付,支付成功");
        status.setData(order);
        return status;
    }
}
