package com.springboot.petclinic.controllers;

import com.springboot.petclinic.services.DependencyTest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final DependencyTest dependencyTest;

    public I18nController(@Qualifier("i18n") DependencyTest dependencyTest) {
        this.dependencyTest = dependencyTest;
    }

    public String sayFromServices(){
        return dependencyTest.sayHi();
    }
}
