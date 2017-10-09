package com.crazyvaper.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "basket")
public class Basket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "basket_id", nullable = false)
    private long id;

    @OneToOne(optional=false,cascade=CascadeType.ALL, mappedBy="basket", targetEntity = Payment.class)
    private Payment payment;

    @ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER, targetEntity = Goods.class)
    @JoinColumn(name = "goods_id", referencedColumnName = "goods_id")
    private List<Goods> goodsList = new ArrayList<>();

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
