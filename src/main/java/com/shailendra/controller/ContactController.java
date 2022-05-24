package com.shailendra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shailendra.model.Contact;
import com.shailendra.repository.ContactRepository;

@RestController
@RequestMapping("/api")
public class ContactController {

	@Autowired
	private ContactRepository contactRepository;
	
	@PostMapping("/contact")
	public ResponseEntity<Contact> createTutorial(@RequestBody Contact contact) {
		
		
		try {
			Contact savedContact = contactRepository.save(contact);
			return new ResponseEntity<>(savedContact, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
