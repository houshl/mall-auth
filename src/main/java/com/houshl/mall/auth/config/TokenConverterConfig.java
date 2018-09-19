package com.houshl.mall.auth.config;

import com.houshl.mall.auth.common.JwtTokenEnhancer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

@Configuration
public class TokenConverterConfig {

    @Bean
    JwtAccessTokenConverter jwtAccessTokenConverter() {
        JwtAccessTokenConverter jwtAccessTokenConverter = new JwtAccessTokenConverter();
        jwtAccessTokenConverter.setSigningKey("nicai");
        return jwtAccessTokenConverter;
    }

    @Bean
    JwtTokenEnhancer jwtTokenEnhancer() {
        JwtTokenEnhancer jwtTokenEnhancer = new JwtTokenEnhancer();
        return jwtTokenEnhancer;
    }
}
