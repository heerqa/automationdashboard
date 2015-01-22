package com.zoya.service;

import java.util.List;







import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoya.model.Dashboard;
import com.zoya.repositories.DashboardRepository;
@Service
public class DashboardServiceImpl implements DashboardService {
	@Autowired
	DashboardRepository dashboardRepository;

	@Override
	public List<Dashboard> getDahboardList() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public void updateDashbaord(Dashboard dashboard) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDasboard(Dashboard dashboard) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllDasboard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDashbaord(String testclassname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dashboard getDashboard(Integer id) {
		Dashboard dashboard=dashboardRepository.findOne(id);
		return dashboard;
	}



	@Override
	public Dashboard saveDashboard(Dashboard dashboard) {
		
		return dashboardRepository.save(dashboard);
	}

}
