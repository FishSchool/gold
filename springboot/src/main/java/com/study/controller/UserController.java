package com.study.controller;

import com.study.entity.User;
import com.study.service.UserService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
@Slf4j
@ApiModel(value = "用户管理",description = "利用RESTFul模式进行增删改查")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation(value = "用户添加",tags = "")
    @PutMapping(value = "/add")
    @ResponseBody
    public String addUser( @ApiParam(name="用户对象",value="传入json格式",required=true) User user) {
        try {
            userService.addUser(user);
        } catch (Exception e){
            log.error("添加用户失败");
            return "添加失败";
        }
        return "用户添加成功";
    }


    @ApiOperation(value = "用户修改",tags = "")
    @PutMapping(value = "/updateUser")
    @ResponseBody
    public String updateUser(@RequestBody @ApiParam(name="用户对象",value="传入json格式",required=true)  User user) {
        try {
            userService.updateUser(user);
        } catch (Exception e){
            log.error("更新用户失败");
            return "更新失败";
        }
        return "更新成功";
    }


    @ApiOperation(value = "用户修改",tags = "")
    @DeleteMapping(value = "/updateUser")
    @ResponseBody
    public String deleteUser(@RequestBody @ApiParam(name="id",value="传入json格式",required=true)  long id) {
        try {
            userService.deleteUser(id);
        } catch (Exception e){
            log.error("删除用户失败");
            return "删除失败";
        }
        return "删除成功";
    }

    @ApiOperation(value = "用户详情",tags = "")
    @PostMapping(value = "/{id}")
    @ResponseBody
    public User getUser( @RequestBody @ApiParam(name="id",value="传入json格式",required=true)@PathVariable(name = "id")  long id) {
        User user = new User();
        try {
            userService.getUser(id);
        } catch (Exception e){
            log.error("获取信息失败");
        }
        return user;
    }

    @ApiOperation(value = "用户列表",tags = "")
    @PostMapping(value = "/list")
    @ResponseBody
    public List<User> getUserList(@RequestBody @ApiParam(name="id",value="传入json格式",required=true) User user) {
        List<User> users = new ArrayList<>();
        Pageable pageable = PageRequest.of(1,20);
        try {
            userService.queryUserList(user,pageable);
        } catch (Exception e){
            log.error("获取信息失败");
        }
        return users;
    }


    /**
     * thymeleaf测试
     * @param test
     * @return
     */
    @ApiOperation(value = "测试",tags = "")
    @GetMapping(value = "/test")
    @ApiParam(value = "test",required = true)
    public String test( String test) {
        return "page/user/list";
    }
}
