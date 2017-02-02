package com.javatpoint.mypackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.objectweb.asm.attrs.Annotation;

public class StoreData {
	public static void main(String[] args) {

		/*
		 * // creating configuration object Configuration cfg = new
		 * Configuration(); cfg.configure("hibernate.cfg.xml");// populates the
		 * data of the // configuration file
		 * 
		 * // creating seession factory object SessionFactory factory =
		 * cfg.buildSessionFactory();
		 * 
		 * // creating session object Session session = factory.openSession();
		 * 
		 * // creating transaction object Transaction t =
		 * session.beginTransaction();
		 */
		/* SessionFactory sessionFactory1 = new Configuration()
		        .configure("hibernate.cfg.xml").buildSessionFactory();*/
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		Employee e1 = new Employee();
		e1.setId(115);
		e1.setFirstName("shafi");
		e1.setLastName("test");

		session.beginTransaction();
		session.save(e1);

		session.beginTransaction().commit();
		session.close();

		/*
		 * session.persist(e1);// persisting the object
		 * 
		 * t.commit();// transaction is committed session.close();
		 */

		System.out.println("successfully saved");

	}
}