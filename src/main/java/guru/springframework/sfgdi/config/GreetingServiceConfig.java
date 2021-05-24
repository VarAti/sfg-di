package guru.springframework.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import guru.springframework.sfgdi.repositrories.EnglishGreetingRepository;
import guru.springframework.sfgdi.repositrories.EnglishGreetingRepositoryImp;
import guru.springframework.sfgdi.services.ConstructorGreetingService;
import guru.springframework.sfgdi.services.I18nGreetingServiceEN;
import guru.springframework.sfgdi.services.PrimaryGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.services.SetterInjectedGreetingService;
import guru.springframework.sfgdi.services.i18nGreetingServiceES;

@Configuration
public class GreetingServiceConfig {

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImp();
    }

    @Profile("EN")
    @Bean
    I18nGreetingServiceEN i18nGreetingService(EnglishGreetingRepository engRepo){
        return new I18nGreetingServiceEN(engRepo);
    }

    @Profile({"ES", "default"})
    @Bean("i18nGreetingService")
    i18nGreetingServiceES i18nSpanishGreetingService(){
        return new i18nGreetingServiceES();
    }

    @Bean("constructorInjected")
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean("propertyInjected")
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean("setterInjected")
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }
}
