package com.bridgelabz.clinique;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.utility.Utility;

public class Clinique {
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
	
	public void readFile() throws JsonParseException, JsonMappingException, IOException
	{
		doctorList=new ArrayList<Doctor>(Arrays.asList(objectMapper.readValue(doctorFile,Doctor[].class)));
		patientList=new ArrayList<Patient>(Arrays.asList(objectMapper.readValue(patientFile,Patient[].class)));
		
	}
	
	
	
	public void addDoctor() throws JsonParseException, JsonMappingException, IOException
	{
		objectMapper=new ObjectMapper();
		doctorList=new ArrayList<Doctor>(Arrays.asList(objectMapper.readValue(doctorFile,Doctor[].class)));
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
	
	public void writeDoctor() throws JsonGenerationException, JsonMappingException, IOException
	{
		objectMapper=new ObjectMapper();
		objectMapper.writerWithDefaultPrettyPrinter().writeValue(doctorFile, doctorList);
	}
	
	
	public void addPatient() throws JsonParseException, JsonMappingException, IOException
	{
		objectMapper=new ObjectMapper();
		patientList=new ArrayList<Patient>(Arrays.asList(objectMapper.readValue(patientFile,Patient[].class)));
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
	
	public void writePatient() throws JsonGenerationException, JsonMappingException, IOException
	{
		objectMapper=new ObjectMapper();
		objectMapper.writerWithDefaultPrettyPrinter().writeValue(patientFile, patientList);
	}
	
	public void displayDoctor() throws JsonParseException, JsonMappingException, IOException
	{
		objectMapper=new ObjectMapper();
		Iterator<Doctor> iterator=doctorList.iterator();
		while(iterator.hasNext())
		{

			System.out.println(iterator.next());
		}
				
		
	}
	
	public void displayPatient() throws JsonParseException, JsonMappingException, IOException
	{
		objectMapper=new ObjectMapper();
		Iterator<Patient> iterator=patientList.iterator();
		while(iterator.hasNext())
		{

			System.out.println(iterator.next());
		}
		
	}

	public Doctor searchDoctorById(int id) throws JsonParseException, JsonMappingException, IOException {
		
		objectMapper=new ObjectMapper();
		Doctor result;
		doctorList=new ArrayList<Doctor>(Arrays.asList(objectMapper.readValue(doctorFile,Doctor[].class)));
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

	

	public Doctor searchDoctorByName(String name) throws JsonParseException, JsonMappingException, IOException {
		
		objectMapper=new ObjectMapper();
		Doctor result;
		doctorList=new ArrayList<Doctor>(Arrays.asList(objectMapper.readValue(doctorFile,Doctor[].class)));
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

	public List<Doctor> searchDoctorBySpecialization(String specialization) throws JsonParseException, JsonMappingException, IOException {
		objectMapper=new ObjectMapper();
		List<Doctor> result=new ArrayList<>();
		doctorList=new ArrayList<Doctor>(Arrays.asList(objectMapper.readValue(doctorFile,Doctor[].class)));
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

	public List<Doctor> searchDoctorByAvailability(String availability) throws JsonParseException, JsonMappingException, IOException {
		objectMapper=new ObjectMapper();
		List<Doctor> result=new ArrayList<>();
		doctorList=new ArrayList<Doctor>(Arrays.asList(objectMapper.readValue(doctorFile,Doctor[].class)));
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

	public Patient searchPatientByName(String patientName2) throws JsonParseException, JsonMappingException, IOException {
		
		objectMapper=new ObjectMapper();
		Patient result;
		patientList=new ArrayList<Patient>(Arrays.asList(objectMapper.readValue(patientFile,Patient[].class)));
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

	public Patient searchPatientById(int patientId) throws JsonParseException, JsonMappingException, IOException {
		objectMapper=new ObjectMapper();
		Patient result;
		patientList=new ArrayList<Patient>(Arrays.asList(objectMapper.readValue(patientFile,Patient[].class)));
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

	public Patient searchPatientByPhoneNo(long phoneNo) throws JsonParseException, JsonMappingException, IOException {
		objectMapper=new ObjectMapper();
		Patient result;
		patientList=new ArrayList<Patient>(Arrays.asList(objectMapper.readValue(patientFile,Patient[].class)));
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

	public void takeAppointment(String doctorName2, String patientName1) throws JsonParseException, JsonMappingException, IOException 
	{
		patientList=new ArrayList<Patient>(Arrays.asList(objectMapper.readValue(patientFile,Patient[].class)));
		doctorList=new ArrayList<Doctor>(Arrays.asList(objectMapper.readValue(doctorFile,Doctor[].class)));
		appointmentList = objectMapper.readValue(appointmentFile, TreeMap.class);
//		appointmentList=new HashMap<>();
		Iterator<Patient> patientIterator=patientList.iterator();
		Iterator<Doctor> doctorIterator=doctorList.iterator();
		Set<Patient> addPatient=new HashSet<>();
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
							mapper.writerWithDefaultPrettyPrinter().writeValue(appointmentFile, appointmentList);
							doctor.setNoOfPatients(doctor.getNoOfPatients()+1);
							objectMapper.writerWithDefaultPrettyPrinter().writeValue(doctorFile, doctorList);
							
						}
					}
				}
			}	
		}
	
	}
	
	
	public void popularDoctor()
	{
		int[] noOfPatient=new int[doctorList.size()];
		int count=0;
		Iterator<Doctor> iterator=doctorList.iterator();
		while(iterator.hasNext())
		{
			Doctor doctor=iterator.next();
			noOfPatient[count]=doctor.getNoOfPatients()		;
			count++;
		}
	}
}

