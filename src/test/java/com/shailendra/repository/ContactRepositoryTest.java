package com.shailendra.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shailendra.model.Contact;

@SpringBootTest
public class ContactRepositoryTest {
	
	@Autowired
	private ContactRepository contactRepository;
	
	@Test
	public void createNewContactTest() {
		Contact contact = new Contact(101, "Shailendra");
		contactRepository.save(contact);
		
		Contact retrievedContact = contactRepository.findOneByName("Shailendra");
		assertThat(retrievedContact).isNotNull();
	}

}
