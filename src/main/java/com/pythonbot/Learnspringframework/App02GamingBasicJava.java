package com.pythonbot.Learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class GamingConfiguaration {
    @Bean
    public GamingConsole game(){
        return new PacmanGame();
    }
    @Bean
    public GameRunner gameRunner(GamingConsole game){
        //var game= new PacmanGame();
        return new GameRunner(game);
    }
    //var game= new SuperContraGame();
    //var game= new MarioGame();
    //  var game= new PacmanGame();//1. Object Creation
    // var gameRunner= new GameRunner(game);//2. object creation + wiring of Dependencies
    //Game is a Dependency
    //     gameRunner.run();
}
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
