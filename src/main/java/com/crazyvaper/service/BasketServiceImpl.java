package com.crazyvaper.service;

import com.crazyvaper.dao.interfaces.BasketDao;
import com.crazyvaper.entity.Basket;
import com.crazyvaper.service.interfaces.BasketServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class BasketServiceImpl implements BasketServise {

    @Autowired
    private BasketDao basketDao;

    @Override
    public void save(Basket emtity) {
        basketDao.save(emtity);
    }

    @Override
    public Basket getById(long id) {
        return basketDao.getById(id);
    }

    @Override
    public void update(Basket entity) {
        basketDao.update(entity);
    }

    @Override
    public List<Basket> getAll() {
        return basketDao.getAll();
    }

    @Override
    public void delete(long id) {
        basketDao.delete(id);
    }
}
