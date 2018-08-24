package com.study.dao;

import com.study.entity.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zyq
 * CrudRepository是增删改查的基本接口,泛型是查询的Entity和Entity主键类型
 * JpaSpecificationExecutor是复杂查询
 *
 */
@Repository
public interface UserDao extends CrudRepository<User,Long>, JpaSpecificationExecutor<User> {
    /**
     * 根据年龄查询User
     * @param age
     * @return
     */

    List<User> findUserByAge(Integer age);

    /**
     * 根据名称获取列表
     * @param name
     * @return
     */
    List<User> findAllByNameEquals(String name);

}
