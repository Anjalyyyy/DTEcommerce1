package com.niit.homeDecor.controller;
import javax.enterprise.inject.Model;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.homeDecor.daos.UserDao;
import com.niit.homeDecor.models.User;



@Controller
public class homeController {
	
	@Autowired
	UserDao userDao;
	
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
	@RequestMapping(value="/dLogin")
	public ModelAndView login(HttpServletRequest request)
	{
		String email=request.getParameter("email");
		String pwd=request.getParameter("pwd");
		System.out.println("REACHING CONTROLLER email id-------------"+email+pwd);
		User u=userDao.getUser(email, pwd);
		System.out.println("REACHING CONTROLLER");
		ModelAndView mav;
	    if (u!=null) {
	    mav = new ModelAndView("redirect:/");
	    System.out.println("REACHING CONTROLLER");
	    
	   
	    }
	    else {
	    mav = new ModelAndView("login");
	   
	    }

		
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
	User user=new User();
	user.setEmail(email);
	user.setAddress(address);
	user.setName(name);
	user.setPassword(pwd);
	user.setPhone(phone);


	user.setRole("ROLE USER");//USER AND ADMIN

	System.out.print(user);
	   userDao.insertUser(user);
	  
	   return mav;
	   
	   
	}
}
