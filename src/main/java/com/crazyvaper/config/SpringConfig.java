package com.crazyvaper.config;

import com.crazyvaper.dao.interfaces.GoodsDao;
import com.crazyvaper.dao.GoodsDaoImpl;
import com.crazyvaper.dao.interfaces.UserDao;
import com.crazyvaper.dao.UserDaoImpl;
import com.crazyvaper.service.interfaces.GoodsService;
import com.crazyvaper.service.GoodsServiceImpl;
import com.crazyvaper.service.interfaces.UserService;
import com.crazyvaper.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.crazyvaper.dao", "com.crazyvaper.service"})
public class SpringConfig {
}
