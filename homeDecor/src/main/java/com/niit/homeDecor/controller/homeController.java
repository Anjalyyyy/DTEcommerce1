package com.niit.homeDecor.controller;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.niit.homeDecor.daos.CategoryDao;
import com.niit.homeDecor.daos.ProductDao;
import com.niit.homeDecor.daos.SupplierDao;
import com.niit.homeDecor.daos.UserDao;
import com.niit.homeDecor.models.Category;
import com.niit.homeDecor.models.Product;
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
	@Autowired
	ProductDao productDao;
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
	
	public ModelAndView index1() { 
		ModelAndView mv = new ModelAndView("index");
		List<Supplier> cs=supplierDao.getSuppliers();
		mv.addObject("clist", cs);
		System.out.println(cs);
		return mv;
	}
	
	@RequestMapping("/supplierList")
	public ModelAndView slist() { 
		ModelAndView mv = new ModelAndView("supplierList");
		List<Supplier> cs=supplierDao.getSuppliers();
		mv.addObject("slist", cs);
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
		List<Category> cs=categoryDao.getCategorys();
		mav.addObject("clist", cs);
		List<Supplier> ss=supplierDao.getSuppliers();
		mav.addObject("slist", ss);
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
	@RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
	public ModelAndView saveProduct(HttpServletRequest request,@RequestParam("file") MultipartFile file )
	{

	ModelAndView mav=new ModelAndView("redirect:/adding");
	String id=request.getParameter("id");
	String cid=request.getParameter("cid");
	String sid=request.getParameter("sid");
	String name=request.getParameter("name");
	String description=request.getParameter("description");
    int price=Integer.valueOf(request.getParameter("price"));
	int stock=Integer.valueOf(request.getParameter("stock"));
	MultipartFile file = product.getImage();
	System.out.print(name);
	Category c=categoryDao.getCategory(cid);
	Supplier s=supplierDao.getSupplier(sid);
	System.out.println("Category nME : "+c.getName());
	System.out.println("Supp nME : "+s.getName());
	Product product =new Product();
	product .setId(id);
	product .setName(name);
	product .setDescription(description);
	product .setPrice(price);
	product .setStock(stock);
    product.setCategory(c);
    product.setSupplier(s);
    product.setImage(file);
	String filepath = request.getSession().getServletContext().getRealPath("/") + "resources/product/" + file.getOriginalFilename();
	
	System.out.println(filepath);
	try {
		byte imagebyte[] = file.getBytes();
		BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(filepath));
		fos.write(imagebyte);
		fos.close();
		} catch (IOException e) {
		e.printStackTrace();
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	System.out.print(product);
	   productDao.insertProduct(product);
	  
	   return mav;
	   
	   
	}
	
}
