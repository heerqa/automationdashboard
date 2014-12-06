package com.zoya.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.zoya.model.Dashboard;




@Repository
public class DashboardDaoImpl implements DashboardDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
    


	public DataSource getDataSource() {
		return dataSource;
	}
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}

	public List<Dashboard> getDahboardList() {
		List<Dashboard> dashboardlist =new ArrayList<Dashboard>();
		String sql="select * from dashboard_new";
		
		dashboardlist=jdbcTemplate.query(sql, new DashbaordRowMapper());

		return dashboardlist;
	
	}

	public void insertDashbaord(Dashboard dashboard) {
		String sql="insert into dashboard_new (testclass,totaltest,currenttest,running_method_name, test_passed, test_failed )values(?,?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[]{dashboard.getTestclassname(), dashboard.getTotaltests(),dashboard.getCurrenttest(),dashboard.getRunning_method_name(),dashboard.getTest_passed(),dashboard.getTest_failed()});
		
	}

	public void updateDashbaord(Dashboard dashboard) {
		String sql="update dashboard_new set currenttest=?, running_method_name=?,test_passed=?, test_failed=?  where testclass=?";
		jdbcTemplate.update(sql, new Object[]{dashboard.getCurrenttest(),dashboard.getRunning_method_name(),dashboard.getTest_passed(),dashboard.getTest_failed(),dashboard.getTestclassname()});
	}

	public void deleteDasboard(Dashboard dashboard) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAllDasboard() {
		String sql="delete from dashboard_new";
		jdbcTemplate.update(sql);
	}

	public String getDashbaord(String testclassname) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static final class DashbaordRowMapper implements RowMapper<Dashboard>{

		public Dashboard mapRow(ResultSet rs, int rowNum) throws SQLException {
			Dashboard dashboard=new Dashboard();
			dashboard.setTestclassname(rs.getString("testclass"));
			dashboard.setRunning_method_name(rs.getString("running_method_name"));
			dashboard.setTotaltests(rs.getInt("totaltest"));
			dashboard.setCurrenttest(rs.getInt("currenttest"));
			dashboard.setCurrenttest(rs.getInt("test_failed"));
			dashboard.setCurrenttest(rs.getInt("test_passed"));
			return dashboard;
		}
		
	}
		
}
