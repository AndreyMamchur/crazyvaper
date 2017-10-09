package com.crazyvaper.service.interfaces;

import com.crazyvaper.entity.Goods;
import com.crazyvaper.entity.TypeOfGoods;

import java.util.Collection;
import java.util.List;

public interface GoodsService extends IService<Goods> {

    Goods getByName(String name);

    List<Goods> sortByPrice(List<Goods> goodsList);

    List<Goods> sortByName(List<Goods> goodsList);

    List<Goods> getGoodsListByType(TypeOfGoods typeOfGoods);
}
