package code.pattern.strategy.two;

/**
 * TODO:
 *
 * @Version 1.0.0
 * @Author Ace
 * @Date 2018-04-05 21:42
 **/
public class Order {
    Integer id;
    Integer orderId;
    double anmout;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public double getAnmout() {
        return anmout;
    }

    public void setAnmout(double anmout) {
        this.anmout = anmout;
    }

    @Override
    public String toString() {
        return "Order:" +
                "id=" + id +
                ", 订单id=" + orderId +
                ", 总金额=" + anmout ;
    }
}
