package org.nagarro.service;


import org.nagarro.dao.SignupDaoImpl;

public class SignupServiceImp implements SignupService {
	
	private SignupDaoImpl signupDao = new  SignupDaoImpl();
	public void Signup(String username, String userpassword, String useremail, String phone, String addr) {
		
		this.signupDao.registerUser(username, userpassword, useremail, phone, addr);
		
	}
	
}
