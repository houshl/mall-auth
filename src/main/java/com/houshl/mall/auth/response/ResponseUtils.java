package com.houshl.mall.auth.response;


import com.houshl.mall.auth.common.Constants;
import org.springframework.http.HttpStatus;

/**
 * Created by houshuanglong on 2018/7/23.
 */
public class ResponseUtils {

    public static ObjectResponse ok() {
        ObjectResponse response = new ObjectResponse(Constants.OK, "OK");
        return response;
    }

    public static ObjectResponse ok(Object data) {
        ObjectResponse response = new ObjectResponse(Constants.OK, "OK", data);
        return response;
    }

    public static ObjectResponse unAuth() {
        ObjectResponse response = new ObjectResponse(HttpStatus.UNAUTHORIZED.value(), "Unauthorized");
        return response;
    }

}
