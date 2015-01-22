package com.zoya.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;




/**
 * User: 
 * Date: 12/14/14
 * Time: 1:04 PM
 *
 * DashboardTest will map to a single row in a DB
 */

@Entity
public class DashboardTest {

    private String dashboardID;  // id of the dashboard that this test belongs to
    
    

	private int id;
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private String testID; // PK

    private String testName;
    private boolean isRunning;
    private boolean passed;

    private long currentExecutionTime; // current time while isRunning = true
    private long runTime; // total run time

    private String shortMessage;  // could contain error message from test (on UI it has ... after the message)
    private String fullMessage;  // could contain full stack trace, exception details, etc.




    
	public String getDashboardID() {
        return dashboardID;
    }

    public void setDashboardID(String dashboardID) {
        this.dashboardID = dashboardID;
    }

    public String getTestID() {
        return testID;
    }

    public void setTestID(String testID) {
        this.testID = testID;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public long getRunTime() {
        return runTime;
    }

    public void setRunTime(long runTime) {
        this.runTime = runTime;
    }

    public String getShortMessage() {
        return shortMessage;
    }

    public void setShortMessage(String shortMessage) {
        this.shortMessage = shortMessage;
    }

    public String getFullMessage() {
        return fullMessage;
    }

    public void setFullMessage(String fullMessage) {
        this.fullMessage = fullMessage;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DashboardTest that = (DashboardTest) o;

        if (passed != that.passed) {
            return false;
        }
        if (runTime != that.runTime) {
            return false;
        }
        if (!dashboardID.equals(that.dashboardID)) {
            return false;
        }
        if (fullMessage != null ? !fullMessage.equals(that.fullMessage) : that.fullMessage != null) {
            return false;
        }
        if (shortMessage != null ? !shortMessage.equals(that.shortMessage) : that.shortMessage != null) {
            return false;
        }
        if (!testID.equals(that.testID)) {
            return false;
        }
        if (!testName.equals(that.testName)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = dashboardID.hashCode();
        result = 31 * result + testID.hashCode();
        result = 31 * result + testName.hashCode();
        result = 31 * result + (passed ? 1 : 0);
        result = 31 * result + (int) (runTime ^ (runTime >>> 32));
        result = 31 * result + (shortMessage != null ? shortMessage.hashCode() : 0);
        result = 31 * result + (fullMessage != null ? fullMessage.hashCode() : 0);
        return result;
    }
}

