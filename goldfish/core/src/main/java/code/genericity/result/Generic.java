package code.genericity.result;

import java.lang.reflect.ParameterizedType;

/**
 * @Title: Generic
 * @Package code.genericity.result
 * @Description:泛型获取该T.class,该类必须被继承或者 在其他类就把Person换成T
 * Generic<Person> generic = new Generic<Person>() {};
 * Class<Person> tClass = generic.getTClass();
 * tClass.getTypeName();
 * @Author ZYQ
 * @Date 2018/7/6 14:24
 * @Version
 */
public abstract class Generic<T> {

    public Class<T> entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];


    public Class<T> getTClass() {

        return entityClass;
    }


}




