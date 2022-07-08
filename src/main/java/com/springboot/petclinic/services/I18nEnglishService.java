package com.springboot.petclinic.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18n")
@Profile({"EN","default"})
public class I18nEnglishService implements DependencyTest {
    @Override
    public String sayHi() {
        return "Hi - EN";
    }
}
