package com.example.java_spring_guillermo_vaca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class JavaSpringGuillermoVacaApplication {
    public static void main(String[] args) {
        SpringApplication.run(JavaSpringGuillermoVacaApplication.class, args);
    }
}