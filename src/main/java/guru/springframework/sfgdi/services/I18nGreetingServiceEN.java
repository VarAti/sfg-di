package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18n")
@Profile("EN")
public class I18nGreetingServiceEN implements GreetingService{

    @Override
    public String sayHello() {
        return "Hello World !!!";
    }
}
