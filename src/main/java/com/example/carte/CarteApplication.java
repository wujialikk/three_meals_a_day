package com.example.carte;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.carte.mapper")
public class CarteApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarteApplication.class, args);
    }

}
