package com.springboot.petclinic.controllers;

import com.springboot.petclinic.services.DependencyTest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
@Controller


public class ConstructorInjectedController {

    public DependencyTest dependencyTest;

    public ConstructorInjectedController( @Qualifier("constructorDependencyImpl") DependencyTest dependencyTest) {
        this.dependencyTest =  dependencyTest;

    }

    public String getConstructorInjectedController(){
        return dependencyTest.sayHi();
    }


}
