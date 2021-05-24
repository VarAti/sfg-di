package guru.springframework.sfgdi.repositrories;

public class EnglishGreetingRepositoryImp implements EnglishGreetingRepository{

    @Override
    public String sayGreeting() {        
      return "Hello World !!! - from repo";
    }
    
}
