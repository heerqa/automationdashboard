package com.zoya.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zoya.model.DashboardTest;
import com.zoya.model.DashboardTestRun;

@Repository
public interface DashboardTestRunRepository extends JpaRepository<DashboardTestRun, Integer> {
	@Modifying
	@Transactional
	@Query("delete from DashboardTestRun u where u.dashboardId = :id")
	public void deleteTestClassMethods(@Param("id")Integer id);
	
	@Query("select u from DashboardTestRun u where u.dashboardId = :id")
	public List<DashboardTestRun> getAllRunningTest(@Param("id")Integer id);
	
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query("update DashboardTestRun u set u.methodName =:methodName where u.id = :id")
	public void updateTestRunMethod(@Param("methodName")String methodName, @Param("id")Integer id);
	
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query("update DashboardTestRun u set u.errorMessage =:errorMessage where u.id = :id")
	public void updateErrorMessage(@Param("errorMessage")String errorMessage, @Param("id")Integer id);

	@Modifying(clearAutomatically = true)
	@Transactional
	@Query("update DashboardTestRun u set u.status =:status where u.id = :id")
	public void updateStatus(@Param("status")String status, @Param("id")Integer id);

}
