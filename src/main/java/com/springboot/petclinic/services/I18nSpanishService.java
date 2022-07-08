package com.springboot.petclinic.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18n")
@Profile("ES")
public class I18nSpanishService implements DependencyTest {
    @Override
    public String sayHi() {
        return "HOLA - ES";
    }
}
