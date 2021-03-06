package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Qualifier("constructorInjected")
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World ! - Constructor";
    }
}
