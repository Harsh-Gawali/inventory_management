package com.r3sys.controller;


import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
	@RequestMapping("/")
	public String index()
	{
	return "index";
	}
	
	
    @RequestMapping("/login")
    public String processSignIn(HttpServletRequest request)
   {
	String name=request.getParameter("uname");
	String password=request.getParameter("psw");
	if(name.equals("admin") && password.equals("admin"))
	{
		return "dashboard";
	}
	else
	{
		return "index";
	}
}
}