package com.learnsphere.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavController {
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	
	
	@RequestMapping("/register")
	public String register()
	{
		return "register";
	}
	
	@RequestMapping("/trainer")
	public String trainer()
	{
		return "trainer";
	}
	
	@RequestMapping("/student")
	public String student()
	{
		return "student";
	}
	
	@RequestMapping("/createcourse")
	public String createCourse()
	{
		return "createcourse";
	}
	
	@RequestMapping("/addlesson")
	public String addLesson()
	{
		return "addlesson";
	}

	@RequestMapping("/courses")
	public String viewCourse()
	{
		return "courses";
	}
	
	@RequestMapping("/buycourse")
	public String buyCourse()
	{
		return "buycourse";
	}
	
	@RequestMapping("/mylearnings")
	public String myCourse()
	{
		return "mycourse";
	}
}
