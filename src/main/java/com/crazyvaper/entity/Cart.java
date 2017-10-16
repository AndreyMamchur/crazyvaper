package com.crazyvaper.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id", nullable = false)
    private long id;

    @OneToOne(optional=false,cascade=CascadeType.ALL, mappedBy="cart", targetEntity = Payment.class)
    private Payment payment;

    @ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER, targetEntity = Goods.class)
    @JoinColumn(name = "goods_id", referencedColumnName = "goods_id")
    private List<Goods> goodsList = new ArrayList<>();

    private double total;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

}
