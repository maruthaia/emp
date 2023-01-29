package com.employee.model;

import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.persistence.Id;

@Document(collection = "emp")
public class Employee {
	@Id
	private Integer empId;
	private String name;
	private Integer age;
	private String gender;
	private String address;
	private String emailId;
	private String jobTitle;
	private Integer phoneNumber;
	private String place;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer string) {
		this.empId = string;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
