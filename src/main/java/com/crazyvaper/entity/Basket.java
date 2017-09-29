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

    @OneToMany(targetEntity = Goods.class)
    private Collection<Goods> goods = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Collection<Goods> getGoods() {
        return goods;
    }

    public void setGoods(Collection<Goods> goods) {
        this.goods = goods;
    }
}
