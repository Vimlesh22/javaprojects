package com.bridgelabz.clinique;

public class Doctor {
	private int id;
	private String doctorName;
	private String specialization;
	private String availability;
	private int noOfPatients;
	
	
	
	
	
	public Doctor() {
		noOfPatients=0;
		
	}
	
	public Doctor(String doctorName, String specialization, String availability, int noOfPatients) {
		
		
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.availability = availability;
		this.noOfPatients = noOfPatients;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public int getNoOfPatients() {
		return noOfPatients;
	}
	public void setNoOfPatients(int noOfPatients) {
		this.noOfPatients = noOfPatients;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", doctorName=" + doctorName + ", specialization=" + specialization
				+ ", availability=" + availability + ", noOfPatients=" + noOfPatients + "]";
	}
	
	
	
	

}
