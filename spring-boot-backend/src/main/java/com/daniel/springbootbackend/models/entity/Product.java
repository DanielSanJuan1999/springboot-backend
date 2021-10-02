package com.daniel.springbootbackend.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="product", uniqueConstraints = {@UniqueConstraint(columnNames = { "id" })})
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String url_image;
    private float price;
    
    private int discount;
    private int category;

    //GET METHOD

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl_image() {
        return url_image;
    }

    public float getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }

    public int getCategory() {
        return category;
    }

    //SET METHOD

    public void setId(Long id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    private static final long serialVersionUID = 1L;

}
