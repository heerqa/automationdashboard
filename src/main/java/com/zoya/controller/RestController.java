package com.zoya.controller;

import javax.annotation.RegEx;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zoya.dao.DahboardTestServiceImpl;
import com.zoya.model.ActivityLog;
import com.zoya.model.Dashboard;
import com.zoya.model.DashboardTest;
import com.zoya.model.DashboardTestRun;
import com.zoya.repositories.DashboardRepository;
import com.zoya.repositories.DashboardTestRunRepository;
import com.zoya.service.AcitivityLogServiceImpl;
import com.zoya.service.DashboardServiceImpl;

	
@Controller
@RequestMapping("/restapi")
public class RestController {
	@Autowired
	DashboardTestRunRepository dashboardTestRunRepository;
	@Autowired
	DashboardRepository dashboardRepository;
	@Autowired
	DahboardTestServiceImpl dahboardTestServiceImpl;
	@Autowired
	DashboardServiceImpl dashboardServiceImpl;
	@Autowired
	AcitivityLogServiceImpl acitivityLogServiceImpl;
	
	@RequestMapping(value="/activity/{dashboardID}/{currentactivity}", method=RequestMethod.POST)
	public @ResponseBody ActivityLog currentactivity(@PathVariable("currentactivity") String currentactivity,@PathVariable("dashboardID") Integer dashboardID){
		System.out.println("In currentactivity controller");
		ActivityLog act=new ActivityLog();
		act.setCurrentactivity(currentactivity);
		act.setDashboardID(dashboardID);
		ActivityLog actlog=acitivityLogServiceImpl.saveActivityLog(act);
		
		
		return actlog;
	}
	
	
	@RequestMapping(value="/createdashboard/{testclassname}", method=RequestMethod.POST)
	public @ResponseBody Dashboard createDashbard(@PathVariable("testclassname") String testclassname){
		System.out.println("In controller");
		Dashboard dashboard=new Dashboard();
		dashboard.setTestclassname(testclassname);		
		
		System.out.println(dashboard.getCurrenttest());
		
		
		return dashboardServiceImpl.saveDashboard(dashboard);
	}
	
	@RequestMapping(value="/updatebrowser/{id}/{browsername}", method=RequestMethod.PUT)
	public @ResponseBody Dashboard updateDashboardBrowser(@PathVariable("id") Integer id,@PathVariable("browsername") String browsername){
		System.out.println("In updateDashboard controller");
		dashboardRepository.updateBrowserName(browsername, id);	
		return dashboardRepository.findOne(id);
	}
	
	@RequestMapping(value="/updatetotalcount/{id}/{totalcount}", method=RequestMethod.PUT)
	public @ResponseBody Dashboard updateDashboardTotalCount(@PathVariable("id") Integer id,@PathVariable("totalcount") Integer totalcount){
		System.out.println("In updateDashboard controller");
		dashboardRepository.updatetotaltests(totalcount, id);
		return dashboardRepository.findOne(id);
	}
	
	@RequestMapping(value="/updaterunningmethod/{id}/{running_method_name}", method=RequestMethod.PUT)
	public @ResponseBody Dashboard updateDashboardRunningMethod(@PathVariable("id") Integer id,@PathVariable("running_method_name") String running_method_name){
		System.out.println("In updateDashboard controller");
		dashboardRepository.updateRunningMethodName(running_method_name, id);
		return dashboardRepository.findOne(id);
	}
	
	
	
	@RequestMapping(value="/updatepasscount/{id}/{passcount}", method=RequestMethod.PUT)
	public @ResponseBody Dashboard updateDashboardPassCount(@PathVariable("id") Integer id,@PathVariable("passcount") Integer passcount){
		System.out.println("In updateDashboard controller");
		dashboardRepository.updateTestPassed(passcount, id);
		return dashboardRepository.findOne(id);
	}
	
	@RequestMapping(value="/updatefailcount/{id}/{failcount}", method=RequestMethod.PUT)
	public @ResponseBody Dashboard updateDashboardFailCount(@PathVariable("id") Integer id,@PathVariable("failcount") Integer failcount){
		System.out.println("In updateDashboard controller");
		dashboardRepository.updateTestFailed(failcount, id);
		return dashboardRepository.findOne(id);
	}
	
	
	//******************for running methods as part of test class*****************
	
	@RequestMapping(value="/createdmethod/{dashboardID}/{methodname}", method=RequestMethod.POST)
	public @ResponseBody DashboardTestRun createMethod(@PathVariable("dashboardID") Integer dashboardID,@PathVariable("methodname") String methodname){
		System.out.println("In create mthods controller");
		DashboardTestRun dashboardTestRun=new DashboardTestRun();
		dashboardTestRun.setDashboardId(dashboardID);
		dashboardTestRun.setMethodName(methodname);
		
		
		return dashboardTestRunRepository.save(dashboardTestRun);
	}
	
	@RequestMapping(value="/updatedmethodstatus/{methodid}/{status}", method=RequestMethod.PUT)
	public @ResponseBody DashboardTestRun methodstatus(@PathVariable("methodid") Integer methodid,@PathVariable("status") String status){
		System.out.println("In create mthods controller");
		dashboardTestRunRepository.updateStatus(status, methodid);	
		return dashboardTestRunRepository.findOne(methodid);
	}
	
	@RequestMapping(value="/updatedmethoderrormessage/{methodid}/{errormessage}", method=RequestMethod.PUT)
	public @ResponseBody DashboardTestRun methodErrorMessage(@PathVariable("methodid") Integer methodid,@PathVariable("errormessage") String errormessage){
		System.out.println("In create mthods controller");
		dashboardTestRunRepository.updateErrorMessage(errormessage, methodid);
		return dashboardTestRunRepository.findOne(methodid);
	}

}
