package com.bakeitstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bakeitstore.items.service.ItemDetailsService;

@Controller
public class HomeController {
	
	private ItemDetailsService itemDetailsService;
	
	List cakesList;
	
	public void setItemDetailsService(ItemDetailsService itemDetailsService) {
		this.itemDetailsService = itemDetailsService;
	}

	@RequestMapping("/home")
	public ModelAndView displayWelcomeMessage() {
		String message = "Hello! Welcome to Bake It Online Store.";
		return new ModelAndView("homePage", "welcomeMessage", message);
	}
	
	@RequestMapping("/getAllCakes")
	public @ResponseBody List getAllCakesByJava(){
		cakesList = itemDetailsService.getAllCakes();
		//return new ModelAndView(viewName, modelName, modelObject);
		return cakesList;
	}
	
	@RequestMapping("/getAllCakesByWS")
	public String getAllCakesByWebService(){
		cakesList = itemDetailsService.getAllCakes();
		//return new ModelAndView(viewName, modelName, modelObject);
		return null;
	}
}
