package com.springProject.Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student 
{
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sId, String sName, List<String> phone, Set<String> address, Map<String, String> courses) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.phone = phone;
		this.address = address;
		this.courses = courses;
	}
	private int sId;
	private String sName;
	private List<String>phone;
	private Set<String> address;
	private Map<String,String> courses;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

}
