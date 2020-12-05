package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorInjectedGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
       setterInjectedController = new SetterInjectedController();
       setterInjectedController.setGreetingService(new ConstructorInjectedGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(setterInjectedController.getGreeting());
    }
}