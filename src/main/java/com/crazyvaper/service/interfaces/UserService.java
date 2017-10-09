package com.crazyvaper.service.interfaces;

import com.crazyvaper.entity.User;

import java.util.List;

public interface UserService extends IService<User> {

    User getByName(String name);
}
