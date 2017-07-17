package com.github.jakubslazyk.springdemo2;

public class DecentFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "It's decent day";
	}

}
