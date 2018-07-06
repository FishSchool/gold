package code.commonEntity;

import code.genericity.result.Generic;
import com.alibaba.fastjson.JSON;

/**
 * @Title: RtnData
 * @Package code.commonEntity
 * @Description:
 * @Author ZYQ
 * @Date 2018/7/6 18:01
 * @Version
 */
public class RtnData<T extends Object> {

    Data data;
    Status status;


    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }




    public RtnData parse(String rtnStr) {
        RtnData rtnData = JSON.parseObject(rtnStr, this.getClass());
        return rtnData;
    }

}
