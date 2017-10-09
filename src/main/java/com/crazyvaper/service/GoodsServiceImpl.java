package com.crazyvaper.service;

import com.crazyvaper.dao.interfaces.GoodsDao;
import com.crazyvaper.entity.Goods;
import com.crazyvaper.entity.TypeOfGoods;
import com.crazyvaper.service.interfaces.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
    public Goods getById(long id) {
        return goodsDao.getById(id);
    }

    @Override
    public Goods getByName(String name) {
        return goodsDao.getByName(name);
    }

    @Override
    public List<Goods> sortByPrice(List<Goods> goodsList) {
        Collections.sort(goodsList);
        return goodsList;
    }

    @Override
    public List<Goods> sortByName(List<Goods> goodsList) {
        Collections.sort(goodsList, new Comparator<Goods>() {
            public int compare(Goods o1, Goods o2) {
                if (o1.compareTo(o2) > 0) {
                    return -1;
                } else if (o1.compareTo(o2) < 0) {
                    return 1;
                } else {
                    return 0;
                }
            }

        });
        return goodsList;
    }

    @Override
    public List<Goods> getGoodsListByType(TypeOfGoods typeOfGoods) {
        return goodsDao.getGoodsListByType(typeOfGoods);
    }

    @Override
    public void update(Goods entity) {
        goodsDao.update(entity);
    }

    @Override
    public List<Goods> getAll() {
        return goodsDao.getAll();
    }

    @Override
    public void delete(long id) {
        goodsDao.delete(id);
    }


}
