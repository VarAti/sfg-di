package guru.springframework.sfgdi.services;


import org.springframework.stereotype.Service;

@Service("propertyInjected")
public class PropertyInjectedGreetingServiceImpl implements GreetingService{
    @Override
    public String sayHello() {
        return "Hello World ! - Property";
    }
}
