package com.springboot.petclinic.services;

import org.springframework.stereotype.Service;

@Service
public class SetterDependencyImpl implements DependencyTest {


    @Override
    public String sayHi() {
        return "from setter hello";
    }
}
