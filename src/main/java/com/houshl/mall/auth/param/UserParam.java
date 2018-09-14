package com.houshl.mall.auth.param;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
public class UserParam {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String mobile;

}