package com.study.service.impl;

import com.study.dao.UserDao;
import com.study.entity.User;
import com.study.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {


    @Autowired
    UserDao userDao;

    @Override
    public void addUser(User user) {
        log.error("添加用户");
        userDao.save(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.save(user);
    }

    @Override
    public List<User> queryUserList(User user, Pageable pageable) {
        userDao.findAll(new Specification<User>() {
                            @Override
                            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                                Predicate predicate = null;
                                if (user.getName() != null && !user.getName().trim().equals("")) {

                                    predicate = cb.like(root.get("name"), "%" + user.getName() + "%");

                                }
                                return predicate;
                            }
                        }, PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), pageable.getSort())

        );

        return null;
    }
}
