package com.pythonbot.Learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
       //Launch a Spring Context -
        try(var context=
                    new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
            System.out.println( context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean(Address.class));
            System.out.println(context.getBean(Person.class));

            // we will find the answer now about the error we got due to beans
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3ParaMeters"));
            // Arrays.stream( context.getBeanDefinitionNames()).forEach(System.out::println);
        }

        //Configure the things that we want Spring Framework to manage- @configurationClass
        //Hello WorldConfiguration - @Configuration
        //name - @Bean

        //Retrieving Beans managed by Spring

        //Spring container :manages spring beans and their life cycles
        //Spring container/spring context/ spring ios container are the same
        //Types of String container:
        //1. Bean Factory   : Basic Spring      Container
        // 2.Application Context: Advance Container with enterprise-specific features
        //Easy to use in web, Easy internationalization, easy integration with spring aop
        //


    }
}
