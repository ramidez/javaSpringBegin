package com.luve2code.springdemo;

public class CrickietCoach implements Coach {

	public FortuneService fortuneService;
	
	private String email;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	private String team;
	
	public CrickietCoach() {
		
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Go bowling 15 min";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
