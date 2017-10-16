package com.crazyvaper.dao;

import com.crazyvaper.dao.interfaces.CartDao;
import com.crazyvaper.entity.Cart;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CartDaoImpl implements CartDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(Cart emtity) {
        entityManager.persist(emtity);
    }

    @Override
    public Cart getById(long id) {
        return entityManager.createQuery("SELECT c FROM Cart c WHERE c.id=:id", Cart.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    @Transactional
    public void update(Cart entity) {
        entityManager.merge(entity);
    }

    @Override
    public List<Cart> getAll() {
        return entityManager.createQuery("SELECT c FROM Cart c", Cart.class).getResultList();
    }

    @Override
    @Transactional
    public void delete(long id) {
        entityManager.remove(getById(id));
    }
}
