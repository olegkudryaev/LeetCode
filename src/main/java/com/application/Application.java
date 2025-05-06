package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        String n = "123";
        method(n);  
        System.out.println(n);
        System.out.println(n);
    }

    public static void method(String n){
        System.out.println(n);
    }

}
