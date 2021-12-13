package org.nagarro.Restwebservice.Dao;


import org.nagarro.Restwebservice.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRegistrationDao extends JpaRepository<User,String>{
	
	
}
