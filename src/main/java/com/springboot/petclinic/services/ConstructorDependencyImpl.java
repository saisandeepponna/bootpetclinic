package com.springboot.petclinic.services;


import org.springframework.stereotype.Service;

@Service


public class ConstructorDependencyImpl implements DependencyTest {
    public String sayHi(){
        return "hellllloooo from constuctor";
    }

}
