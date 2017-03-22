package com.bakeitstore.controllers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bakeitstore.items.entity.Cake;
import com.bakeitstore.items.service.ItemDetailsService;

@Controller
public class HomeController {

	private ItemDetailsService itemDetailsService;
	List<Cake> cakesList;

	public void setCakesList(List<Cake> cakesList) {
		this.cakesList = cakesList;
	}

	public void setItemDetailsService(ItemDetailsService itemDetailsService) {
		this.itemDetailsService = itemDetailsService;
	}

	@RequestMapping("/home")
	public ModelAndView displayWelcomeMessage() {
		String message = "Hello! Welcome to Bake It Online Store.";
		return new ModelAndView("homePage", "welcomeMessage", message);
	}
	
	@RequestMapping(value = "/getAllCakes", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Cake> getAllCakesByJava() {
		cakesList = itemDetailsService.getAllCakes();
		// return new ModelAndView(viewName, modelName, modelObject);
		return cakesList;
	}

	@RequestMapping("/getAllCakesByWS")
	public String getAllCakesByWebService() {
		cakesList = itemDetailsService.getAllCakes();
		// return new ModelAndView(viewName, modelName, modelObject);
		return null;
	}
}
