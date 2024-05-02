package com.example.demoz.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoz.Models.User;
import com.example.demoz.Repositorys.UserRepo;

@RestController
public class UserController {

    @Autowired UserRepo userRepository;
    
    @GetMapping("/teste")
    public String testeGetEndpoint(){
        return "teste funcionando";
    }
    
    @GetMapping("/allusers")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
