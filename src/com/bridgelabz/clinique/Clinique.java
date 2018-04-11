package com.bridgelabz.clinique;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import java.util.Iterator;
import java.util.List;
import java.util.Map;




import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


import com.bridgelabz.utility.Utility;

public class Clinique implements CliniqueInterface{
	int id;
	String doctorName,availability,patientName,doctorSpecialization;
	ObjectMapper objectMapper=new ObjectMapper();
	int noOfPatient,age;
	long patientPhoneNo;
	Patient patient;
	List<Doctor> doctorList;
	List<Patient> patientList;
	Map<String, List<Patient>> appointmentList;
	Utility utility=new Utility();
	String appointmentPath="/home/bridgeit/project/CliniqueFiles/Appointment.txt";
	File appointmentFile=new File(appointmentPath);
	String doctorPath="/home/bridgeit/project/CliniqueFiles/Doctor.txt";
	File doctorFile=new File(doctorPath);
	String patientPath="/home/bridgeit/project/CliniqueFiles/Patient.txt";
	File patientFile=new File(patientPath);
	
	@Override
	public void readFile() 
	{
		try {
			doctorList=new ArrayList<Doctor>(Arrays.asList(objectMapper.readValue(doctorFile,Doctor[].class)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			patientList=new ArrayList<Patient>(Arrays.asList(objectMapper.readValue(patientFile,Patient[].class)));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	public void addDoctor()
	{
		objectMapper=new ObjectMapper();
		try {
			doctorList=new ArrayList<Doctor>(Arrays.asList(objectMapper.readValue(doctorFile,Doctor[].class)));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("Enter Doctor ID");
		id=utility.nextInt();
		System.out.println("Enter Doctor Name:");
		doctorName=utility.next();
		System.out.println("Enter Specialization:");
		doctorSpecialization=utility.next();
		System.out.println("Enter Availability:");
		availability=utility.next();
		Doctor doctor=new Doctor(id,doctorName,doctorSpecialization,availability,noOfPatient);
		doctorList.add(doctor);
		System.out.println("Doctor Added SuccessFully!!!");
		
	}
	@Override
	public void writeDoctor() 
	{
		objectMapper=new ObjectMapper();
		try {
			objectMapper.writerWithDefaultPrettyPrinter().writeValue(doctorFile, doctorList);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	@Override
	public void addPatient() 
	{
		objectMapper=new ObjectMapper();
		try {
			patientList=new ArrayList<Patient>(Arrays.asList(objectMapper.readValue(patientFile,Patient[].class)));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("Enter Patient ID");
		id=utility.nextInt();
		System.out.println("Enter Patient Name:");
		patientName=utility.next();
		System.out.println("Enter Patient Phone Number:");
		patientPhoneNo=utility.nextLong();
		System.out.println("Enter Patient Age:");
		age=utility.nextInt();
		Patient patient=new Patient(id,patientName,patientPhoneNo, age);
		patientList.add(patient);
		System.out.println("Patient Added SuccessFully!!!");
		
	}
	@Override
	public void writePatient() 
	{
		objectMapper=new ObjectMapper();
		try {
			objectMapper.writerWithDefaultPrettyPrinter().writeValue(patientFile, patientList);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	@Override
	public void displayDoctor()
	{
		objectMapper=new ObjectMapper();
		Iterator<Doctor> iterator=doctorList.iterator();
		while(iterator.hasNext())
		{

			System.out.println(iterator.next());
		}
				
		
	}
	@Override
	public void displayPatient() 
	{
		objectMapper=new ObjectMapper();
		Iterator<Patient> iterator=patientList.iterator();
		while(iterator.hasNext())
		{

			System.out.println(iterator.next());
		}
		
	}
	@Override
	public Doctor searchDoctorById(int id)  {
		
		objectMapper=new ObjectMapper();
		Doctor result;
		try {
			doctorList=new ArrayList<Doctor>(Arrays.asList(objectMapper.readValue(doctorFile,Doctor[].class)));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Iterator<Doctor> iterator=doctorList.iterator();
		while(iterator.hasNext())
		{
			Doctor doctor=(Doctor)iterator.next();
			if(doctor.getId()==id)
			{
				result=doctorList.get(id-1);
				return result;
			}
		}
		return null;
		
		
		
	}

	
	@Override
	public Doctor searchDoctorByName(String name)  {
		
		objectMapper=new ObjectMapper();
		Doctor result;
		try {
			doctorList=new ArrayList<Doctor>(Arrays.asList(objectMapper.readValue(doctorFile,Doctor[].class)));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Iterator<Doctor> iterator=doctorList.iterator();
		while(iterator.hasNext())
		{
			Doctor doctor=(Doctor)iterator.next();
			if(doctor.getDoctorName().equalsIgnoreCase(name))
			{
				result=doctorList.get(doctor.getId()-1);
				return result;
			}
		}
		return null;
		
	}
	@Override
	public List<Doctor> searchDoctorBySpecialization(String specialization)  {
		objectMapper=new ObjectMapper();
		List<Doctor> result=new ArrayList<>();
		try {
			doctorList=new ArrayList<Doctor>(Arrays.asList(objectMapper.readValue(doctorFile,Doctor[].class)));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Iterator<Doctor> iterator=doctorList.iterator();
		while(iterator.hasNext())
		{
			Doctor doctor=(Doctor)iterator.next();
			if(doctor.getSpecialization().equalsIgnoreCase(specialization))
			{
				result.add(doctor);
			}
		}
		return result;
		
	}
	@Override
	public List<Doctor> searchDoctorByAvailability(String availability)  {
		objectMapper=new ObjectMapper();
		List<Doctor> result=new ArrayList<>();
		try {
			doctorList=new ArrayList<Doctor>(Arrays.asList(objectMapper.readValue(doctorFile,Doctor[].class)));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Iterator<Doctor> iterator=doctorList.iterator();
		while(iterator.hasNext())
		{
			Doctor doctor=(Doctor)iterator.next();
			if(doctor.getAvailability().equalsIgnoreCase(availability))
			{
				result.add(doctor);
			}
		}
		return result;
	}
	@Override
	public Patient searchPatientByName(String patientName2)   {
		
		objectMapper=new ObjectMapper();
		Patient result;
		try {
			patientList=new ArrayList<Patient>(Arrays.asList(objectMapper.readValue(patientFile,Patient[].class)));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Iterator<Patient> iterator=patientList.iterator();
		while(iterator.hasNext())
		{
			patient=(Patient)iterator.next();
			if(patient.getPatientName().equalsIgnoreCase(patientName2))
			{
				result=patientList.get(patient.getId()-1);
				return result;
			}
		}
		return null;
	}
	@Override
	public Patient searchPatientById(int patientId)  {
		objectMapper=new ObjectMapper();
		Patient result;
		try {
			patientList=new ArrayList<Patient>(Arrays.asList(objectMapper.readValue(patientFile,Patient[].class)));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Iterator<Patient> iterator=patientList.iterator();
		while(iterator.hasNext())
		{
			patient=(Patient)iterator.next();
			if(patient.getId()==patientId)
			{
				result=patientList.get(patient.getId()-1);
				return result;
			}
		}
		return null;
	}
	@Override
	public Patient searchPatientByPhoneNo(long phoneNo)  {
		objectMapper=new ObjectMapper();
		Patient result;
		try {
			patientList=new ArrayList<Patient>(Arrays.asList(objectMapper.readValue(patientFile,Patient[].class)));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Iterator<Patient> iterator=patientList.iterator();
		while(iterator.hasNext())
		{
			patient=(Patient)iterator.next();
			if(patient.getPhoneNumber()==phoneNo)
			{
				result=patientList.get(patient.getId()-1);
				return result;
			}
		}
		return null;
	}
	@Override
	@SuppressWarnings("unchecked")
	public void takeAppointment(String doctorName2, String patientName1)   
	{
		try {
			patientList=new ArrayList<Patient>(Arrays.asList(objectMapper.readValue(patientFile,Patient[].class)));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try {
			doctorList=new ArrayList<Doctor>(Arrays.asList(objectMapper.readValue(doctorFile,Doctor[].class)));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try {
			appointmentList = objectMapper.readValue(appointmentFile, HashMap.class);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
//		appointmentList=new HashMap<>();
		Iterator<Patient> patientIterator=patientList.iterator();
		Iterator<Doctor> doctorIterator=doctorList.iterator();
//		List<Patient> listOfPatient=new ArrayList<>();
		List<Patient> listOfPatient;
		while(patientIterator.hasNext())
		{
			patient=(Patient)patientIterator.next();
			if(patient.getPatientName().equalsIgnoreCase(patientName1))
			{
				while(doctorIterator.hasNext())
				{
					Doctor doctor=doctorIterator.next();
					if(doctor.getDoctorName().equalsIgnoreCase(doctorName2))
					{
						if(doctor.getNoOfPatients()<5)
						{
							if(doctor.getNoOfPatients()==0)
							{
								listOfPatient=new ArrayList<>();
								listOfPatient.add(patient);
								appointmentList.put(doctorName2, listOfPatient);
								
							}
							else
							{
							listOfPatient=appointmentList.get(doctorName2);
							listOfPatient.add(patient);
							appointmentList.put(doctorName2, listOfPatient);
							}
							ObjectMapper mapper=new ObjectMapper();
							try {
								mapper.writerWithDefaultPrettyPrinter().writeValue(appointmentFile, appointmentList);
							} catch (IOException e) {
								
								e.printStackTrace();
							}
							doctor.setNoOfPatients(doctor.getNoOfPatients()+1);
							try {
								objectMapper.writerWithDefaultPrettyPrinter().writeValue(doctorFile, doctorList);
							} catch (IOException e) {
								
								e.printStackTrace();
							}
							
						}
					}
				}
			}	
		}
	
	}
	
	@Override
	public void popularDoctor()
	{
		int[] noOfPatient=new int[doctorList.size()];
		int count=0;
		Iterator<Doctor> iterator=doctorList.iterator();
		while(iterator.hasNext())
		{
			Doctor doctor=iterator.next();
			noOfPatient[count]=doctor.getNoOfPatients();
			count++;
		}
	}
}

