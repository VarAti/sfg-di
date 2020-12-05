package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("propertyInjected")
public class PropertyInjectedGreetingServiceImpl implements GreetingService{
    @Override
    public String sayHello() {
        return "Hello World ! - Property";
    }
}
