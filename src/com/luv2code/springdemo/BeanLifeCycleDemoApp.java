package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("trackCoach", Coach.class);
		Coach zidane = context.getBean("footballCoach", Coach.class);
		Coach footix = context.getBean("footballCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(zidane.getDailyFortune());
		
		// test football coach bean scope for section 6 exercise
		System.out.println(zidane);
		System.out.println(footix);
		System.out.println(zidane == footix);
		
		// close context
		context.close();

	}

}
