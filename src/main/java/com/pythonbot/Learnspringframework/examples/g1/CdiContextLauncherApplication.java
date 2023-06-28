package com.pythonbot.Learnspringframework.examples.g1;


import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

//@Component
@Named
class BusinessService{
    DataService dataService;

   // @Autowired
    @Inject
    public void setDataService(DataService dataService) {
        System.out.println("Setter Injection is performed");
        this.dataService = dataService;
    }
    public DataService getDataService() {

        return dataService;
    }


}

//@Component
@Named
class DataService{

}

@Configuration
@ComponentScan("com.pythonbot.Learnspringframework.examples.g1")
public class CdiContextLauncherApplication {

    public static void main(String[] args) {
        try(var context=
                    new AnnotationConfigApplicationContext
                            (CdiContextLauncherApplication.class)){
                    Arrays.stream(context.getBeanDefinitionNames())
                            .forEach(System.out::println);
            System.out.println(context.getBean(BusinessService.class).getDataService());
        }


        //var game= new SuperContraGame();
        //var game= new MarioGame();
       // var game= new PacmanGame();//1. Object Creation
       // var gameRunner= new GameRunner(game);//2. object creation + wiring of Dependencies
        //Game is a Dependency
        //gameRunner.run();
    }
}
