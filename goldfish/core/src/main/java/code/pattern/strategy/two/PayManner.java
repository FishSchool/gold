package code.pattern.strategy.two;

/**
 * TODO:
 *
 * @Version 1.0.0
 * @Author Ace
 * @Date 2018-04-05 21:55
 **/
public enum PayManner {
    ALI_PAY(new Alipay()),JD_PAY(new JDpay()),UNION_PAY(new Unionpay());
    private  Payment payment;

    PayManner(Payment payment) {
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }
}
