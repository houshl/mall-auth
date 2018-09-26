package com.houshl.mall.auth.controller;

import com.houshl.mall.auth.response.ObjectResponse;
import com.houshl.mall.auth.response.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author houshuanglong
 * @date 2018/9/14
 */
@RestController
@RequestMapping("")
public class LoginController {

    @Autowired
    ConsumerTokenServices tokenServices;

    @RequestMapping("/logout")
    public ObjectResponse logout(String token) throws Exception {
        return ResponseUtils.ok(tokenServices.revokeToken(token));
    }

}
