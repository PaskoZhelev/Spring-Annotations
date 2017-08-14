package com.udemy.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Value("${random.fortunes}")
	private String[] fortunes;
	private Random rand = new Random();
	
	
	@Override
	public String getFortune() {
		int index = rand.nextInt(fortunes.length);
		String randomFortune = fortunes[index];
		return randomFortune;
	}

}
