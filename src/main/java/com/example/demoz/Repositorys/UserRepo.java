package com.example.demoz.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.Long;

import com.example.demoz.Models.User;

public interface UserRepo extends JpaRepository<User, Long > {
    
}
