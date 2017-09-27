package com.crazyvaper.entity;

import javax.persistence.*;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.List;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "payment_id")
    private int id;

    @Column(name = "user_id")
    private long userId;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Goods> paymentList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Goods> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Goods> paymentList) {
        this.paymentList = paymentList;
    }

}
