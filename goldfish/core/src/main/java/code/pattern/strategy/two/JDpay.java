package code.pattern.strategy.two;

/**
 * TODO:
 *
 * @Version 1.0.0
 * @Author Ace
 * @Date 2018-04-05 21:45
 **/
public class JDpay implements  Payment {
    @Override
    public PayStatus pay(Order order) {
        /**
         * 这里面是支付动作.并且将返回的结果赋值给状态
         */
        PayStatus status = new PayStatus();
        status.setCode(1);
        status.setMsg("使用京东支付,支付成功");
        status.setData(order);
        return status;
    }
}
