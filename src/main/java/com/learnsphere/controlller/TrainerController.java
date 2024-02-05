package com.learnsphere.controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learnsphere.entity.Course;
import com.learnsphere.entity.Lesson;
import com.learnsphere.serviceimpl.TrainerServiceImpl;


@Controller
public class TrainerController {
	
	@Autowired
	TrainerServiceImpl trainerService;


	@PostMapping("/addcourse")
	public String addCourse(@ModelAttribute Course c)
	{
		
		trainerService.addCourse(c);
		return "redirect:/trainer";
	}
	
	@PostMapping("/addlesson")
	public String addLesson(@RequestParam("course_id") long c_id,
			                @RequestParam("l_id") long l_id, 
			                @RequestParam("l_name") String l_name, 
			                @RequestParam("topics") String topics,
			                @RequestParam("link") String link)
	{
		Course c = trainerService.getCourse(c_id);
	  Lesson les = new Lesson(l_id, l_name, topics, link, c);
	  trainerService.addLesson(les);
      c.getLessons().add(les);
	  return "redirect:/trainer";
	}
	

	@GetMapping("/showcourses")
	public String viewCourses(Model model)
	{  
		List<Course> li =trainerService.courseList();
		model.addAttribute("lis",li);
		return "courses";
	}
	
	@GetMapping("/deleteCourse/{c_id}")
	public String deleteCourse(@PathVariable (value = "c_id") long c_id , Model model)
	{
		trainerService.deleteCourse(c_id);
		List<Course> li =trainerService.courseList();
		model.addAttribute("lis",li);
		return "courses";
	}
	
}
