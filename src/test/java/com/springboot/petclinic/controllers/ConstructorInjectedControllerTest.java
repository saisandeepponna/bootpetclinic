package com.springboot.petclinic.controllers;

import com.springboot.petclinic.services.ConstructorDependencyImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorDependencyImpl());
    }

    @Test
    void getConstructorInjectedController() {
        System.out.println(controller.getConstructorInjectedController());
    }
}