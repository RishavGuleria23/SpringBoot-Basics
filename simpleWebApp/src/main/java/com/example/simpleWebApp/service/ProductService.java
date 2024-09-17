package com.example.simpleWebApp.service;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
//    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101,"IPhone",50000),
//                                           new Product(102,"camera",70000),
//                                           new Product(103,"mic",1000)));
    public List <Product> getProducts(){

        return repo.findAll();
    }

    public Product getProductById(int prodId) {
//        for (Product p : products) {
//            if (p.getProdID() == prodId) {
//                return p;
//            }
//        }
//        // If product not found, you can handle it here (e.g., return null or throw an exception)
     return repo.findById(prodId).orElse(new Product());
    }
    public void addProduct(Product prod){

        repo.save(prod);
    }

    public void updateProduct(Product prod) {
//        int index =0;
//        for (int i = 0;i< products.size();i++)
//            if (products.get(i).getProdID() == prod.getProdID())
//                index = i;
//
//        products.set(index,prod);
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
//        boolean found = false;  // Flag to track if the product is found
//
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getProdID() == prodId) {
//                products.remove(i);  // Remove the product at the found index
//                found = true;  // Set found flag to true
//                break;  // Exit the loop once the product is removed
//            }
//        }
//
//        if (!found) {
//            System.out.println("Product not found.");
//        }
        repo.deleteById(prodId);
    }

}
