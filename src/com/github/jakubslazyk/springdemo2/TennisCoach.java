package com.github.jakubslazyk.springdemo2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("databaseFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach(){
		System.out.println(">> inside default constructor");
	}
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService){
		fortuneService=theFortuneService;
	}*/
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
	/*@Autowired
	public void doSomeStuff(FortuneService fortuneService) {
		System.out.println("Inside:"+this);
		this.fortuneService = fortuneService;
	}*/
	//init method
	@PostConstruct
	public void doMyStartupStudd(){
		System.out.println(">> TennisCoach:inside of doMyStartupStuff()");
	}
	//destroy method
	@PreDestroy
	public void doMyCleanupStudd(){
		System.out.println(">> TennisCoach:inside of doMyCleanupStuff()");
	}
	
	
	
	
	
	

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
