package com.kosa.jenkins;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("message", "Hello Douzone6th!!!");
		
		return "hello";
	}

}