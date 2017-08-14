package com.udemy.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "It is a boring day!";
	}

}
