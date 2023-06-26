package com.pythonbot.Learnspringframework.examples.e1;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.pythonbot.Learnspringframework.examples.a1")
public class BeanScopeLauncherApplication {

    @Component
    class NormalClass{

    }

    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Component
    class PrototypeClass{

    }

    public static void main(String[] args) {
        try(var context=
                    new AnnotationConfigApplicationContext
                            (BeanScopeLauncherApplication.class)){
            System.out.println( context.getBean(NormalClass.class));
            System.out.println( context.getBean(NormalClass.class));
            System.out.println( context.getBean(NormalClass.class));
            System.out.println( context.getBean(NormalClass.class));
            System.out.println( context.getBean(PrototypeClass.class));
            System.out.println( context.getBean(PrototypeClass.class));
            System.out.println( context.getBean(PrototypeClass.class));
            System.out.println( context.getBean(PrototypeClass.class));
            System.out.println( context.getBean(PrototypeClass.class));
        }
        //Java singleton is not the same as of spring singlton
        //Spring singleton-> one object instance per spring IoC container
        //Java Singleton -> one object instance per jvm

        //var game= new SuperContraGame();
        //var game= new MarioGame();
       // var game= new PacmanGame();//1. Object Creation
       // var gameRunner= new GameRunner(game);//2. object creation + wiring of Dependencies
        //Game is a Dependency
        //gameRunner.run();
    }
}
