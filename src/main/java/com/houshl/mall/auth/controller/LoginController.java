package com.houshl.mall.auth.controller;

import com.houshl.mall.auth.response.ObjectResponse;
import com.houshl.mall.auth.response.ResponseUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author houshuanglong
 * @date 2018/9/14
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    public ObjectResponse login() throws Exception {
        return ResponseUtils.ok();
    }

}
