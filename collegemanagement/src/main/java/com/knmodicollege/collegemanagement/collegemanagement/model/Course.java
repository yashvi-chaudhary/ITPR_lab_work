package com.knmodicollege.collegemanagement.collegemanagement.model;

public class Course 
{
	//to store course id
	private String courseId;
	//to store course name
	private String courseName;
	//to store description
	private String description;
	//to store duration in hours
	private int duration;
	//to store minimum enrollment
	private int minEnrollment;
	//to store maximum enrollement
	private int maxEnrollment;
	//Default constructor
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Parameterised constructor
	public Course(String courseId, String courseName, String description, int duration, int minEnrollment,
			int maxEnrollment) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.description = description;
		this.duration = duration;
		this.minEnrollment = minEnrollment;
		this.maxEnrollment = maxEnrollment;
	}
	//getter and setter methods
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getMinEnrollment() {
		return minEnrollment;
	}
	public void setMinEnrollment(int minEnrollment) {
		this.minEnrollment = minEnrollment;
	}
	public int getMaxEnrollment() {
		return maxEnrollment;
	}
	public void setMaxEnrollment(int maxEnrollment) {
		this.maxEnrollment = maxEnrollment;
	}
	@Override
	public String toString() {
		return "Course Id : " + courseId 
				+ "\n Course Name : " + courseName 
				+ "\n Description : " + description
				+ "\n Duration : " + duration +" Hour"
				+ "\n Minimum Enrollment Required : " + minEnrollment 
				+ "\n Maximum Enrollment Required : " + maxEnrollment
				+ "\n------------------------------------------------------\n";
	}
	
	
	
}
