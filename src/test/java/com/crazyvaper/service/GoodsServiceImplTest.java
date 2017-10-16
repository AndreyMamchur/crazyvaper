package com.crazyvaper.service;

import com.crazyvaper.config.JpaConfigTest;
import com.crazyvaper.config.SpringConfig;
import com.crazyvaper.entity.Goods;
import com.crazyvaper.entity.TypeOfGoods;
import com.crazyvaper.service.interfaces.GoodsService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Collection;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class, JpaConfigTest.class})
public class GoodsServiceImplTest extends TestCase {

    @Autowired
    private GoodsService goodsService;

    private Goods getTestUser(String name) {
        Goods goods = new Goods();
        goods.setName(name);
        goods.setPrice(1569);
        goods.setBrands("Adidas");
        goods.setTypeOfGoods(TypeOfGoods.ECIGS);
        return goods;
    }

    @Test
    public void save() throws Exception {
        Goods goods = getTestUser("Name");
        goodsService.save(goods);
        Goods goodsByName = goodsService.getByName("Name");
        assertNotNull(goodsByName);
        assertEquals(goods.getPrice(), goodsByName.getPrice());
        assertEquals(goods.getName(), goodsByName.getName());
        Goods goodsById = goodsService.getById(goodsByName.getId());
        assertNotNull(goodsById);
        assertEquals(goods.getPrice(), goodsById.getPrice());
        assertEquals(goods.getName(), goodsById.getName());
        goodsById.setPrice(1000);
        goodsById.setName("Name1");
        goodsService.update(goodsById);
        Collection<Goods> userList = goodsService.getAll();
        assertNotNull(userList);
        assertEquals(userList.size(), 1);
        goodsService.delete(goodsById.getId());
        userList = goodsService.getAll();
        assertEquals(userList.size(), 0);

    }

    @Test
    public void getById() throws Exception {
    }

    @Test
    public void getByName() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void getAll() throws Exception {
    }

    @Test
    public void delete() throws Exception {
    }

}