package com.crazyvaper.service;

import com.crazyvaper.dao.interfaces.PaymentDao;
import com.crazyvaper.entity.Payment;
import com.crazyvaper.service.interfaces.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public void save(Payment emtity) {
        paymentDao.save(emtity);
    }

    @Override
    public Payment getById(int id) {
        return paymentDao.getById(id);
    }

    @Override
    public Payment getByName(String name) {
        return paymentDao.getByName(name);
    }

    @Override
    public void update(Payment entity) {
        paymentDao.update(entity);
    }

    @Override
    public Collection<Payment> getAll() {
        return paymentDao.getAll();
    }

    @Override
    public void delete(int id) {
        paymentDao.delete(paymentDao.getById(id));
    }
}
