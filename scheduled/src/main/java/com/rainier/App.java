package com.rainier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication(scanBasePackages = {"com.rainier"})
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World scheduled!");
        SpringApplication.run(App.class);
    }
}
