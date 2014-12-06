package com.zoya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zoya.dao.DashboardDao;
import com.zoya.model.Dashboard;

@Controller
public class UserController {
	@Autowired
	private DashboardDao dashboardDao;
	
	@RequestMapping("/login")
	public String viewLogin(Model model){
		return "login";
	}
	
	
	@RequestMapping("/home")
	public String viewHome(Model model){
		return "home";
	}

	@RequestMapping("/automationdashboard")
	public String viewAutomationDashboard(Model model){
		List<Dashboard> dashboardlist= dashboardDao.getDahboardList();
		model.addAttribute("dashboard", dashboardlist);
		return "automationdashboard";
	}
	
	@RequestMapping("/deletdashboard")
	public @ResponseBody String deletDashboard(Model model){
		dashboardDao.deleteAllDasboard();
		return "The Dashboard is deleted";
	}

}
