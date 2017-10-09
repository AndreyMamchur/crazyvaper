package com.crazyvaper.service;

import com.crazyvaper.dao.interfaces.UserDao;
import com.crazyvaper.entity.User;
import com.crazyvaper.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save(User emtity) {
        userDao.save(emtity);
    }

    @Override
    public User getById(long id) {
        return userDao.getById(id);
    }

    @Override
    public User getByName(String name) {
        return userDao.getByName(name);
    }

    @Override
    public void update(User entity) {
        userDao.update(entity);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public void delete(long id) {
        userDao.delete(id);
    }
}
