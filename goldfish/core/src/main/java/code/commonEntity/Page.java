package code.commonEntity;

import lombok.Data;

/**
 * @Title: Page
 * @Package code.commonEntity
 * @Description:
 * @Author ZYQ
 * @Date 2018/7/6 17:49
 * @Version
 */
@Data
public class Page {
    /**
     * 每页大小
     */
    private int pageSize;

    /**
     * 页码
     */
    private int pageNum;

    /**
     * 总数
     */
    private long total;



    /**
     * 字段
     */
    private String sort;


    private Order order ;

}


enum Order {

    DESC("DESC"),
    ASC("ASC"),
    ;

    private String value;

    Order(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}