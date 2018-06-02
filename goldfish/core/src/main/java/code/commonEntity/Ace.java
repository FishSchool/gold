/**
 * TODO:
 *
 * @Author ZYQ
 * @Date 2018-04-27 15:44
 **/
package code.commonEntity;

import java.util.Date;

/**
 * TODO:
 *
 * @Version 1.0.0
 * @Package code.pattern.proxy.two
 * @Author ZYQ
 * @Date 2018-04-27 15:44
 */
public class Ace {

    public Ace(String name, String nikeName, Integer age, String eMail, String interest) {
        this.name = name;
        this.nikeName = nikeName;
        this.age = age;
        this.eMail = eMail;
        this.interest = interest;
    }

    public Ace() {
    }

    /**
     * 姓名
     */
    private String name;
    /**
     * 昵称
     */
    private String nikeName;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 邮箱
     */
    private String eMail;
    /**
     * 爱好
     */
    private String interest;

    /**
     * 时间
     */
    private Date date;

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

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Ace{" +
                "name='" + name + '\'' +
                ", nikeName='" + nikeName + '\'' +
                ", age=" + age +
                ", eMail='" + eMail + '\'' +
                ", interest='" + interest + '\'' +
                ", date=" + date +
                '}';
    }
}
