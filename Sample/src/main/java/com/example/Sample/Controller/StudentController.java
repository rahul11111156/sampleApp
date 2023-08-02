package com.example.Sample.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Sample.Model.Milestone;
import com.example.Sample.Model.User;
import com.example.Sample.Model.Repo.MileRepo;
import com.example.Sample.Model.Repo.UserRepo;

@Controller
public class StudentController {
	
	@Autowired
	public UserRepo userRepo;
	
	@Autowired
	public MileRepo mileRepo;
	
	@GetMapping({"/","viewing"})
	public String addUserR() {
		User model=new User("admin","admin","20","admin","admin");
		User model1=new User("rahul","k","21","rahul123","rahul");
		Milestone mile=new Milestone("CPS","CPS-online","CC127","21-July-2024","CPS Regular release","admin","01-July-2024");
		Milestone mile2=new Milestone("TTMS","TTMS","CC127","21-July-2024","CPS Regular release","admin","01-July-2024");
		mileRepo.save(mile);
		mileRepo.save(mile2);
		userRepo.save(model);
		userRepo.save(model1);
		return "Viewing";
	}
	
	@PostMapping({"/","viewing"})
	public String addUserReal(HttpServletRequest request,HttpServletResponse response) {
		String name=request.getParameter("username");
		String password=request.getParameter("password");
		User user=userRepo.findByUserName(name);
		
		if(user==null) {
			request.setAttribute("success","Invalid username");
			return "Viewing";
		}
		else if(name.equals(user.getUserName())&& password.equals(user.getPassword())) {
	    request.setAttribute("success","");	
	    HttpSession sess=request.getSession();
	    sess.setAttribute("username", name);
		return "Homepage";
		}
		request.setAttribute("success","Invalid password");
		return "Viewing";
	}
	
	@GetMapping({"/homepage","viewing"})
	public String getUserId(HttpServletRequest request,HttpServletResponse response) {
		return "Homepage";
	}
	@GetMapping({"/home","viewing"})
	public String gotoHome(HttpServletRequest request,HttpServletResponse response) {
		HttpSession sess=request.getSession();
	    if(sess.getAttribute("username")!=null) {
		return "milestones";
	    }
	    return "Viewing";
	}
	@GetMapping({"/milestones","viewing"})
	public String getMilestone(HttpServletRequest request,HttpServletResponse response) {
		HttpSession sess=request.getSession();
	    if(sess.getAttribute("username")!=null) {
	    List<Milestone> milestones=mileRepo.findAll();
	    request.setAttribute("milestones",milestones);
		return "milestones";
	    }
	    return "Viewing";
	}
	@GetMapping({"/details","viewing"})
	public String showdetails(HttpServletRequest request) {
		HttpSession sess=request.getSession();
		String name=(String) sess.getAttribute("username");
		List<User> users=userRepo.findAll();
		request.setAttribute("users",users);
		if(name.equals("admin")) {
		return "Details";
		}
		return "unauthorized";
	}
	@GetMapping({"/register","viewing"})
	public String Register(HttpServletRequest request) {
		return "Register";
	}
	
	@GetMapping({"/logout","viewing"})
	public String logout(HttpServletRequest request,HttpServletResponse response) {
		HttpSession sess=request.getSession();
		sess.removeAttribute("username");
		return "Viewing";
	}

}
