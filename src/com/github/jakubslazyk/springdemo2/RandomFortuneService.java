package com.github.jakubslazyk.springdemo2;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	private String[] data={
			"Bad",
			"Good",
			"Decent"
	};
	private Random random=new Random();
	
	@Override
	public String getFortune() {
		return data[random.nextInt(data.length)];
	}

}
