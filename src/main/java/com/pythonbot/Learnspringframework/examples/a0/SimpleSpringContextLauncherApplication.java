package com.pythonbot.Learnspringframework.examples.a0;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
@ComponentScan("com.pythonbot.Learnspringframework.examples.a1")
public class SimpleSpringContextLauncherApplication {

    public static void main(String[] args) {
        try(var context=
                    new AnnotationConfigApplicationContext
                            (SimpleSpringContextLauncherApplication.class)){
                    Arrays.stream(context.getBeanDefinitionNames())
                            .forEach(System.out::println);
        }


        //var game= new SuperContraGame();
        //var game= new MarioGame();
       // var game= new PacmanGame();//1. Object Creation
       // var gameRunner= new GameRunner(game);//2. object creation + wiring of Dependencies
        //Game is a Dependency
        //gameRunner.run();
    }
}
