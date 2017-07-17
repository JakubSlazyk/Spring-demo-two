package com.github.jakubslazyk.springdemo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach alfaCoach = context.getBean("tennisCoach",Coach.class);
		
		//check if they are the same

		System.out.println("Is equal:"+(theCoach==alfaCoach));
		
		System.out.println("Memory theCoach: "+theCoach);
		System.out.println("\nMemory alfCoach: "+alfaCoach);
		
		//close context
		context.close();
	}

}
