package com.luve2code.springdemo;

public class RunCoach implements Coach{

	public FortuneService fortuneServce;
	
	public RunCoach(FortuneService theFortuneService) {
		fortuneServce = theFortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Run 5k fast";
	}

	@Override
	public String getDailyFortune() {
		return fortuneServce.getFortune();
	}

}
