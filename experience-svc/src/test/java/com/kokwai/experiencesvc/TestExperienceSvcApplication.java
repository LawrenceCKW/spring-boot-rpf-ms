package com.kokwai.experiencesvc;

import org.springframework.boot.SpringApplication;

public class TestExperienceSvcApplication {

	public static void main(String[] args) {
		SpringApplication.from(ExperienceSvcApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
