package com.github.jakubslazyk.springdemo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigGolfDemoApp {
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new
				AnnotationConfigApplicationContext(GoldConfig.class);
		Coach golf = context.getBean("golfCoach",GolfCoach.class);
		System.out.println(golf.getDailyFortune());
		System.out.println(golf.getDailyWorkout());
	}
}
