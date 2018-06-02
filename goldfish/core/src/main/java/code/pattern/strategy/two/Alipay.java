package code.pattern.strategy.two;

/**
 * TODO:
 *
 * @Version 1.0.0
 * @Author Ace
 * @Date 2018-04-05 21:45
 **/
public class Alipay implements Payment {
    @Override
    public PayStatus pay(Order order) {
        PayStatus status = new PayStatus();
        status.setCode(1);
        status.setMsg("使用阿里支付,支付成功");
        status.setData(order);
        return status;
    }
}
