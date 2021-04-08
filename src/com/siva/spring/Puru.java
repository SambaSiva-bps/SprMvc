package com.siva.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hellow")
public class Puru {
	
	@RequestMapping("/showFrom")
	
	public String v() {
		return "showFrom";
		
	}
@RequestMapping("/processFrom")
	
	public String vm() {
		return "siva";
		
	}
@RequestMapping("/processFormVersionTwo")

/*public String vmm(HttpServletRequest req, Model model) {
	String str=req.getParameter("studentName");
	str=str.toUpperCase();
	model.addAttribute("message", str);
	return "siva";
	
}*/

public String vmm(@RequestParam("studentName") String the, Model model) {
	the=the.toUpperCase();
	String s="HELLOW                  "     +the;
	model.addAttribute("message", s);
	return "siva";
	
}

	

}
