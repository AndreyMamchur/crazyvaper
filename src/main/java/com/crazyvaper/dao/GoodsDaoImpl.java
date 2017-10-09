package com.crazyvaper.dao;

import com.crazyvaper.dao.interfaces.GoodsDao;
import com.crazyvaper.entity.Goods;
import com.crazyvaper.entity.TypeOfGoods;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class GoodsDaoImpl implements GoodsDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public void save(Goods goods) {
        entityManager.persist(goods);
    }

    @Override
    public Goods getById(long id) {
        return entityManager.createQuery("SELECT g FROM Goods g WHERE g.id=:id", Goods.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public Goods getByName(String name) {
        return entityManager.createQuery("SELECT g FROM Goods g WHERE g.name=:name", Goods.class)
                .setParameter("name", name)
                .getSingleResult();
    }

    @Override
    public List<Goods> getGoodsListByType(TypeOfGoods typeOfGoods) {
        return entityManager.createQuery("SELECT g FROM Goods g WHERE g.typeOfGoods=:typeOfGoods", Goods.class)
                .setParameter("typeOfGoods", typeOfGoods)
                .getResultList();
    }

    @Override
    @Transactional
    public void update(Goods goods) {
        entityManager.merge(goods);
    }

    @Override
    @Transactional
    public void delete(long id) {
        entityManager.remove(getById(id));
    }

    @Override
    public List<Goods> getAll() {
        return entityManager.createQuery("SELECT g FROM Goods g", Goods.class).getResultList();
    }
}
