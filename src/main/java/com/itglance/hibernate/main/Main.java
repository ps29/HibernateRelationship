package com.itglance.hibernate.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.itglance.hibernate.entity.Student;
import com.itglance.hibernate.entity.Bank;
import com.itglance.hibernate.entity.Contact;
import com.itglance.hibernate.entity.Customer;

public class Main {
	static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	static Session session;

	public static void openSession() {
		session = sessionFactory.openSession();
		session.beginTransaction();
	}

	public static void closeSession() {
		session.getTransaction().commit();
		session.close();
	}

	public static void insert() {
		openSession();
//		Student student = new Student();

//		Contact contact1 = new Contact("9843293478", "maharjananil1@gmail.com");
////		Student student1 = new Student("Anil", contact1);
////		Student student2 = new Student("Ram", contact1);
////		// session.save(student);
//		Contact contact12 = new Contact("9843293478", "maharjananil1@gmail.com");
//		Contact contact13 = new Contact("9843293478", "maharjananil1@gmail.com");
//		Contact contact14 = new Contact("9843293478", "maharjananil1@gmail.com");
//		Contact contact15 = new Contact("9843293478", "maharjananil1@gmail.com");
//		Contact contact21 = new Contact("9843293478", "maharjananil1@gmail.com");
//		
//		List<Contact> contact=new ArrayList<>();
//		contact.add(contact21);
//		contact.add(contact12);
//		contact.add(contact13);
//		contact.add(contact14);
//		contact.add(contact15);
//		
//		Student student1=new Student("Anil",contact);
//		session.save(student1);
//		session.save(student2);
		
		Bank bank=new Bank(321313332);
		
		Customer customer=new Customer("anil","2051-05-20",bank);
		session.save(bank);
		session.save(customer);
		closeSession();
	}

	public static void update() {

	}

	public static void delete() {

	}

	public static void display() {
		session = sessionFactory.openSession();
		session.beginTransaction();
		List<Customer> customerList = session.createQuery("From Customer").getResultList();
//		for (Student s : studentList) {
//			System.out.println(s.getId());
//			System.out.println(s.getName());
//			System.out.println(s.getContact().getEmail());
//			System.out.println(s.getContact().getPhoneNumber());
//
//		}
		for(Customer c: customerList) {
			System.out.println(c.getId());
			System.out.println(c.getName());
			System.out.println(c.getDob());
			System.out.println(c.getBank());
		}
		closeSession();

	}

	public static void main(String[] args) {
		insert();
		display();
		// update();
		
		// delete();
		
	}
}
