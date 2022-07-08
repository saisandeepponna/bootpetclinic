package com.springboot.petclinic;

import com.springboot.petclinic.controllers.ConstructorInjectedController;
import com.springboot.petclinic.controllers.I18nController;
import com.springboot.petclinic.controllers.MyController;
import com.springboot.petclinic.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


//@SpringBootApplication(scanBasePackages = {"com.springboot.petclinic", "com.springboot.petclinic.services"})
@SpringBootApplication


public class PetclinicApplication {

    public static void main(String[] args) {
      ApplicationContext applicationContext =  SpringApplication.run(PetclinicApplication.class, args);
        MyController myCtrl = (MyController)applicationContext.getBean("myController");
        //String sayHi = myCtrl.yellHello();
        //System.out.println(sayHi);
        System.out.println("profile test");
        I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
        System.out.println(i18nController.sayFromServices());



        System.out.println("controller spring ----");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getConstructorInjectedController());

        System.out.println("setter injected Implementation");
        SetterInjectedController setterInjectedController = (SetterInjectedController) applicationContext.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getSetterInjectedController());

    }

}
