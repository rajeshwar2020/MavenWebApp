package com.home.mycafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcome {

	@RequestMapping("/cafe")
	public String showWelcomePage(Model objModel) {
		objModel.addAttribute("cafeName", "Rajesh Cafe");
		return "welcomePage";
	}
	
	@RequestMapping("/orderPlaced")
	public String orderPlaced(HttpServletRequest request, Model objModel) {
		String param = request.getParameter("dish");
		objModel.addAttribute("dishOrdered", param);
		return "ordered";
	}
}
