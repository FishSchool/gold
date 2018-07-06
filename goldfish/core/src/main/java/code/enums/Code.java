package code.enums;

/**
 * @Title: Code
 * @Package code.enums
 * @Description:
 * @Author ZYQ
 * @Date 2018/7/6 16:50
 * @Version
 */
public enum Code {

    SUCCESS(100, "SUCCESS"),
    ERROR_UPDATE_FAIL(100,"更新错误"),
    NOT_FOUND_OBJECT(2,"没有找到对象")
    ;


    public int code;
    public String msg;

    Code(int code, String msg) {

        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
