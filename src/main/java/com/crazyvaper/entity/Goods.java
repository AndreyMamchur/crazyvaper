package com.crazyvaper.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "goods")
public class Goods implements Comparable<Goods> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goods_id", nullable = false)
    private long id;

    @Column(nullable = false)
    private String name;

//    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private String brands;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TypeOfGoods typeOfGoods;

//    @Column(nullable = false)
    private String image;

    @Column(length = 400)
    private String prodDescription;

    @Column(nullable = false)
    private double price;

    @Column(name = "updatedTime")
    private Date updatedTime;

    @ManyToMany(mappedBy="goodsList",fetch=FetchType.EAGER)
    private List<Basket> basketList;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public TypeOfGoods getTypeOfGoods() {
        return typeOfGoods;
    }

    public void setTypeOfGoods(TypeOfGoods typeOfGoods) {
        this.typeOfGoods = typeOfGoods;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getProdDescription() {
        return prodDescription;
    }

    public void setProdDescription(String prodDescription) {
        this.prodDescription = prodDescription;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public List<Basket> getBasketList() {
        return basketList;
    }

    public void setBasketList(List<Basket> basketList) {
        this.basketList = basketList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public int compareTo(Goods o) {
        return (int)(this.price - o.price);
    }
}
