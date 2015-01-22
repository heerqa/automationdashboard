package com.zoya.dao.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zoya.model.Dashboard;
import com.zoya.model.User;
import com.zoya.repositories.DashboardRepository;
import com.zoya.repositories.UserRepositoty;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/application-config.xml")
public class UserRepositotyTest {
	@Autowired
	UserRepositoty userRepositoty;
	@Autowired
	DashboardRepository DashboardRepository;
	@Ignore
	@Test
	public void test() {
		User user=new User();
		user.setFirstname("zoya");
		user.setLastname("naz");
		user.setCompletename("zoya naz");
		
		userRepositoty.save(user);
		
		User dbuser= userRepositoty.findOne(user.getId());
		assertNotNull(dbuser);
		System.out.println(dbuser.getFirstname());
	}
	
	@Test
	public void test2() {
		
		Dashboard dashboard=new Dashboard();
		dashboard.setTestclassname("ssfsdfsf");
		DashboardRepository.save(dashboard);
		
	}
}
