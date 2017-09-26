package com.crazyvaper.service;

import com.crazyvaper.dao.UserDao;
import com.crazyvaper.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public User getByName(String name) {
        return userDao.getUserByName(name);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }



    @Override
    public void delete(int id) {
        userDao.delete(id);
    }

    @Override
    public void delete(String name) {
        userDao.delete(name);
    }

    @Override
    public User update(User user) {
        return userDao.update(user);
    }
}
