package com.zoya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zoya.dao.DashboardDao;
import com.zoya.model.ActivityLog;
import com.zoya.model.Dashboard;
import com.zoya.model.DashboardTestRun;
import com.zoya.repositories.ActivityLogRepository;
import com.zoya.repositories.DashboardRepository;
import com.zoya.repositories.DashboardTestRunRepository;

@Controller
public class UserController {
	@Autowired
	private DashboardDao dashboardDao;
	@Autowired
	DashboardRepository dashboardRepository;
	@Autowired
	DashboardTestRunRepository dashboardTestRunRepository;
	@Autowired
	ActivityLogRepository activityLogRepository;
	
	@RequestMapping("/login")
	public String viewLogin(Model model){
		return "login";
	}
	
	@RequestMapping("/contact")
	public String viewContactUs(Model model){
		return "contact";
	}
	
	
	
	@RequestMapping("/home")
	public String viewHome(Model model){
		return "home";
	}

	@RequestMapping("/automationdashboard")
	public String viewAutomationDashboard(Model model){
		List<Dashboard> dashboardlist= dashboardRepository.findAll();
		model.addAttribute("dashboard", dashboardlist);
		return "automationdashboard";
	}
	
	@RequestMapping("/deletdashboard")
	public @ResponseBody String deletDashboard(Model model){
		dashboardDao.deleteAllDasboard();
		return "The Dashboard is deleted";
	}
	
	@RequestMapping(value="{id}/runningtestdetails")
	public String viewRunningTestDetails(@PathVariable("id") Integer id, Model model){
		List<DashboardTestRun> dashboardTestRun=dashboardTestRunRepository.getAllRunningTest(id);
		model.addAttribute("dashboardTestRun", dashboardTestRun);
		return "runningtestdetails";
	}
	
	@RequestMapping(value="{id}/activitylog")
	public String viewActivitylog(@PathVariable("id") Integer id, Model model){
		List<ActivityLog> activityLog=activityLogRepository.getActivityLog(id);
		model.addAttribute("activityLog", activityLog);
		return "activitylog";
	}
	
	@RequestMapping(value="/{id}/deletesingletest")
	public String deletesingletest(@PathVariable("id") Integer id, Model model){
		
		dashboardRepository.delete(id);
		
		dashboardTestRunRepository.deleteTestClassMethods(id);
		activityLogRepository.deleteTestClassActivity(id);
		
		return "automationdashboard";
	}

}
