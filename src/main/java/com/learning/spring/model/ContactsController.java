package com.learning.spring.model;

import java.util.Collection;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactsController {

	private ContactRepository contactRepository;

	public ContactsController(ContactRepository contactRepository) {
		super();
		this.contactRepository = contactRepository;
	}
	@GetMapping("/contacts")
	public Collection<Contact> contacts(){
		return (Collection<Contact>) contactRepository.findAll();
	}
	@PostMapping("/contacts")
	public ResponseEntity<Contact> createContact(@Validated @RequestBody Contact contact) {
		Contact result = contactRepository.save(contact);
		return ResponseEntity.ok().body(result);
	}
	
}
