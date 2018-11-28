package com.luve2code.springdemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		Random ra = new Random();
		List<String> lista = new ArrayList<>();
		lista.add("Good");
		lista.add("Bad");
		lista.add("Medium");
		return lista.get(ra.nextInt(3));
	}

}
