package com.crazyvaper.dao;

import com.crazyvaper.entity.User;

import java.util.List;

public interface UserDao {

    void save(User user);

    User getUserById(int id);

    User getUserByName(String name);

    User update(User newUser);

    List<User> getAll();

    void delete(int id);

    void delete(String name);
}