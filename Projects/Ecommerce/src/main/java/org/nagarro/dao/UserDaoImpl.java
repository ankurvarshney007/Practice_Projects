package org.nagarro.dao;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.nagarro.entities.User;


public class UserDaoImpl implements UserDao{
	
	public User getUserByEmailAndPassword(String email , String password) {
		
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		User user = null;
		try {
			session.beginTransaction();
			//String queryString = "from User where userEmail=:email and userPassword=:pwd" ;
			Query query = session.createQuery("from User  where userEmail = :email and userPassword = : pwd" ).setParameter("email",email).setParameter("pwd", password);

			//Query query = session.createQuery(queryString);
//			query.setParameter("email", email);
//			query.setParameter("pwd", password);
//			
//			user = query.unique();
//			user = (User)query.getFirstResult();
		
			System.out.println(user);
			
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		
		return user;
	}
}
