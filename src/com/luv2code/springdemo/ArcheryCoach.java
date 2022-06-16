package com.luv2code.springdemo;

public class ArcheryCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public ArcheryCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Shoot 25 arrows from 10 meters, 25 arrows from 20 meters, and 25 arrows from 30 meters.";
	}

	@Override
	public String getDailyFortune() {
		return "Hit, must the arrow. Maybe..." + fortuneService.getFortune();
	}

}
