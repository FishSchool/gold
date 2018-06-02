package code.pattern.builder.one;

/**
 * TODO:建造者模式,创建一个表示食物条目接口
 *
 * @Description:
 * @Version 1.0.0
 * @Author ZYQ
 * @Date 2018-04-15 15:21
 **/
public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
