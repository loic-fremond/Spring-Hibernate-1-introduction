package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("trackCoach", Coach.class);
		Coach alphaCoach = context.getBean("trackCoach", Coach.class);
		
		// check if they are the same bean
		boolean result = (theCoach == alphaCoach);
		System.out.println("\nPointing to the same object : " + result);
		
		// print out memory location for each coach
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		
		// close context
		context.close();

	}

}
