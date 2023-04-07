package com.pythonbot.Learnspringframework;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        //var game= new SuperContraGame();
        //var game= new MarioGame();
        var game= new PacmanGame();//1. Object Creation
        var gameRunner= new GameRunner(game);//2. object creation + wiring of Dependencies
        //Game is a Dependency
        gameRunner.run();
    }
}
