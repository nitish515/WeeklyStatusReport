package com.capgemini.beans;

public class Project {
	private int projectID;
	private String projectName;
	private String countryName;
	private int streamID;
	
	public Project() {
		super();
	}
	
	

	public int getProjectID() {
		return projectID;
	}

	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getStreamID() {
		return streamID;
	}

	public void setStreamID(int streamID) {
		this.streamID = streamID;
	}
	
	
}
