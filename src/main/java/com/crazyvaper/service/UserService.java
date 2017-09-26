package com.crazyvaper.service;

import com.crazyvaper.entity.User;

import java.util.List;

public interface UserService {
    void save(User user);

    User getById(int id);

    User getByName(String name);

    User update(User newUser);

    List<User> getAll();

    void delete(int id);

    void delete(String name);
}
