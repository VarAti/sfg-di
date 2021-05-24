package guru.springframework.sfgdi.services;

public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayHello() {
        return "Hello World ! - Setter";
    }
}
