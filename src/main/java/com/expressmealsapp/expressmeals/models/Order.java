package com.expressmealsapp.expressmeals.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Order {

    @Id
    @GeneratedValue
    private Long id;
    private Double orderTotal;
    private Date orderDate;
    private Date deliveryDate;

    public Order(){

    }

    public Order(Long id, Double orderTotal, Date orderDate, Date deliveryDate) {
        this.id = id;
        this.orderTotal = orderTotal;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderTotal=" + orderTotal +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                '}';
    }
}
