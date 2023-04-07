package com.pythonbot.Learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguaration {
    @Bean
    public GamingConsole game(){
        var game= new PacmanGame();
        return  game;
    }
    @Bean
    public GameRunner gameRunner(GamingConsole game){
        //var game= new PacmanGame();
        var gameRunner= new GameRunner(game);
        return  gameRunner;
    }
    //var game= new SuperContraGame();
    //var game= new MarioGame();
  //  var game= new PacmanGame();//1. Object Creation
   // var gameRunner= new GameRunner(game);//2. object creation + wiring of Dependencies
    //Game is a Dependency
   //     gameRunner.run();
}
