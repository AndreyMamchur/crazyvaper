package com.crazyvaper.service;

import com.crazyvaper.dao.interfaces.GoodsDao;
import com.crazyvaper.entity.Goods;
import com.crazyvaper.service.interfaces.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public void save(Goods emtity) {
        goodsDao.save(emtity);
    }

    @Override
    public Goods getById(int id) {
        return goodsDao.getById(id);
    }

    @Override
    public Goods getByName(String name) {
        return goodsDao.getByName(name);
    }

    @Override
    public void update(Goods entity) {
        goodsDao.update(entity);
    }

    @Override
    public Collection<Goods> getAll() {
        return goodsDao.getAll();
    }

    @Override
    public void delete(int id) {
        goodsDao.delete(goodsDao.getById(id));
    }
}
