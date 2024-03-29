package com.example.demo;

import java.util.logging.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ryan Baxter
 */
@RestController
public class GreetingController {
	private static final Logger LOG = Logger.getLogger(GreetingController.class.getName());

	private GreetingProperties greetingProperties;

	public GreetingController(GreetingProperties greetingProperties) {
		this.greetingProperties = greetingProperties;
	}

	@RequestMapping("/")
	public String getGreeting(){
		LOG.info("Greeting: " + greetingProperties.getGreeting());
		return greetingProperties.getGreeting();
	}
}
