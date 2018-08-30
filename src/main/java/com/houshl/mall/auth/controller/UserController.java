package com.houshl.mall.auth.controller;

import com.houshl.mall.auth.model.User;
import com.houshl.mall.auth.response.ObjectResponse;
import com.houshl.mall.auth.response.ResponseUtils;
import com.houshl.mall.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by houshuanglong on 2018/8/30.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @RequestMapping("/save")
    public ObjectResponse save() throws Exception {
        User user = new User();
        user.setUsername("houshl");
        user.setPassword(passwordEncoder.encode("111111"));
        user.setMobile("18668923574");
        user.setCreateTime(new Date());
        userService.save(user);
        return ResponseUtils.ok();
    }

}
