package com.study.dao;

import com.study.entity.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends CrudRepository<User,Long>, JpaSpecificationExecutor<User> {
    /**
     * 根据年龄查询User
     * @param age
     * @return
     */
    List<User> findUserByAge(Integer age);

    List<User> findAllByNameEquals(String name);

}
