package com.springboot.petclinic.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String yellHello(){
        System.out.println("hello");
        return "Hi";
    }

}
