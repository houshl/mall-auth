package com.houshl.mall.auth.mapper;

import com.houshl.mall.auth.model.User;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {

    User selectByUsername(String username);

}