package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
		Coach archeryCoach = context.getBean("archeryCoach", Coach.class);
		Coach trackCoach = context.getBean("trackCoach", Coach.class);
		Coach cricketCoach = context.getBean("cricketCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(baseballCoach.getDailyWorkout());
		// call our new method for fortunes
		System.out.println(baseballCoach.getDailyFortune());
		// Call methods on other coaches
		System.out.println(archeryCoach.getDailyWorkout());
		System.out.println(archeryCoach.getDailyFortune());
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(trackCoach.getDailyFortune());
		
		System.out.println(cricketCoach.getDailyFortune());
		
		// close the context
		context.close();
				
	}
	
}
