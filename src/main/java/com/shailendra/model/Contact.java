package com.shailendra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "CONTACT")
@AllArgsConstructor
@NoArgsConstructor
public class Contact {

	@Id
	@Column(name = "CONTACT_ID")
	long id;
	@Column(name = "CONTACT_NAME")
	String name;
}
