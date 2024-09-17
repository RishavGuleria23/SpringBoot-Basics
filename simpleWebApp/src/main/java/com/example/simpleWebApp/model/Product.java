package com.example.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

//@Data
//@AllArgsConstructor
@Component
@Entity
public class Product {
    @Id
    private int prodID;
    private String prodName;
    private int price;

    public Product() {
    }

    public Product(int prodID, String prodName, int price) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.price = price;
    }

    public int getProdID() {

        return prodID;
    }

    public void setProdID(int prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String  toString() {
        return "Product{" +
                "prodID=" + prodID +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }
}
