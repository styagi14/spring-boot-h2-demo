package com.shailendra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shailendra.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

	Contact findOneByName(String name);
}
