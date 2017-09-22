package com.crazyvaper.config;

import com.crazyvaper.dao.UserDao;
import com.crazyvaper.dao.UserDaoImpl;
import com.crazyvaper.service.UserService;
import com.crazyvaper.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public UserService getUserService(){
        return new UserServiceImpl();
    }

    @Bean
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
