package com.springboot.petclinic.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryImpl implements DependencyTest {
    @Override
    public String sayHi(){
        return "hello from primary bean";
    }
}
