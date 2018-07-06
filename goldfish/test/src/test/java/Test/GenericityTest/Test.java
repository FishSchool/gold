package Test.GenericityTest;

import code.commonEntity.Person;
import code.genericity.result.Generic;
import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * @Title: Test
 * @Package Test.GenericityTest
 * @Description:
 * @Author ZYQ
 * @Date 2018/7/6 13:52
 * @Version
 */
public class Test  {



    public static void main(String[] args) {


        Generic<Person> generic = new Generic<Person>() {};

        Class<Person> tClass = generic.getTClass();
        tClass.getTypeName();
        /*List<Person> people = new ArrayList<>();

        Person person = new Person();


        for (int i = 0; i < 10; i++) {
            person.setAge(i);
            person.setName("名称"+i);
            people.add(person);
        }


        String s = PojoUtil.toJson(people);

        String jsonString = JSON.toJSONString(people);


        Generic<Person> result = new Generic<Person>();
        List<Person> voList = result.getVOList(jsonString);
        List<Person> personList = parseArray(jsonString, Person.class);


        for (Person person1 : personList) {
            System.out.println(person.toString());
        }*/
    }



    public static <T> List<T> parseArray(String response,Class<T> object){
        List<T> modelList = JSON.parseArray(response, object);
        return modelList;
    }
}
