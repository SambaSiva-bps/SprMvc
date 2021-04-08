package com.siva.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentControler {
	
	@RequestMapping("/as")
	public String demo() {
		
		
		return "web";

	}

}
