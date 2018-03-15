package com.bridgelabz.utility;

import org.json.simple.JSONObject;


public class Clinique {
	
	String doctorFile="/home/bridgeit/project/File/Doctor.json";
	String patientFile="/home/bridgeit/project/File/Patient.json";
	String appointmentFile="/home/bridgeit/project/File/Appointments.json";
	public void addDoctor(Doctor doctor)
	{
		JSONObject jsonObject=Utility.readJsonFile(doctorFile);
		JSONObject doctorObject=new JSONObject();
		doctorObject.put("Name",doctor.getDoctorName());
		doctorObject.put("Specialization",doctor.getSpecialization());
		doctorObject.put("Availibility",doctor.getAvailibity());
		jsonObject.put(doctor.getDoctorId(),doctorObject);
		Utility.writeJsonFile(doctorFile, jsonObject);
		
	}
	public void addDPatient(Patient patient)
	{
		JSONObject jsonObject=Utility.readJsonFile(patientFile);
		JSONObject patientObject=new JSONObject();
		patientObject.put("Name",patient.getPatientName());
		patientObject.put("MobileNo",patient.getMobileNo());
		jsonObject.put(patient.getPatientId(),patientObject);
		Utility.writeJsonFile(patientFile, jsonObject);
		
	}


}
