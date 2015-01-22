package com.zoya.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoya.model.DashboardTest;
import com.zoya.repositories.DashboardTestRunRepository;

@Service
public class DahboardTestServiceImpl implements DahboardTestService {
	@Autowired
	DashboardTestRunRepository dashboardTestRepository;
	
	@Override
	public List<DashboardTest> getDahboardList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void insertDashbaord(DashboardTest dashboardTest) {
		
	}

}
