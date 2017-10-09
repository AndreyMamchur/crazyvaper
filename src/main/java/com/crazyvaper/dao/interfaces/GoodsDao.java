package com.crazyvaper.dao.interfaces;

import com.crazyvaper.entity.Goods;
import com.crazyvaper.entity.TypeOfGoods;

import java.util.List;

public interface GoodsDao extends IDAO<Goods> {

    Goods getByName(String name);

    List<Goods> getGoodsListByType(TypeOfGoods typeOfGoods);
}
