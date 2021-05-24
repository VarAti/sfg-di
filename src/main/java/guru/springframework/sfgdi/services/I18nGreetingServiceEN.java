package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositrories.EnglishGreetingRepository;

public class I18nGreetingServiceEN implements GreetingService{

    private final EnglishGreetingRepository englishGreetingRepository;

    

    public I18nGreetingServiceEN(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }



    @Override
    public String sayHello() {
        return englishGreetingRepository.sayGreeting();
    }
}
