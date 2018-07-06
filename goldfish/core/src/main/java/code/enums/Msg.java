package code.enums;

/**
 * @Title: Msg
 * @Package code.enums
 * @Description:
 * @Author ZYQ
 * @Date 2018/7/6 17:16
 * @Version
 */
public enum Msg {
    SUCCESS("success"),

    ;
    private String msg;


    Msg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }


    public void setMsg(String msg) {
        this.msg = msg;
    }

}
