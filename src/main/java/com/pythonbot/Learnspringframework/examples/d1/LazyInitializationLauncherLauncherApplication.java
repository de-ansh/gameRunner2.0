package com.pythonbot.Learnspringframework.examples.d1;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//import java.util.Arrays;



@Component
class ClassA{

}
@Component
@Lazy
class ClassB{
    private  ClassA classA;
    public  ClassB(ClassA classA){
        System.out.println("Some Initialization LOgic");
        this.classA= classA;
    }
    public void do_somthing(){
        System.out.println("Do Something");
    }
}
@Configuration
@ComponentScan("com.pythonbot.Learnspringframework.examples.d1")
public class LazyInitializationLauncherLauncherApplication {

    public static void main(String[] args) {
        //testing push
        try(var context=
                    new AnnotationConfigApplicationContext
                            (LazyInitializationLauncherLauncherApplication.class)){
            System.out.println("Initialization of context is complete");
            context.getBean(ClassB.class).do_somthing();
        }


        //var game= new SuperContraGame();
        //var game= new MarioGame();
       // var game= new PacmanGame();//1. Object Creation
       // var gameRunner= new GameRunner(game);//2. object creation + wiring of Dependencies
        //Game is a Dependency
        //gameRunner.run();
    }
}
