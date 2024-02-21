package com.zemoso.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LogerApplicationDemoApplication {
	Logger log= LoggerFactory.getLogger(LogerApplicationDemoApplication.class);

	@GetMapping("/test/{name}")
	public String greeting(@PathVariable String name){
		log.info("This will fetch the name of person who visits our Company's site");
		int numberOfProblem=5;
		log.info("Difference between SLF4J and Log4J is we can replace concatenation with placeholder ->{}",numberOfProblem);
		log.info("We can customize our logging mechanism using Logback.xml");

		log.debug("Request {}",name);
		if(name.equalsIgnoreCase("test")){
			throw new RuntimeException("Exception raised due to enter test");
		}
		String response="Hi "+name+" Welcome to Zemoso";
		log.debug("Response {}",response);
		return response;
	}

	public static void main(String[] args) {
		SpringApplication.run(LogerApplicationDemoApplication.class, args);
	}

}
