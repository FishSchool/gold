package code.enums;

/**
 * @Title: Flag
 * @Package code.enums
 * @Description:
 * @Author ZYQ
 * @Date 2018/7/6 16:53
 * @Version
 */
public enum Flag {
    SUCCESS(1),
    SERVICE_FAIL(0),

    ;


    private int flag;


    Flag(int flag) {
        this.flag = flag;
    }
}
