package com.bridgelabz.utility;

public class Patient {
	
	private String patientName;
	private int patientId;
	private long mobileNo;
	
	public Patient(String patientName, int patientId, long mobileNo) {
		super();
		this.patientName = patientName;
		this.patientId = patientId;
		this.mobileNo = mobileNo;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	

}
