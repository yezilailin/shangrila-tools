package com.yezilaolin.shangrila.springboot.controller;

import com.yezilaolin.shangrila.springboot.model.MyResult;
import com.yezilaolin.shangrila.springboot.model.User;
import com.yezilaolin.shangrila.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: haitong.lin
 * @Date: 2021/8/4 16:36
 * @Description:
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @PostMapping("/login")
    public MyResult login(@RequestBody User user){
        return userService.login(user);
    }

}
