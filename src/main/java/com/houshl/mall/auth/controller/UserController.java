package com.houshl.mall.auth.controller;

import com.houshl.mall.auth.model.User;
import com.houshl.mall.auth.param.AuthorizationParam;
import com.houshl.mall.auth.param.UserParam;
import com.houshl.mall.auth.response.ObjectResponse;
import com.houshl.mall.auth.response.ResponseUtils;
import com.houshl.mall.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by houshuanglong on 2018/8/30.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public ObjectResponse regist(UserParam param) throws Exception {
        User user = userService.register(param);
        return ResponseUtils.ok(user);
    }

    @RequestMapping("/login")
    public ObjectResponse login(String username) throws Exception {
        UserDetails user = userService.loadUserByUsername(username);
        return ResponseUtils.ok(user);
    }

    @RequestMapping("/list")
    public ObjectResponse list() throws Exception {
        List<User> userList = userService.list();
        return ResponseUtils.ok(userList);
    }

}
