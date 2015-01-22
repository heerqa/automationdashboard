package com.zoya.service;

import java.util.List;

import com.zoya.model.Dashboard;

public interface DashboardService {
	
	
	public List<Dashboard> getDahboardList();
	public Dashboard getDashboard(Integer id);
	public Dashboard saveDashboard(Dashboard dashboard);
	public void updateDashbaord(Dashboard dashboard);
	public void deleteDasboard(Dashboard dashboard);
	public void deleteAllDasboard();
	public String getDashbaord(String testclassname);

}
