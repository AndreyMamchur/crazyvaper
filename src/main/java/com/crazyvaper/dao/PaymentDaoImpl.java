package com.crazyvaper.dao;

import com.crazyvaper.dao.interfaces.PaymentDao;
import com.crazyvaper.entity.Payment;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PaymentDaoImpl implements PaymentDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public void save(Payment entity) {
        entityManager.persist(entity);
    }

    @Override
    public Payment getById(long id) {
        return entityManager.createQuery("SELECT p FROM Payment p WHERE p.id=:id", Payment.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    @Transactional
    public void update(Payment entity) {
        entityManager.merge(entity);
    }

    @Override
    @Transactional
    public void delete(long id) {
        entityManager.remove(getById(id));
    }

    @Override
    public List<Payment> getAll() {
        return entityManager.createQuery("SELECT p FROM Payment p", Payment.class).getResultList();
    }
}
