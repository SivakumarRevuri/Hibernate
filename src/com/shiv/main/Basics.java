package com.shiv.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.shiv.model.Employee;

public class Basics {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/shiv/resources/hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = factory.openSession();

		// fetch single records
		new Basics().fetchRecords(session);
		// to fetch multiple records
		new Basics().fetchMultipleRecords(session);
	}

	private void fetchMultipleRecords(Session session) {
		String sql = "select empId,ename,job,salary from Employee";
		@SuppressWarnings("unchecked")
		Query<Object> query = (Query<Object>) session.createQuery(sql);
		List<Object> list = query.list();

		for (Object object : list) {
			Object[] array = (Object[]) object;
			for (Object values : array) {
				System.out.println(values);
			}
		}

	}

	private void fetchRecords(Session session) {
		System.out.println(session.get(Employee.class, 1L));
	}
}
