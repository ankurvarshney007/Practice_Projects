package org.nagarro.dao;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.nagarro.dto.Images;
import org.nagarro.dto.userInfo;

public class UserDao {
	
	public userInfo getUser(String userID, String password) {

		Configuration con = new Configuration().configure().addAnnotatedClass(userInfo.class).addAnnotatedClass(Images.class);
		SessionFactory s = con.buildSessionFactory();
		Session session = s.openSession();
		
		session.beginTransaction();
		userInfo user=session.get(userInfo.class, userID);
		
		
		
		session.getTransaction().commit();
		session.close();
		return user;

		

	}
	public void updatePassword(String userId,String password) {
		Configuration con = new Configuration().configure().addAnnotatedClass(Images.class).addAnnotatedClass(userInfo.class);
		SessionFactory s = con.buildSessionFactory();
		Session session = s.openSession();
		session.beginTransaction();
		
		userInfo user = new userInfo();
		user.setPassword(password);
		user.setUserID(userId);
		session.update(user);
		
		
		
		session.getTransaction().commit();


		
		session.close();
		s.close();
		
	}
	
}
