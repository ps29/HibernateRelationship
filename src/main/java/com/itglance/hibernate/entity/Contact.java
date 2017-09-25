package com.itglance.hibernate.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Contact {
	private String phoneNumber;
	private String email;
	
	public Contact() {
		super();
	}

	public Contact(String phoneNumber, String email) {
		super();
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
	
	
}
