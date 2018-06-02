package code.pattern.builder.one;

/**
 * TODO:包装食品的实体类,纸质包装用于包装汉堡
 *
 * @Description:
 * @Version 1.0.0
 * @Author ZYQ
 * @Date 2018-04-15 15:25
 **/
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}