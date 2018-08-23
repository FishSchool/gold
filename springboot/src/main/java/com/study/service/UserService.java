package com.study.service;

import com.study.entity.User;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void updateUser(User user);

    List<User> queryUserList(User user, Pageable pageable);

}
