/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.augustomesquita.myapigraphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author augusto
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.augustomesquita.myapigraphql")
public class JApplication {

    public static void main(String[] args) {
        SpringApplication.run(JApplication.class, args);
    }

}