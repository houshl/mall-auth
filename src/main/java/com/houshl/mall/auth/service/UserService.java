package com.houshl.mall.auth.service;

import com.houshl.mall.auth.model.User;
import com.houshl.mall.auth.param.AuthorizationParam;
import com.houshl.mall.auth.param.UserParam;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * Created by houshuanglong on 2018/8/30.
 */
public interface UserService extends UserDetailsService {

    /**
     * @param param
     * @throws Exception
     */
    User register(UserParam param) throws Exception;

    /**
     * @return
     * @throws Exception
     */
    List<User> list() throws Exception;

}
