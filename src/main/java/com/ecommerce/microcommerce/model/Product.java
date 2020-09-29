package com.ecommerce.microcommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//@JsonIgnoreProperties(value = {"manufacturingPrice", "id"})
public class Product {
    @Id
    @GeneratedValue
    //Do not display
    private int id;

    private String name;

    private int price;

    //Do not display
    private int manufacturingPrice;

    public Product(int id, String name, int price, int manufacturingPrice) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturingPrice = manufacturingPrice;
    }

    public Product(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getManufacturingPrice() {
        return manufacturingPrice;
    }

    public void setManufacturingPrice(int manufacturingPrice) {
        this.manufacturingPrice = manufacturingPrice;
    }

    @Override
    public String toString(){
        return "Product{"+
                "id=" + id +
                ", nom='"+ name + '\'' +
                ", prix=" + price + '}' +
                ", prix de manufacture" + manufacturingPrice;
    }
}
