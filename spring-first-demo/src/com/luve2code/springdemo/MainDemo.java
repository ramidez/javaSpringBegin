package com.luve2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class); 
		System.out.print(theCoach.getDailyWorkOut());
		
		System.out.print(theCoach.getDailyFortune());
		
		context.close();
	}

}
