package com.learnsphere.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.learnsphere.entity.Users;
import com.learnsphere.service.UsersService;

@Controller
public class ServiceController {

	@Autowired
	 UsersService service;

	@PostMapping("/adduser")
	public String addUser(@ModelAttribute Users u)
	{
		boolean emailExists=service.checkEmail(u.email);
		if(!emailExists)
		{
		service.addUser(u);
		System.out.println("user registered!");
		return "redirect:/";
		}
		else
		{
			System.out.println("email alredy exists");
			return "redirect:/register";
		}
	}
	
	@PostMapping("/validate")
	public String validate(@ModelAttribute Users u)
	{
		boolean emailExists=service.checkEmail(u.email);
		if(emailExists)
		{
			boolean v = service.validate(u.email,u.password);
			if(v)
			{
				String role = service.checkRole(u.email);
				String fn=role.split(" ")[0];
				
				if(fn.equals("trainer"))
				{		
					return "redirect:/trainer";
				}
				else
				{	
					return "redirect:/student";
				}
			}
			else 
			{
				System.out.println("wrong password");
				return "redirect:/login";
			}
		
		}
		else
		{
			System.out.println("email not registered");
			return "redirect:/register";
		}
	}
	
	
}
