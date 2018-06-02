package code.pattern.builder.one;

/**
 * TODO:创建一个包装实体类瓶子,用于包装饮品
 *
 * @Description:${TODO}
 * @Version 1.0.0
 * @Author ZYQ
 * @Date 2018-04-15 15:26
 **/
public class Bottle implements Packing {

    @Override
  /**
  　　* @Description:
  　　* @param []
  　　* @return java.lang.String
  　　* @throws
  　　* @author ZYQ
  　　* @date 2018/4/15 16:15
  　　*/
    public String pack() {
        return "Bottle";
    }
}