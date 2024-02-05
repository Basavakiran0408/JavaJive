package com.learnsphere.controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.learnsphere.entity.Course;
import com.learnsphere.service.TrainerService;

@Controller
public class StudentController {

	@Autowired
	TrainerService trainerService;

	@GetMapping("/buycourses")
	public String buyCourses(Model model)
	{
		
		List<Course> li =trainerService.courseList();
		model.addAttribute("list",li);
		
		 return "buycourse";
	}
	
	
}
