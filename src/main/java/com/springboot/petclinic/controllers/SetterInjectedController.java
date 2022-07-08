package com.springboot.petclinic.controllers;

import com.springboot.petclinic.services.DependencyTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    public DependencyTest dependencyTest;
    @Qualifier("setterDependencyImpl")
    @Autowired
    public void setDependencyTest(DependencyTest dependencyTest){
        this.dependencyTest = dependencyTest;
    }
    public String getSetterInjectedController(){
        return dependencyTest.sayHi();
    }
}
