package com.example.event_management;

import org.springframework.boot.SpringApplication;

public class TestEventManagementApplication {

	public static void main(String[] args) {
		SpringApplication.from(EventManagementApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
