package com.crazyvaper.service;

import com.crazyvaper.dao.interfaces.PaymentDao;
import com.crazyvaper.entity.Payment;
import com.crazyvaper.service.interfaces.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public void save(Payment emtity) {
        paymentDao.save(emtity);
    }

    @Override
    public Payment getById(long id) {
        return paymentDao.getById(id);
    }

    @Override
    public void update(Payment entity) {
        paymentDao.update(entity);
    }

    @Override
    public List<Payment> getAll() {
        return paymentDao.getAll();
    }

    @Override
    public void delete(long id) {
        paymentDao.delete(id);
    }
}
