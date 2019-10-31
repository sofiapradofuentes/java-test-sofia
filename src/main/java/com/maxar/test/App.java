package com.maxar.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
    Description: Java test application that will be deployed as part of an integration test. It will create a txt file with N
    number of lines every N number of seconds.
    Author: Sofia Prado
 */
@SpringBootApplication
public class App 
{
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
