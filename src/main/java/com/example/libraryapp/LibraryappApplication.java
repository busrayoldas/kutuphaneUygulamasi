package com.example.libraryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.libraryapp")
public class LibraryappApplication {
    public static void main(String[] args) {
        SpringApplication.run(LibraryappApplication.class, args);
    }
}

