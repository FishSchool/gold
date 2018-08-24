package com.study.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

@ApiModel(value = "用户信息")
public class User implements Serializable {

    private static final long serialVersionUID = 4801983855739760046L;
    /**
     * 主键id
     */
    @Id
    @GeneratedValue
    @ApiModelProperty("用户id")
    private long userId;
    /**
     * 名称
     */
    @Column
    @ApiModelProperty("名称")
    private String name;
    /**
     * 昵称
     */
    @Column
    @ApiModelProperty("昵称")
    private String nakName;
    /**
     * 年龄
     */
    @Column
    @ApiModelProperty("年龄")
    private Integer age;
    /**
     * 性别
     */
    @Column
    @ApiModelProperty("性别")
    private int sex;

    /**
     * 电话号码
     */
    @Column
    private String phone;


}
