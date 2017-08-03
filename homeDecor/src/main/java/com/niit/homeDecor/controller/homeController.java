package com.niit.homeDecor.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {
	@RequestMapping("/")
	public ModelAndView index() { 
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	
    @RequestMapping("/register")
	public ModelAndView goToRegister()
	{
		ModelAndView mav=new ModelAndView("register");
		
		return mav;
	}

	
	@RequestMapping("/login")
	public ModelAndView goToLogin()
	{
		ModelAndView mav=new ModelAndView("login");
		return mav;
	}

	@RequestMapping(value = "/saveregister", method = RequestMethod.POST)
	public ModelAndView saveRegister(HttpServletRequest request)
	{

	ModelAndView mav=new ModelAndView("redirect:/login");
	String email=request.getParameter("email");
	String name=request.getParameter("name");
	String address=request.getParameter("address");
	String pwd=request.getParameter("pwd");
	String phone=request.getParameter("phone");
	System.out.print(email);
	/*User user=new User();
	user.setEmail(email);
	user.setAddress(address);
	user.setName(name);
	user.setPassword(pwd);
	user.setPhone(phone);


	if(result.hasErrors())
	{
	mav.setViewName("register");
	return mav;
	}
	else
	{
	user.setRole("ROLE USER");//USER AND ADMIN

	System.out.print(user);
	   userDao.insertUser(user);*/
	  
	   return mav;
	   
	   
	}
}