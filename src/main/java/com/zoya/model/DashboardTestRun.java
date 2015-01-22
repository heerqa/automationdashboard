package com.zoya.model;
/*
 * This is temporray class, will be using class as sugeested by Vadim
 * 
 */
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
public class DashboardTestRun {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int id;
	private int dashboardId;
	private String methodName;
	private String errorMessage;
	private byte[] errorScreen;
	private String status;
	private Date creationdate=new Date();
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public int getDashboardId() {
		return dashboardId;
	}
	public void setDashboardId(int dashboardId) {
		this.dashboardId = dashboardId;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public byte[] getErrorScreen() {
		return errorScreen;
	}
	public void setErrorScreen(byte[] errorScreen) {
		this.errorScreen = errorScreen;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@JsonSerialize(using=JsonDateSerializer.class)	
	public Date getCreationdate() {
		return creationdate;
	}
	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}
	
	
}
