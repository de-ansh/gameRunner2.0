package com.pythonbot.Learnspringframework.examples.a1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//Field INJECTION-> dependency injected using field (no setter or Constructor)
@Component
class YourBusinessClass{




    Dependency1 dependency1;
//    @Autowired
  //  public void setDependency1(Dependency1 dependency1) {
    //    System.out.println("Setter Injection 1");
      //  this.dependency1 = dependency1;
    //}
    //@Autowired
    //public void setDependency2(Dependency2 dependency2) {
      //  this.dependency2 = dependency2;
        //System.out.println("Setter Injection 2");
    //}


    Dependency2 dependency2;
    @Autowired
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
        System.out.println("Constructor injection Your business class");
    }

    public String toString(){
        return "Using "+ dependency1 + "and "+ dependency2;
    }
}
@Component
class Dependency1{}
@Component
class Dependency2{}

@Configuration
@ComponentScan("com.pythonbot.Learnspringframework.examples.a1")
public class DependencyInjectionLauncherApplication {

    public static void main(String[] args) {
        try(var context=
                    new AnnotationConfigApplicationContext
                            (DependencyInjectionLauncherApplication.class)){
                    Arrays.stream(context.getBeanDefinitionNames())
                            .forEach(System.out::println);
            System.out.println(context.getBean(YourBusinessClass.class));
        }


        //var game= new SuperContraGame();
        //var game= new MarioGame();
       // var game= new PacmanGame();//1. Object Creation
       // var gameRunner= new GameRunner(game);//2. object creation + wiring of Dependencies
        //Game is a Dependency
        //gameRunner.run();
    }
}
