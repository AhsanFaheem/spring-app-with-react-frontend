package com.learning.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Contact {
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	private String email;

	public Contact() {

	}

	public Contact(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

}
