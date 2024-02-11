package com.stemgon.models;

import java.util.Date;

public class Product {
    private int id;
    private String title;
    private double price;
    private Date dateUpdated;

    public Product(int id, String title, double price, Date dateUpdated) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.dateUpdated = dateUpdated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", dateUpdated=" + dateUpdated +
                '}';
    }
}
