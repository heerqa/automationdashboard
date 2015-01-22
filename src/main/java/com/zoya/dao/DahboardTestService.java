package com.zoya.dao;

import java.util.List;

import com.zoya.model.Dashboard;
import com.zoya.model.DashboardTest;

public interface DahboardTestService {
	public List<DashboardTest> getDahboardList();
	public void insertDashbaord(DashboardTest dashboardTest);
}
