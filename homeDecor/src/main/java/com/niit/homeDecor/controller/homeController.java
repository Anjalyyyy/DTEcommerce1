package com.niit.homeDecor.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.niit.homeDecor.daos.CategoryDao;
import com.niit.homeDecor.daos.SupplierDao;
import com.niit.homeDecor.daos.UserDao;
import com.niit.homeDecor.models.Category;
import com.niit.homeDecor.models.Supplier;
import com.niit.homeDecor.models.User;



@Controller
public class homeController {
	
	@Autowired
	UserDao userDao;
	@Autowired
	SupplierDao supplierDao;
	@Autowired
	CategoryDao categoryDao;
	@RequestMapping("/")
	public ModelAndView index() { 
		ModelAndView mv = new ModelAndView("index");
		List<Category> cs=categoryDao.getCategorys();
		mv.addObject("clist", cs);
		System.out.println(cs);
		return mv;
	}
	
	@RequestMapping("/categoryList")
	public ModelAndView clist() { 
		ModelAndView mv = new ModelAndView("categoryList");
		List<Category> cs=categoryDao.getCategorys();
		mv.addObject("clist", cs);
		System.out.println(cs);
		return mv;
	}
	
	
    @RequestMapping("/register")
	public ModelAndView goToRegister()
	{
		ModelAndView mav=new ModelAndView("register");
		List<Category> cs=categoryDao.getCategorys();
		mav.addObject("clist", cs);
		System.out.println(cs);
		
		
		return mav;
	}
    @RequestMapping("/adding")
	public ModelAndView goToAdding()
	{
		ModelAndView mav=new ModelAndView("adding");
		
		
		return mav;
	}

	
	@RequestMapping("/login")
	public ModelAndView goToLogin()
	{
		ModelAndView mav=new ModelAndView("login");
		List<Category> cs=categoryDao.getCategorys();
		mav.addObject("clist", cs);
		System.out.println(cs);
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
	@RequestMapping(value = "/savesupplier", method = RequestMethod.POST)
	public ModelAndView saveSupplier(HttpServletRequest request)
	{

	ModelAndView mav=new ModelAndView("redirect:/adding");
	String id=request.getParameter("id");
	String name=request.getParameter("name");
	String address=request.getParameter("address");
	System.out.print(name);
	Supplier supplier=new Supplier();
	supplier.setSid(id);
	supplier.setAddress(address);
	supplier.setName(name);

	System.out.print(supplier);
	   supplierDao.insertSupplier(supplier);
	  
	   return mav;
	   
	   
	}
	@RequestMapping(value = "/savecategory", method = RequestMethod.POST)
	public ModelAndView saveCategory(HttpServletRequest request)
	{

	ModelAndView mav=new ModelAndView("redirect:/adding");
	String id=request.getParameter("id");
	String name=request.getParameter("name");
	String description=request.getParameter("description");
	System.out.print(name);
	Category category =new Category();
	category .setCid(id);
	category .setName(name);
	category .setDescription(description);

	System.out.print(category);
	   categoryDao.insertCategory(category);
	  
	   return mav;
	   
	   
	}
}
