package northseapartszero.controllers;

import java.security.Principal;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import northseapartszero.dao.*;

@Controller
public class HomeController 
{

	@Autowired
	private UsersDAO myUserDAO;
	
	@RequestMapping("/")
	public String showHome(Model model, Principal principal) 
	{
		return "guest/home";
	}
	
	@RequestMapping("/test")
	public String showTest()
	{
		return "guest/test";
	}
	
	@RequestMapping("/login")
	public String showLogin()
	{
		return "guest/login";
	}

}
