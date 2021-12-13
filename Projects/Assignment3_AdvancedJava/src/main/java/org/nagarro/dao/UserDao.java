package org.nagarro.dao;
import org.nagarro.model.User;
import org.nagarro.userInput.UserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	public User getUser(String username) {
		User user =hibernateTemplate.get(User.class, username);
		return user ;
		
	}
	/**
	 * @return the hibernateTemplate
	 */
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	/**
	 * @param hibernateTemplate the hibernateTemplate to set
	 */
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public void update(UserForm user) {
		User user1= new User();
		user1.setUsername(user.getUsername());
		user1.setPassword(user.getPassword());
		this.hibernateTemplate.update(user1);
		
		
	}
}
