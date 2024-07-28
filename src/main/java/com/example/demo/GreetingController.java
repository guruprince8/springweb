package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Greeting Controller
 */
@Controller
public class GreetingController {
	/**
	 * 
	 * @param name - query variable
	 * @param model - spring boot model
	 * @return - view name render
	 */
	@GetMapping("/greeting")
	public String greeting(@RequestParam(required=false,defaultValue = "World") String name,Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

}
