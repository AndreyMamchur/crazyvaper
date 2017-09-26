package com.crazyvaper.service;

import com.crazyvaper.entity.Goods;

import java.util.List;

public interface GoodsService {

    void save(Goods goods);

    Goods getById(int id);

    Goods getByName(String name);

    Goods update(Goods newGoods);

    List<Goods> getAll();

    void delete(int id);

    void delete(String name);
}
