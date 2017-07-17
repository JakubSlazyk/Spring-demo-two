package com.github.jakubslazyk.springdemo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args){
		
		//read spring config java classs
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call new method to get fortune
		System.out.println(theCoach.getDailyFortune());
		
		//call our new swim coach methods
		System.out.println("Email:"+theCoach.getEmail());
		System.out.println("Team:"+theCoach.getTeam());
		
		//close the context
		context.close();
		
	}
	
}
