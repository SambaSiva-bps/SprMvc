package com.siva.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class Student2 {
@RequestMapping("/showForm")
	public String f(Model model)
	{
		Student1 s=new Student1();
		model.addAttribute("stude", s);
		return "student1";
		
	}
@RequestMapping("/processForm")
public String h(@ModelAttribute("stude") Student1 s)
{
	s.getFirstName();
	s.getLastName();
	s.getCountry();
	
	return "student2";
	
}
}
