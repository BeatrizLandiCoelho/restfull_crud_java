package com.example.demoz.Models;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {

     //atributos
     @Id
     @GeneratedValue
     private Long id; 

     @NonNull
     private String name;

     @NonNull
     private String category;

     @NonNull
     private double price;

    //cosntrutor vazio
    public Product(){

    }

    //construtor
    public Product(String name, String category, double price){

        this.name = name;
        this.category = category;
        this.price = price;
        
    }

    //metodos
    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory (String category){
        this.category = category;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice (double price){
        this.price = price;
    }
   
    
}
