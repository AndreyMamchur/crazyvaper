package com.crazyvaper.dao.interfaces;

import com.crazyvaper.entity.Goods;
import com.crazyvaper.entity.User;

import java.util.List;

public interface UserDao extends IDAO<User> {

    User getByName(String name);
}