package com.github.jakubslazyk.springdemo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.github.jakubslazyk.springdemo2")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	//define bean fro sad fortune
	@Bean
	public FortuneService sadFortuneService(){
		return new SadFortuneService();
	}
	@Bean
	public Coach swimCoach(){
		return new SwimCoach(sadFortuneService());
	}
	//define bean for swim choach and dependency inject
}
