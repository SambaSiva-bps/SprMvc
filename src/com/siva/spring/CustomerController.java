package com.siva.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@RequestMapping("/showForm")
	public String x(Model model) {
		model.addAttribute("customer", new Customer());
		
		return "customerController";
		
	}

}
