package com.study.service.impl;

import com.study.dao.UserDao;
import com.study.entity.User;
import com.study.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

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
        Page<User> userPage = userDao.findAll(new Specification<User>() {
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

        if (userPage.getTotalElements()==0) {
            return null;
        }

        return userPage.getContent();
    }

    @Override
    public User getUser(long id) {

        Optional<User> userOptional = userDao.findById(id);
        return userOptional.get();
    }
}
