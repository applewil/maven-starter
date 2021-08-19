package com.applewil.mavenstarter;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	private static record Person(String name){}
	public static void main(String[] args) throws Exception {
		logger.error("start");
		ObjectMapper objectMapper = new ObjectMapper();
		var p = new Person("will");
		String carAsString = objectMapper.writeValueAsString(p);
		var p2 = objectMapper.readValue(carAsString, Person.class);
		System.out.println(p2);
	}
}
