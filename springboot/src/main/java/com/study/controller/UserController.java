package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/user")
public class UserController {


    @GetMapping(value = "/soedxe")
    public @ResponseBody
    String methodTest(HttpServletRequest request, HttpServletResponse response) {
        return "这是一个测试";
    }
}
