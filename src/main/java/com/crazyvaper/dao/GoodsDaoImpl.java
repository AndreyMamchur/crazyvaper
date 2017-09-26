package com.crazyvaper.dao;

import com.crazyvaper.entity.Goods;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class GoodsDaoImpl implements GoodsDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public void save(Goods goods) {
        entityManager.persist(goods);
    }

    @Override
    public Goods getGoodsById(int id) {
        return entityManager.createQuery("SELECT g FROM Goods g WHERE id=:id", Goods.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public Goods getGoodsByName(String name) {
        return entityManager.createQuery("SELECT g FROM Goods g WHERE name=:name", Goods.class)
                .setParameter("name", name)
                .getSingleResult();
    }

    @Override
    @Transactional
    public Goods update(Goods newGoods) {
        return entityManager.merge(newGoods);
    }

    @Override
    public List<Goods> getAll() {
        return entityManager.createQuery("SELECT g FROM Goods g", Goods.class).getResultList();
    }

    @Override
    @Transactional
    public void delete(int id) {
        entityManager.remove(getGoodsById(id));
    }

    @Override
    @Transactional
    public void delete(String name) {
        entityManager.remove(getGoodsByName(name));
    }
}
