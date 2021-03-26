package com.learning.spring.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLoader implements CommandLineRunner {

	private final ContactRepository contactRepository;
	public DemoLoader(ContactRepository contactRepository) {
		super();
		this.contactRepository = contactRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		this.contactRepository.save(new Contact("First name", "Last name", "testEmail@email.com"));
	}


}
