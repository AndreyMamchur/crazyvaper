package com.crazyvaper.dao;

import com.crazyvaper.entity.Goods;

import java.util.List;

public interface GoodsDao {

    void save(Goods goods);

    Goods getGoodsById(int id);

    Goods getGoodsByName(String name);

    Goods update(Goods newGoods);

    List<Goods> getAll();

    void delete(int id);

    void delete(String name);
}
