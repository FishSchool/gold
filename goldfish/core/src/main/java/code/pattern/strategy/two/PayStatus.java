package code.pattern.strategy.two;

/**
 * TODO:
 *
 * @Version 1.0.0
 * @Author Ace
 * @Date 2018-04-05 21:40
 **/
public class PayStatus {
    int code;

    Object data;

    String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PayStatus{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }

}
