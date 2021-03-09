package com.example.demo02;

import com.example.beans.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @description:
 * @author: Tensh
 * @createDate: 2021/3/9
 */
@SpringBootApplication(scanBasePackages = "com.example")
public class Demo02Application {

    public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(Demo02Application.class, args);
        Pet pet = (Pet) run.getBean("pet");
        System.out.println(pet);
    }
}
