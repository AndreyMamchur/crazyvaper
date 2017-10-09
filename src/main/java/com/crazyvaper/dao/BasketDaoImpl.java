package com.crazyvaper.dao;

import com.crazyvaper.dao.interfaces.BasketDao;
import com.crazyvaper.entity.Basket;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;

@Repository
public class BasketDaoImpl implements BasketDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(Basket emtity) {
        entityManager.persist(emtity);
    }

    @Override
    public Basket getById(long id) {
        return entityManager.createQuery("SELECT b FROM Basket b WHERE id=:id", Basket.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    @Transactional
    public void update(Basket entity) {
        entityManager.merge(entity);
    }

    @Override
    public List<Basket> getAll() {
        return entityManager.createQuery("SELECT b FROM Basket b", Basket.class).getResultList();
    }

    @Override
    @Transactional
    public void delete(long id) {
        entityManager.remove(getById(id));
    }
}
