package com.crazyvaper.entity;

import org.springframework.web.bind.annotation.Mapping;

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

    @Column(name = "user_id")
    private long userId;

    @ManyToOne(optional=false)
    @JoinColumn(name="user_id",referencedColumnName="user_id", insertable = false, updatable = false)
    private User user;

    @Column(name = "totalPrice", precision = 2)
    private double totalPrice;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status = Status.WORKING;

    @Column(name = "basket_id")
    private long basketId;

    @OneToOne(optional=false)
    @JoinColumn(name = "basket_id", referencedColumnName = "basket_id", insertable = false, updatable = false)
    private Basket basket;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
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
