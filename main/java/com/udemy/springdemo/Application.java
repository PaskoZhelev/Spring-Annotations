package com.udemy.springdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		//call a method on the bean
		System.out.println(coach.getDailyWorkout());
		
		//call a method to get the daily fortune
		System.out.println(coach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
