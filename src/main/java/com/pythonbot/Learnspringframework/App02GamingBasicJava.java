package com.pythonbot.Learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingBasicJava {
    public static void main(String[] args) {
        try(var context=
                    new AnnotationConfigApplicationContext
                            (GamingConfiguaration.class)){
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
