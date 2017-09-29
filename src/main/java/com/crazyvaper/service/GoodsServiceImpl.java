package com.crazyvaper.service;

import com.crazyvaper.dao.interfaces.GoodsDao;
import com.crazyvaper.entity.Goods;
import com.crazyvaper.service.interfaces.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public Goods getById(int id) {
        return goodsDao.getGoodsById(id);
    }

    @Override
    public Goods getByName(String name) {
        return goodsDao.getGoodsByName(name);
    }

    @Override
    public List<Goods> getAll() {
        return goodsDao.getAll();
    }

    @Override
    public void save(Goods goods) {
        goodsDao.save(goods);
    }

    @Override
    public void delete(int id) {
        goodsDao.delete(id);
    }

    @Override
    public void delete(String name) {

    }

    @Override
    public Goods update(Goods goods) {
        return goodsDao.update(goods);
    }

}
