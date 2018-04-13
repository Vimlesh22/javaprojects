package com.bridgelabz.clinique;

public class Patient {

	private int id;
	private String patientName;
	private long phoneNumber;
	private int age;
	public Patient(int id,String patientName, long phoneNumber, int age) {
		super();
		this.id = id;
		this.patientName = patientName;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}
	public Patient() {
		
	}	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", patientName=" + patientName + ", phoneNumber=" + phoneNumber + ", age=" + age
				+ "]";
	}
}
