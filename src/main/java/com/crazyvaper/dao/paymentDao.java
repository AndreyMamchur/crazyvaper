package com.crazyvaper.dao;

import com.crazyvaper.entity.Payment;

import java.util.List;

public interface paymentDao {

    void save(Payment payment);

    Payment getPaymentById(int id);

    Payment getPaymentByName(String name);

    Payment update(Payment newPayment);

    List<Payment> getAll();

    void delete(int id);

    void delete(String name);
}
