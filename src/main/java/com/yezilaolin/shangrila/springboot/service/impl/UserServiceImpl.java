package com.yezilaolin.shangrila.springboot.service.impl;

import com.yezilaolin.shangrila.springboot.dao.UserMapper;
import com.yezilaolin.shangrila.springboot.model.MyResult;
import com.yezilaolin.shangrila.springboot.model.User;
import com.yezilaolin.shangrila.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: haitong.lin
 * @Date: 2021/8/4 16:56
 * @Description:
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userDao;
    @Override
    public MyResult login(User user) {
        List<User> userlist = new ArrayList<>();
        userlist=userDao.login(user);
        MyResult result = new MyResult();
        if(userlist.size()!=0){
            result.setCode(0);
            result.setMsg("登录成功！");
            result.setList(userlist);
            result.setObj(userlist.get(0));
        }else{
            result.setCode(1);
            result.setMsg("登录失败！");
        }
        return result;
    }
}
