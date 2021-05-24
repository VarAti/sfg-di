package guru.springframework.sfgdi.services;

public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayHello() {
        return "Hello World ! - Property";
    }
}
