package com.github.jakubslazyk.springdemo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GoldConfig {

	@Bean
	public FortuneService decentFortuneService(){
		return new DecentFortuneService();
	}
	@Bean
	public Coach golfCoach()
	{
		return new GolfCoach(decentFortuneService());
	}
}
