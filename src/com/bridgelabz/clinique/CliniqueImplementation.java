/**
 * Purpose:This Class maintains all the functionality for the Clinique.
 * @author Vimlesh Kumar
 * @version 1.0
 * @since 13 April 2018
 *
 */
package com.bridgelabz.clinique;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.codehaus.jackson.map.ObjectMapper;
import com.bridgelabz.utility.Utility;
public class CliniqueImplementation implements CliniqueInterface {
	int id;
	String doctorName;
	String availability;
	String patientName;
	String doctorSpecialization;
	ObjectMapper objectMapper = new ObjectMapper();
	int noOfPatient;
	int age;
	long patientPhoneNo;
	Patient patient;
	List<Doctor> doctorList;
	List<Patient> patientList;
	Map<String, List<Patient>> appointmentList;
	Utility utility = new Utility();
	String appointmentPath = "/home/bridgeit/project/CliniqueFiles/Appointment.txt";
	File appointmentFile = new File(appointmentPath);
	String doctorPath = "/home/bridgeit/project/CliniqueFiles/Doctor.txt";
	File doctorFile = new File(doctorPath);
	String patientPath = "/home/bridgeit/project/CliniqueFiles/Patient.txt";
	File patientFile = new File(patientPath);
	/** 
	 *Purpose:Reads Doctor And patient List from file and stores data in ArrayList of Doctor 
	 *and Array List of Patient
	 */
	@Override
	public void readFile() 
	{
		try 
		{
			doctorList = new ArrayList<>(Arrays.asList(objectMapper.readValue(doctorFile, Doctor[].class)));
			patientList = new ArrayList<>(Arrays.asList(objectMapper.readValue(patientFile, Patient[].class)));
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Purpose:Adds Doctor Details in file.
	 */
	@Override
	public void addDoctor() 
	{
		try 
		{
			doctorList = new ArrayList<>(Arrays.asList(objectMapper.readValue(doctorFile, Doctor[].class)));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Enter Doctor ID");
		id = utility.nextInt();
		System.out.println("Enter Doctor Name:");
		doctorName = utility.next();
		System.out.println("Enter Specialization:");
		doctorSpecialization = utility.next();
		System.out.println("Enter Availability:");
		availability = utility.next();
		Doctor doctor = new Doctor(doctorName, doctorSpecialization, availability, noOfPatient);
		doctor.setId(doctor.hashCode());
		doctorList.add(doctor);
		System.out.println("Doctor Added SuccessFully!!!");
	}
	/**
	 * Purpose:Save Doctor Details after adding into file	 
	 */
	@Override
	public void saveDoctor() 
	{
		try 
		{
			objectMapper.writerWithDefaultPrettyPrinter().writeValue(doctorFile, doctorList);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Purpose:Add Doctor Details into file	 
	 */
	@Override
	public void addPatient() 
	{
		try 
		{
			patientList = new ArrayList<>(Arrays.asList(objectMapper.readValue(patientFile, Patient[].class)));
		} 
		catch (IOException e) 
		{

			e.printStackTrace();
		}
		System.out.println("Enter Patient ID");
		id = utility.nextInt();
		System.out.println("Enter Patient Name:");
		patientName = utility.next();
		System.out.println("Enter Patient Phone Number:");
		patientPhoneNo = utility.nextLong();
		System.out.println("Enter Patient Age:");
		age = utility.nextInt();
		Patient patient = new Patient(id, patientName, patientPhoneNo, age);
		patientList.add(patient);
		System.out.println("Patient Added SuccessFully!!!");
	}
	/**
	 * Purpose:Save Patient Details after adding into file	 
	 */
	@Override
	public void savePatient() 
	{
		try 
		{
			objectMapper.writerWithDefaultPrettyPrinter().writeValue(patientFile, patientList);
		} 
		catch (IOException e) 
		{

			e.printStackTrace();
		}
	}
	/**
	 * Purpose:Display All the Available Doctor Details. 	 
	 */
	@Override
	public void displayDoctor() 
	{
		Iterator<Doctor> iterator = doctorList.iterator();
		while (iterator.hasNext()) 
		{
			System.out.println(iterator.next());
		}
	}
	/**
	 * Purpose:Display All the Available Patient Details. 	 
	 */
	@Override
	public void displayPatient() 
	{
		Iterator<Patient> iterator = patientList.iterator();
		while (iterator.hasNext()) 
		{
			System.out.println(iterator.next());
		}
	}
	
	@Override
	public void menu()
	{
		System.out.println("*****************Menu*********************");
		System.out.println("1)Add Doctor");
		System.out.println("2)Write Doctor list in file");
		System.out.println("3)Display Doctor list");
		System.out.println("4)Add Patient");
		System.out.println("5)Save Patient in file");
		System.out.println("6)Display Patient");
		System.out.println("7)Search Doctor By Id");
		System.out.println("8)Search Doctor By Name");
		System.out.println("9)Search Doctor By Specialization");
		System.out.println("10)Serach Doctor By Availability");
		System.out.println("11)Search Patient By Name");
		System.out.println("12)Search Patient By Id");
		System.out.println("13)Search Patient By Phone Number");
		System.out.println("14)Take Appointment ");
		System.out.println("15)Find Popular Doctor");
		System.out.println("16)Exit Program");
		System.out.println("********************************************");
	}
	/**
	 * Purpose:Search Doctor By Id And Displays Details of Doctor if it found in file. 	 
	 */
	@Override
	public Doctor searchDoctorById(int id) 
	{
		Doctor result;
		try 
		{
			doctorList = new ArrayList<>(Arrays.asList(objectMapper.readValue(doctorFile, Doctor[].class)));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		Iterator<Doctor> iterator = doctorList.iterator();
		while (iterator.hasNext()) 
		{
			Doctor doctor = (Doctor) iterator.next();
			if (doctor.getId() == id) 
			{
				result = doctorList.get(id - 1);
				return result;
			}
		}
		return null;
	}
	/**
	 * Purpose:Search Doctor By Name And Displays Details of Doctor if it found in file. 	 
	 */
	@Override
	public Doctor searchDoctorByName(String name) 
	{
		Doctor result;
		try 
		{
			doctorList = new ArrayList<>(Arrays.asList(objectMapper.readValue(doctorFile, Doctor[].class)));
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		Iterator<Doctor> iterator = doctorList.iterator();
		while (iterator.hasNext()) 
		{
			Doctor doctor = (Doctor) iterator.next();
			if (doctor.getDoctorName().equalsIgnoreCase(name)) 
			{
				result = doctorList.get(doctor.getId() - 1);
				return result;
			}
		}
		return null;
	}
	/**
	 * Purpose:Search Doctor By Specialization And Displays Details of Doctor if it found in file. 	 
	 */
	@Override
	public List<Doctor> searchDoctorBySpecialization(String specialization)
	{
		List<Doctor> result = new ArrayList<>();
		try 
		{
			doctorList = new ArrayList<>(Arrays.asList(objectMapper.readValue(doctorFile, Doctor[].class)));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		Iterator<Doctor> iterator = doctorList.iterator();
		while (iterator.hasNext())
		{
			Doctor doctor = (Doctor) iterator.next();
			if (doctor.getSpecialization().equalsIgnoreCase(specialization))
			{
				result.add(doctor);
			}
		}
		return result;
	}
	/**
	 * Purpose:Search Doctor By Availability And Displays Details of Doctor if it found in file. 	 
	 */
	@Override
	public List<Doctor> searchDoctorByAvailability(String availability)
	{
		List<Doctor> result = new ArrayList<>();
		try 
		{
			doctorList = new ArrayList<>(Arrays.asList(objectMapper.readValue(doctorFile, Doctor[].class)));
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		Iterator<Doctor> iterator = doctorList.iterator();
		while (iterator.hasNext()) 
		{
			Doctor doctor = (Doctor) iterator.next();
			if (doctor.getAvailability().equalsIgnoreCase(availability)) 
			{
				result.add(doctor);
			}
		}
		return result;
	}
	/**
	 * Purpose:Search Patient By Name And Displays Details of Patient if it found in file. 	 
	 */
	@Override
	public Patient searchPatientByName(String patientName2) 
	{
		Patient result;
		try 
		{
			patientList = new ArrayList<>(Arrays.asList(objectMapper.readValue(patientFile, Patient[].class)));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		Iterator<Patient> iterator = patientList.iterator();
		while (iterator.hasNext()) 
		{
			patient = (Patient) iterator.next();
			if (patient.getPatientName().equalsIgnoreCase(patientName2))
			{
				result = patientList.get(patient.getId() - 1);
				return result;
			}
		}
		return null;
	}
	/**
	 * Purpose:Search Patient By Id And Displays Details of Patient if it found in file. 	 
	 */
	@Override
	public Patient searchPatientById(int patientId) 
	{
		Patient result;
		try 
		{
			patientList = new ArrayList<>(Arrays.asList(objectMapper.readValue(patientFile, Patient[].class)));
		} 
		catch (IOException e) 
		{

			e.printStackTrace();
		}
		Iterator<Patient> iterator = patientList.iterator();
		while (iterator.hasNext()) 
		{
			patient = (Patient) iterator.next();
			if (patient.getId() == patientId) 
			{
				result = patientList.get(patient.getId() - 1);
				return result;
			}
		}
		return null;
	}
	/**
	 * Purpose:Search Patient By PhoneNo And Displays Details of Patient if it found in file. 	 
	 */
	@Override
	public Patient searchPatientByPhoneNo(long phoneNo) 
	{
		Patient result;
		try
		{
			patientList = new ArrayList<>(Arrays.asList(objectMapper.readValue(patientFile, Patient[].class)));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		Iterator<Patient> iterator = patientList.iterator();
		while (iterator.hasNext())
		{
			patient = (Patient) iterator.next();
			if (patient.getPhoneNumber() == phoneNo)
			{
				result = patientList.get(patient.getId() - 1);
				return result;
			}
		}
		return null;
	}
	/**
	 * Purpose:Take Appointment to visit doctor if doctor is available.
	 * @param doctorName is the Name of Doctor from which patient wants to take appointment.
	 * @param patientName is the Name of Patient who wants to take the appointment	 
	 */
	@Override
	@SuppressWarnings("unchecked")
	public void takeAppointment(String doctorName, String patientName) 
	{
		try
		{
			patientList = new ArrayList<>(Arrays.asList(objectMapper.readValue(patientFile, Patient[].class)));
			doctorList = new ArrayList<>(Arrays.asList(objectMapper.readValue(doctorFile, Doctor[].class)));
			appointmentList = objectMapper.readValue(appointmentFile, HashMap.class);
		}
		catch (IOException e)
		{

			e.printStackTrace();
		}
		Iterator<Patient> patientIterator = patientList.iterator();
		Iterator<Doctor> doctorIterator = doctorList.iterator();
		List<Patient> listOfPatient;
		while (patientIterator.hasNext()) {
			patient = (Patient) patientIterator.next();
			if (patient.getPatientName().equalsIgnoreCase(patientName)) {
				while (doctorIterator.hasNext()) {
					Doctor doctor = doctorIterator.next();
					if (doctor.getDoctorName().equalsIgnoreCase(doctorName)) {
						if (doctor.getNoOfPatients() < 5) {
							if (doctor.getNoOfPatients() == 0) 
							{
								listOfPatient = new ArrayList<>();
								listOfPatient.add(patient);
								appointmentList.put(doctorName, listOfPatient);
							} 
							else 
							{
								
								listOfPatient = appointmentList.get(doctorName);
								listOfPatient.add(patient);
								appointmentList.put(doctorName, listOfPatient);
							}
							ObjectMapper mapper = new ObjectMapper();
							try 
							{
								mapper.writerWithDefaultPrettyPrinter().writeValue(appointmentFile, appointmentList);
							} 
							catch (IOException e) {
								e.printStackTrace();
							}
							doctor.setNoOfPatients(doctor.getNoOfPatients() + 1);
							try 
							{
								objectMapper.writerWithDefaultPrettyPrinter().writeValue(doctorFile, doctorList);
							} catch (IOException e) {

								e.printStackTrace();
							}

						} 
						else 
						{
							System.out.println("Doctor Cannot take appointment...Appointment full...come tomorrow!!!");
						}
					}
				}
			}
		}
	}
	/**
	 * Purpose:Search For the Popular Doctor in a clinique and displays the details of popular Doctor. 	 
	 */
	@Override
	public void popularDoctor() 
	{
		Map<String, Doctor> map = new TreeMap<>();
		Iterator<Doctor> iterator = doctorList.iterator();
		while (iterator.hasNext())
		{
			Doctor doctor = iterator.next();
			if (doctor.getNoOfPatients() == 5) 
			{
				map.put("Popular Doctor", doctor);
			}
		}
		for (Map.Entry<String, Doctor> doctorIterate : map.entrySet())
		{
			
			System.out.println("Doctor Details:" + map.values());
		}

	}
}
