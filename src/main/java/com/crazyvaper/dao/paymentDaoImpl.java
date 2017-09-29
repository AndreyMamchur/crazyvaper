package com.crazyvaper.dao;

import com.crazyvaper.dao.interfaces.PaymentDao;
import com.crazyvaper.entity.Payment;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class paymentDaoImpl implements PaymentDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(Payment payment) {
        entityManager.persist(payment);
    }

    @Override
    public Payment getPaymentById(int id) {
        return entityManager.createQuery("SELECT p FROM Payment p WHERE id=:id", Payment.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public Payment getPaymentByName(String name) {
        return entityManager.createQuery("SELECT p FROM Payment p WHERE name=:name", Payment.class)
                .setParameter("name", name)
                .getSingleResult();
    }

    @Override
    @Transactional
    public Payment update(Payment newPayment) {
        return entityManager.merge(newPayment);
    }

    @Override
    public List<Payment> getAll() {
        return entityManager.createQuery("SELECT p FROM Payment p", Payment.class).getResultList();
    }

    @Override
    @Transactional
    public void delete(int id) {
        entityManager.remove(getPaymentById(id));
    }

    @Override
    @Transactional
    public void delete(String name) {
        entityManager.remove(getPaymentByName(name));
    }
}
