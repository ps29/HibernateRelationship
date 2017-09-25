package com.itglance.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;

@Entity
@Table(name = "Student_Table")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	@Column(name = "Student_Name", nullable = true)
	private String name;
//	@Embedded
//	private Contact contact;
//
	public Student() {
		super();
	}
	
	@ElementCollection
	private List<Contact> contact;
	
	public Student(String name,List<Contact> contact) {
		super();
		this.name = name;
		this.contact=contact;
	}

	public Student(int id) {
		super();
		this.id = id;
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

//	public Contact getContact() {
//		return contact;
//	}

//	public void setContact(Contact contact) {
//		this.contact = contact;
//	}

	
	
	public List<Contact> getContact() {
		return contact;
	}

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}

	

}
