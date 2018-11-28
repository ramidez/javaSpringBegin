package com.luve2code.springdemo;

public class BasballCoach implements Coach {

	public FortuneService fortuneService;
	
	public BasballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkOut() {
		return "30 minute workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
