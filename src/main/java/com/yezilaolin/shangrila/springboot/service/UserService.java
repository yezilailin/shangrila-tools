package com.yezilaolin.shangrila.springboot.service;

import com.yezilaolin.shangrila.springboot.model.MyResult;
import com.yezilaolin.shangrila.springboot.model.User;

/**
 * @Auther: haitong.lin
 * @Date: 2021/8/4 16:38
 * @Description:
 */
public interface UserService {
    MyResult login(User user);
}
