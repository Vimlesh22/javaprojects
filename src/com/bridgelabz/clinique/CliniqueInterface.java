package com.bridgelabz.clinique;

import java.util.List;

public interface CliniqueInterface 
{
	public void readFile();
	public void addDoctor();
	public void writeDoctor();
	public void displayDoctor();
	public void addPatient();
	public void writePatient();
	public void displayPatient();
	public Doctor searchDoctorById(int id);
	public Doctor searchDoctorByName(String name);
	public List<Doctor> searchDoctorBySpecialization(String specialization);
	public List<Doctor> searchDoctorByAvailability(String availability);
	public Patient searchPatientByName(String patientName2);
	public Patient searchPatientById(int patientId);
	public Patient searchPatientByPhoneNo(long phoneNo);
	public void takeAppointment(String doctorName2, String patientName1) ;
	public void popularDoctor();

}
