package com.knmodicollege.collegemanagement.collegemanagement.model;

public class Faculty 
{
	//to store faculty id
	private String facultyId;
	//to store faculty name
	private String facultyName;
	//to store qualification
	private String qualification;
	//to store status of the faculty
	private String status;
	//Default Constructor
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Parameterised Constructor
	public Faculty(String facultyId, String facultyName, String qualification, String status) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.qualification = qualification;
		this.status = status;
	}
	// Getter and setters
	public String getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	//Overriding to toString() method
	@Override
	public String toString() {
		return "Faculty Id : " + facultyId 
				+ "\n Faculty Name : " + facultyName 
				+ "\n Qualification : " + qualification
				+ "\n Status : " + status 
				+ "\n---------------------------\n";
	}
	
	
}
