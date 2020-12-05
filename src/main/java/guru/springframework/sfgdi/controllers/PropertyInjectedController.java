package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.ConstructorInjectedGreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyInjected")
    public GreetingService greetingService = new ConstructorInjectedGreetingServiceImpl();

    public String getGreeting() {
        return greetingService.sayHello();
    }
}
