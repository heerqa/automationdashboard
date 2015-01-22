package com.zoya.dao.test;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.zoya.dao.DashboardDaoImpl;
import com.zoya.model.Dashboard;

public class TestDashboardDaoImpl {
	 
	
	//Dashboard dashboard =new Dashboard("Medical", 34, 6);
	Dashboard dashboard =new Dashboard("testclassname", "running_method_name", 23, 21, 3, 3);
	ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:spring/application-config.xml");
	DashboardDaoImpl dashboardDaoImpl=ctx.getBean("dashboardDaoImpl", DashboardDaoImpl.class);	
	@Ignore
	@Test
	public void testgetDahboardItemCount() {
		//dashboardDaoImpl.deleteAllDasboard();
		//dashboardDaoImpl.insertDashbaord(dashboard);
		System.out.println("TEST: Total rows in the Dashboard table are :" +dashboardDaoImpl.getDahboardList().size());
		//System.out.println("TEST: Total rows in the Dashboard table are :" +dashboardDaoImpl.getDahboardList().get(0).getTest_passed());
	}
	
	/**
	 *
	 * BASIC Create test will:
	 *
	 * 0. Empty DB
	 * 1. create a DashboardInMem
	 * 2. create a DashboardTestInMem
	 * 2.5 add DashboardTestInMem to DashboardInMem
	 * 3. persist (via API) DashboardInMem
	 * 4. read/get (via API) DashboardFromDB (which is actually same object as DasbboardInMem)
	 * 5. assert that DashboardFromDB has 1 count in it
	 * 6. get DashboardTestFromDB from DashboardFromDB
	 * 7. assert that all fields in DashboardTestFromDB are same as DashboardTestInMem
	 * 8. Voila!
	 *
	 *
	 *
	 *
	 *
	 *
	 */

}
	