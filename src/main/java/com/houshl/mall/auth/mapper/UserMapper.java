package com.houshl.mall.auth.mapper;

import com.houshl.mall.auth.model.User;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {

    User selectByUsername(@Param("username") String username);

}