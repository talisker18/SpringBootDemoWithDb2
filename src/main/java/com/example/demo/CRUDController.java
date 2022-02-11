package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CRUDController {
	
	@Autowired
	StudentDAO dao;
	
	@RequestMapping("insert")
	public ModelAndView insert(@RequestParam("name") String name, @RequestParam("email") String email, HttpServletRequest req) {
		
		ModelAndView mv = new ModelAndView();
		Student s = new Student();
		s.setName(name);
		s.setEmail(email);
		Student returnedStudent= this.dao.insert(s);
		
		if(returnedStudent != null) {
			mv.setViewName("status");
		}
		
		return mv;
	}
	
	@RequestMapping("getall")
	public ModelAndView getAll(HttpServletRequest req, HttpServletResponse resp) {
		
		ModelAndView mv = new ModelAndView();
		
		List<Student> list = this.dao.getAll();
		
		System.out.println(list);
		
		mv.setViewName("display");
		mv.addObject("list",list);
		
		return mv;
	}

}
