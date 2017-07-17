package com.github.jakubslazyk.springdemo2;

public class GolfCoach implements Coach {

	
	public GolfCoach(FortuneService myFortuneService) {
		super();
		this.myFortuneService = myFortuneService;
	}

	private FortuneService myFortuneService;
	@Override
	public String getDailyWorkout() {
		return "Train,train,train";
	}

	@Override
	public String getDailyFortune() {
		
		return myFortuneService.getFortune();
	}

}
