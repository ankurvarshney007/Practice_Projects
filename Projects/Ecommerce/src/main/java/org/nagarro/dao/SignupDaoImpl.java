package org.nagarro.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.nagarro.entities.User;

public class SignupDaoImpl implements SignupDao {

	public void registerUser(String username, String userpassword, String useremail, String phone, String addr) {
	
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		User user = new User(username , userpassword,useremail,phone , addr,"admin");
		
		session.save(user);
		tx.commit();
		session.close();
		sessionFactory.close();
		
		
		
		
}
	
}
