package org.nagarro.dao;

import org.nagarro.model.HRUser;
import org.nagarro.model.HRUserParam;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class HRUserDao {
	private HibernateTemplate hibernateTemplate;

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
	
	public HRUser getHRUser(String username) {
		HRUser hruser =this.hibernateTemplate.get(HRUser.class, username);
		return hruser;
	}
	@Transactional
	public void update(HRUserParam hruser) {
		HRUser user = new HRUser();
		user.setPassword(hruser.getPassword());
		user.setUsername(hruser.getUsername());
		this.hibernateTemplate.update(user);
		
	}
}
