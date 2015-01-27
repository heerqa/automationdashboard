package com.zoya.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zoya.model.Dashboard;
@Repository
public interface DashboardRepository extends JpaRepository<Dashboard, Integer>{
	


@Modifying(clearAutomatically = true)
@Transactional
@Query("update Dashboard u set u.browsername =:browser where u.id = :id")
public void updateBrowserName(@Param("browser")String browser, @Param("id")Integer id);


@Modifying(clearAutomatically = true)
@Transactional
@Query("update Dashboard u set u.test_passed =:test_passed where u.id = :id")
public void updateTestPassed(@Param("test_passed")Integer test_passed, @Param("id")Integer id);

@Modifying(clearAutomatically = true)
@Transactional
@Query("update Dashboard u set u.currenttest =:currenttest where u.id = :id")
public void updateCurrentPassed(@Param("currenttest")Integer currenttest, @Param("id")Integer id);


@Modifying(clearAutomatically = true)
@Transactional
@Query("update Dashboard u set u.test_failed =:test_failed where u.id = :id")
public void updateTestFailed(@Param("test_failed")Integer test_failed, @Param("id")Integer id);


@Modifying(clearAutomatically = true)
@Transactional
@Query("update Dashboard u set u.currenttest =:currenttest where u.id = :id")
public void updatecurrenttest(@Param("currenttest")Integer currenttest, @Param("id")Integer id);

@Modifying(clearAutomatically = true)
@Transactional
@Query("update Dashboard u set u.totaltests =:totaltests where u.id = :id")
public void updatetotaltests(@Param("totaltests")Integer totaltests, @Param("id")Integer id);

@Modifying(clearAutomatically = true)
@Transactional
@Query("update Dashboard u set u.running_method_name =:running_method_name where u.id = :id")
public void updateRunningMethodName(@Param("running_method_name")String running_method_name, @Param("id")Integer id);


}
