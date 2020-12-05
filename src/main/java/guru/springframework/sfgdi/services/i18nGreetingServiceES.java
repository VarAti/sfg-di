package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18n")
@Profile("ES")
public class i18nGreetingServiceES implements GreetingService{

    @Override
    public String sayHello() {
        return "Hola Mundo !!!";
    }
}
