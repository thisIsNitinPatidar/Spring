package com.springProject.FirstStpring;

public class Student 
{
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int studentId;
	private String studentName;
	private String studentCity;
	private String studentBranch;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ ", studentBranch=" + studentBranch + "]";
	}
	public Student(int studentId, String studentName, String studentCity, String studentBranch) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
		this.studentBranch = studentBranch;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public String getStudentBranch() {
		return studentBranch;
	}
	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}

}
