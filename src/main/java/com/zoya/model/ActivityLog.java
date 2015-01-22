package com.zoya.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
public class ActivityLog {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
	private int dashboardID;
	private String currentactivity;
	private Date date=new Date();
	@JsonSerialize(using=JsonDateSerializer.class)	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCurrentactivity() {
		return currentactivity;
	}
	public void setCurrentactivity(String currentactivity) {
		this.currentactivity = currentactivity;
	}
	public int getDashboardID() {
		return dashboardID;
	}
	public void setDashboardID(int dashboardID) {
		this.dashboardID = dashboardID;
	}
	
	
	
}
