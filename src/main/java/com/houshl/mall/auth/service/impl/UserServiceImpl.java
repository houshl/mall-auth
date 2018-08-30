package com.houshl.mall.auth.service.impl;

import com.houshl.mall.auth.mapper.UserMapper;
import com.houshl.mall.auth.model.User;
import com.houshl.mall.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by houshuanglong on 2018/8/30.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void save(User user) throws Exception {
        userMapper.insert(user);
    }
}
