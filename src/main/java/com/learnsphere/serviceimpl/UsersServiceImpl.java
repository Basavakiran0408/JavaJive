package com.learnsphere.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnsphere.entity.Users;
import com.learnsphere.repository.UserRepo;
import com.learnsphere.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UserRepo repo;
	
	@Override
	public String addUser(Users u) {
		
		repo.save(u);
		 return "user added Succesfully";
	}

	@Override
	public boolean checkEmail(String email) {
		return repo.existsByEmail(email);
		
	}

	@Override
    public boolean validate(String email, String password) {
		if(repo.existsByEmail(email))
		{
			Users u =repo.findByEmail(email);
			String dbpassword=u.getPassword();
			if(dbpassword.equals(password))
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		else
		{
			return false;
		}	
	}

	@Override
	public String checkRole(String email) {
		
		{
			Users u =repo.findByEmail(email);
			String role=u.getRole();
			String n =u.getName();
			if(role.equals("trainer"))
			{
				System.out.println(role+" "+n);
				return "trainer"+" "+n;
			}
			else
			{
				
				return "student"+" "+n;
			}
			
		}
	}

//	@Override
//	public String getUser(String email) {
//	
//		Users ul= repo.findByEmail(null);
//		System.out.println(ul);
//		return ul.getName();
//	}



}
