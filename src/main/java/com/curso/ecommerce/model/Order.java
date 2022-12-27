package com.curso.ecommerce.model;

import java.util.Date;

public class Order {
    private long id;
    private String code;
    private Date createdDate;
    private Date receivedDate;
    private double total;

    public Order() {
    }

    public Order(long id, String code, Date createdDate, Date receivedDate, double total) {
        this.id = id;
        this.code = code;
        this.createdDate = createdDate;
        this.receivedDate = receivedDate;
        this.total = total;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
