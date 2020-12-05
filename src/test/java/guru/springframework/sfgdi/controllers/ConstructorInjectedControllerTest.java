package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorInjectedGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorInjectedGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        controller.getGreeting();
    }
}