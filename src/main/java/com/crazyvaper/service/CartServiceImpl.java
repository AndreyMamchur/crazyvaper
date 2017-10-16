package com.crazyvaper.service;

import com.crazyvaper.dao.interfaces.CartDao;
import com.crazyvaper.entity.Cart;
import com.crazyvaper.service.interfaces.CartServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartServise {

    @Autowired
    private CartDao cartDao;

    @Override
    public void save(Cart emtity) {
        cartDao.save(emtity);
    }

    @Override
    public Cart getById(long id) {
        return cartDao.getById(id);
    }

    @Override
    public void update(Cart entity) {
        cartDao.update(entity);
    }

    @Override
    public List<Cart> getAll() {
        return cartDao.getAll();
    }

    @Override
    public void delete(long id) {
        cartDao.delete(id);
    }
}
