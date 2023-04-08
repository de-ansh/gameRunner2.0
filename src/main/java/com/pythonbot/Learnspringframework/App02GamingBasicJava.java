package com.pythonbot.Learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.pythonbot.Learnspringframework")
public class App02GamingBasicJava {


    public static void main(String[] args) {
        try(var context=
                    new AnnotationConfigApplicationContext
                            (App02GamingBasicJava.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }


        //var game= new SuperContraGame();
        //var game= new MarioGame();
       // var game= new PacmanGame();//1. Object Creation
       // var gameRunner= new GameRunner(game);//2. object creation + wiring of Dependencies
        //Game is a Dependency
        //gameRunner.run();
    }
}
