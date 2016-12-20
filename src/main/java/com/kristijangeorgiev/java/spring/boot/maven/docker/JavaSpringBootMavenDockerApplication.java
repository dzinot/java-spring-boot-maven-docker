package com.kristijangeorgiev.java.spring.boot.maven.docker;

import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Kristijan Georgiev
 *
 */

@SpringBootApplication
@RestController
public class JavaSpringBootMavenDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringBootMavenDockerApplication.class, args);
	}

	@RequestMapping("/")
	public String test() {
		return UUID.randomUUID().toString();
	}
}
