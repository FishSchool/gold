package com.study.dao;

import com.study.entity.User;
import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDao extends CrudRepository<User,Long>, JpaPersistentEntity<User> {
    /**
     * 根据年龄查询User
     * @param age
     * @return
     */
    List<User> findUserByAge(Integer age);

    List<User> findAllByNameEquals(String name);
}
