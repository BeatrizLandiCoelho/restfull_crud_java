package com.example.demoz.Controllers;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {
        @Autowired DataSource dataSource;

  
        @GetMapping("/dbstatus")
    public String getDbStatus() {
        try (Connection connection = dataSource.getConnection()) {
            return "Conexão com o banco de dados estabelecida!";
        } catch (SQLException e) {
            return "Erro ao conectar ao banco de dados: " + e.getMessage();
        }
    }
}
