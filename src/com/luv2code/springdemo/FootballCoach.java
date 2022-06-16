package com.luv2code.springdemo;

public class FootballCoach implements Coach {
	
	private RandomFortuneService fortuneService;
	
	public FootballCoach() {
		System.out.println("FootballCoach : inside no-arg constructor");
	};

	public void setFortuneService(RandomFortuneService fortuneService) {
		System.out.println("FootballCoach : inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Channel your inner Ronaldo.";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	
	//add init method
	public void goThroughInitInstructions() {
		System.out.println("FootballCoach : inside the init method goThroughInitInstructions");
	}
	
	//add destroy method
	public void goThroughDestroyInstructions() {
		System.out.println("FootballCoach : inside the init method goThroughDestroyInstructions");
	}

}
