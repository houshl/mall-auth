package com.houshl.mall.auth.service.impl;

import com.houshl.mall.auth.common.CommonUtils;
import com.houshl.mall.auth.mapper.UserMapper;
import com.houshl.mall.auth.model.User;
import com.houshl.mall.auth.param.UserParam;
import com.houshl.mall.auth.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 *
 * @author houshuanglong
 * @date 2018/8/30
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public User register(UserParam param) throws Exception {
        User user = new User();
        BeanUtils.copyProperties(param, user, CommonUtils.getNullPropertyNames(param));
        String password = param.getPassword();
        user.setPassword(passwordEncoder.encode(password));
        user.setCreateTime(new Date());
        userMapper.insert(user);
        return user;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.selectByUsername(username);
        return user;
    }

    @Override
    public List<User> list() throws Exception {
        return userMapper.selectAll();
    }
}
