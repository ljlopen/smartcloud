package com.julong.cloud.smartauth.config;

import com.julong.cloud.smartcommon.exception.ExceptionHandle;
import com.julong.cloud.smartcommon.jdbc.JdbcPageKit;
import com.julong.cloud.smartcommon.jwt.JwtTokenUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by Administrator on 2018/4/23/023.
 */
@Configuration
public class AppConfig {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public JdbcPageKit jdbcPageKit(){
        return new JdbcPageKit();
    }
    @Bean
    public JwtTokenUtil jwtTokenUtil(){
        return new JwtTokenUtil();
    }

    @Bean
    ExceptionHandle exceptionHandle() {
        return new ExceptionHandle();
    }
}
