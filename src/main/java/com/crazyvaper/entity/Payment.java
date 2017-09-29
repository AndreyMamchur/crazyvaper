package com.crazyvaper.entity;

import javax.persistence.*;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id", nullable = false)
    private long id;

//    @ManyToOne(fetch = FetchType.EAGER, targetEntity = User.class)
//    @Column(name = "customer_id")
    @ManyToOne(targetEntity = User.class)
    private User customer;

    private Timestamp time;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status = Status.WORKING;

    @OneToOne(targetEntity = Basket.class)
//    @Column(name = "basket_id")
    private Basket basket;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }
}
