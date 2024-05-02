package com.example.demoz.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {
    
    //atributos
    
    @Id
    @GeneratedValue
    private Long id;

    // @NotEmpty
    private String name;

    // @NotEmpty
    private String email;

    // @NotEmpty
    private String password;

    //construtor vazio

    public User(){

    }

    //construtor
    public User( String name, String email, String password){

        this.name = name;
        this.email = email;
        this.password = password;

    }

    //getters setters

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail (String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword (String password){
        this.password = password;
    }
    
    //metodos
}
