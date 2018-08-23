package com.study.entity;


import lombok.Data;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author zyq
 */

@Table
@Data
public class User {

    /**
     * 主键id
     */
    @Id
    private long userId;
    /**
     * 名称
     */
    @Column
    private String name;
    /**
     * 昵称
     */
    @Column
    private String nakName;
    /**
     * 年龄
     */
    @Column
    private Integer age;
    /**
     * 性别
     */
    @Column
    private int sex;

    /**
     * 电话号码
     */
    @Column
    private String phone;


}
