package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationSpringApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		// get the bean from spring container
		TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call a method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// call methods to get literal values
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());

		// close the context
		context.close();

	}

}
