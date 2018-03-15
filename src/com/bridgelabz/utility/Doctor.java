package com.bridgelabz.utility;

public class Doctor {
	
	int doctorId;
	String doctorName;
	String specialization;
	String availibity;
	public Doctor(int doctorId, String doctorName, String specialization, String availibity) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.availibity = availibity;
	}
	public Doctor() {
		super();
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getAvailibity() {
		return availibity;
	}
	public void setAvailibity(String availibity) {
		this.availibity = availibity;
	}
	
	
	
	

}
