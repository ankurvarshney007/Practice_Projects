package org.nagarro.service;

import org.nagarro.dao.HRUserDao;
import org.nagarro.model.HRUser;
import org.nagarro.model.HRUserParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HRServiceImpl implements HRService {
	@Autowired
	private HRUserDao hruserDao;

	public boolean authenticate(HRUser hruser) {
		HRUser user = this.hruserDao.getHRUser(hruser.getUsername());
		if(user!=null && hruser.getPassword().equals(user.getPassword())) {
			return true;
		}
		else {

			return false;

		}
	}

	public boolean updatePassword(HRUserParam hruser) {
		if(hruser.getPassword().equals(hruser.getConfirmPassword())) {
			this.hruserDao.update(hruser);
			return true;
		}
		else {
			return false;
		}
	}

}	