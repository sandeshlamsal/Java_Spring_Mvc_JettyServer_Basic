package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public ModelAndView myIndex(){
		return new ModelAndView("index");
	}
	
	@RequestMapping("/welcome")
	public ModelAndView mymethod(){
		return new ModelAndView("welcomepage");
	}
	//to handle /userlogin  from angular post method
	@RequestMapping(value="/login",method=RequestMethod.GET)
	
	public @ResponseBody String chkuser(){
		System.out.println("/login called");
		//must retrun json object type
		return "{\"name\":\"sandesh\",\"pass\":123}";
	}
	
}

