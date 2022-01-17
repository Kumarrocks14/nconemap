package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NcOneInitializer {
    public static void main(String[] args) {
        SpringApplication.run(NcOneInitializer.class, args);
        System.out.println("Application is up & running...");
    }
}

