package org.bakeitstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public ModelAndView displayWelcomeMessage() {
		String message = "Hello! Welcome to Bake It Online Store.";
		return new ModelAndView("homePage", "welcomeMessage", message);
	}
}
