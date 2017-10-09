package com.crazyvaper.service;

import com.crazyvaper.config.JpaConfigTest;
import com.crazyvaper.config.SpringConfig;
import com.crazyvaper.entity.Payment;
import com.crazyvaper.entity.Status;
import com.crazyvaper.service.interfaces.PaymentService;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class, JpaConfigTest.class})
public class PaymentServiceImplTest extends TestCase {

    @Mock
    @Autowired
    private PaymentService paymentService;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void save() throws Exception {
        Payment payment = new Payment();
        payment.setStatus(Status.WORKING);
        paymentService.save(payment);

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