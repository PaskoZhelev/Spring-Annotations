package com.udemy.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Coach coach = context.getBean("swimCoach", Coach.class);
		
		//call a method on the bean
		System.out.println(coach.getDailyWorkout());
				
		//call a method to get the daily fortune
		System.out.println(coach.getDailyFortune());
				
		//close the context
		context.close();

	}

}
