package com.pythonbot.Learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record  Address(String firstLine, String City){}
record  Person(String name, int age , Address address){

}
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return  "Ansh";
    }
    @Bean
    public String name2(){
        return  "Angad";
    }
    @Bean
    public int age(){
        return  22;
    }
    @Bean
    public  Person person(){
        return  new Person("Ravi", 20, new Address("Kolkata", "West Bengal"));
    }
    @Bean(name= "address2")
    @Primary
    public Address address(){
        return new Address("Howrah,West Bengal", "Kolkata");
    }
    @Bean(name= "address3")
    @Qualifier("address3Qualifier")
    public Address address3(){
        return new Address("Ghoshpara", "Howrah");
    }
    @Bean
    public  Person person2MethodCall(){
        return  new Person(name(),age(), address());
    }
    @Bean
    public  Person person3ParaMeters(String name2, int age, Address address3){
        return  new Person(name2,age, address3);
    }
    @Bean
    @Primary
    public  Person person4ParaMeters(String name2, int age, Address address){
        return  new Person(name2,age, address);
    }
    @Bean
    @Qualifier("person5Qualifier")
    public  Person person5Qualifier(String name2, int age,@Qualifier("address3Qualifier") Address address){
        return  new Person(name2,age, address);
    }

}
