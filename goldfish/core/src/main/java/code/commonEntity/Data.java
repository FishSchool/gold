package code.commonEntity;

import code.genericity.result.Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: Data
 * @Package code.commonEntity
 * @Description:
 * @Author ZYQ
 * @Date 2018/7/6 16:45
 * @Version
 */

public class Data<T extends Object> {


   private  List<T> list = new ArrayList<T>();

    private Page page;


    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Data<T> parseData(String dataStr) {
        Generic<T> generic = new Generic<T>() {};

        Class<T> tClass = generic.getTClass();
        return null;

    }


}
