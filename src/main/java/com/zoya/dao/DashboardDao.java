package com.zoya.dao;

import java.util.List;

import com.zoya.model.Dashboard;

public interface DashboardDao {
	
	public List<Dashboard> getDahboardList();
	public void insertDashbaord(Dashboard dashboard);
	public void updateDashbaord(Dashboard dashboard);
	public void deleteDasboard(Dashboard dashboard);
	public void deleteAllDasboard();
	public String getDashbaord(String testclassname);

}
