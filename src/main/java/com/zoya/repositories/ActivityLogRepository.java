package com.zoya.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zoya.model.ActivityLog;
import com.zoya.model.DashboardTestRun;
@Repository
public interface ActivityLogRepository extends JpaRepository<ActivityLog, Integer> {
	
	@Modifying
	@Transactional
	@Query("delete from ActivityLog u where u.dashboardID = :id")
	public void deleteTestClassActivity(@Param("id")Integer id);
	
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query("update ActivityLog u set u.currentactivity =:currentactivity where u.id = :id")
	public void updatecurrentactivity(@Param("currentactivity")String currentactivity, @Param("id")Integer id);

	@Query("select u from ActivityLog u where u.dashboardID = :id")
	public List<ActivityLog> getActivityLog(@Param("id")Integer id);
}
