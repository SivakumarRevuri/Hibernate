package com.shiv.hibernate.annotation.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shiv.hibernate.annotation.model.User;

public class HibernateApplication {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("resources/hibernate-ann.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		User user = (User)session.get(User.class, 1);
		System.out.println(user.getUserName()+" "+user.getUserAddress().getCity()+" "+user.getUserOrders());
		session.close();
		sessionFactory.close();
	}
}
