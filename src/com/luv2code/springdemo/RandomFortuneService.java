package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String[] myFortunes = {"May the force be with you.", "You shall not pass !", "Signs point to yes."};

	@Override
	public String getFortune() {
		int random = new Random().nextInt(myFortunes.length);
		return myFortunes[random];
	}

}
