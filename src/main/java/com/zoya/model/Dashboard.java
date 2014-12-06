package com.zoya.model;

public class Dashboard {
	private String testclassname;
	private String running_method_name;
	private int totaltests;
	private int currenttest;
	private int test_failed;
	private int test_passed;

	
	
	public Dashboard(){}



	public String getTestclassname() {
		return testclassname;
	}



	public void setTestclassname(String testclassname) {
		this.testclassname = testclassname;
	}



	public String getRunning_method_name() {
		return running_method_name;
	}



	public void setRunning_method_name(String running_method_name) {
		this.running_method_name = running_method_name;
	}



	public int getTotaltests() {
		return totaltests;
	}



	public void setTotaltests(int totaltests) {
		this.totaltests = totaltests;
	}



	public int getCurrenttest() {
		return currenttest;
	}



	public void setCurrenttest(int currenttest) {
		this.currenttest = currenttest;
	}



	public int getTest_failed() {
		return test_failed;
	}



	public void setTest_failed(int test_failed) {
		this.test_failed = test_failed;
	}



	public int getTest_passed() {
		return test_passed;
	}



	public void setTest_passed(int test_passed) {
		this.test_passed = test_passed;
	}



	public Dashboard(String testclassname, String running_method_name,
			int totaltests, int currenttest, int test_failed, int test_passed) {
		super();
		this.testclassname = testclassname;
		this.running_method_name = running_method_name;
		this.totaltests = totaltests;
		this.currenttest = currenttest;
		this.test_failed = test_failed;
		this.test_passed = test_passed;
	}
	
	

}
