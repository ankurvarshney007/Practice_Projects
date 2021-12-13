package org.nagarro.service;

import org.nagarro.model.HRUser;
import org.nagarro.model.HRUserParam;

public interface HRService {
	public boolean authenticate(HRUser hruser);

	public boolean updatePassword(HRUserParam hruser);
	
}
