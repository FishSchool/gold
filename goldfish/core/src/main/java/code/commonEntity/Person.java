/**
 * TODO:
 *
 * @Author ZYQ
 * @Date 2018-04-25 16:05
 **/
package code.commonEntity;

import code.enums.Code;

/**
 * TODO:
 * @Version 1.0.0
 * @Package my.code.supplier
 * @Author ZYQ
 * @Date 2018-04-25 16:05
 */
public class Person {
    private String name;
    private String nikeName;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {


        return "Person{" +
                "name='" + name + '\'' +
                ", nikeName='" + nikeName + '\'' +
                ", age=" + age +
                '}';
    }
}
