package com.study.entity;


import lombok.Data;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author zyq
 */
@Entity
@Table(name = "Users")
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 4801983855739760046L;
    /**
     * 主键id
     */
    @Id
    @GeneratedValue
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
