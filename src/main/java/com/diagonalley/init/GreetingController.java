package com.diagonalley.init;

import java.util.concurrent.atomic.AtomicLong;
import com.diagonalley.configs.ApplicationConfigs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@Autowired
	private ApplicationConfigs applicationConfigs;

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		// To check if app configs have been loaded
		System.out.println("using host: " + applicationConfigs.getPostgresConfig().getHost());
		System.out.println("port: " + applicationConfigs.getPostgresConfig().getPort());
		System.out.println("user: " + applicationConfigs.getPostgresConfig().getUser());
		System.out.println("password: " + applicationConfigs.getPostgresConfig().getPassword());
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
