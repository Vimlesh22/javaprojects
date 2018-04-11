package com.bridgelabz.clinique;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.utility.Utility;

public class CliniqueManagement {
	
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		int choice;
		Utility utility=new Utility();
		Doctor doctor;
		Patient patient;
		List<Doctor> doctorList;
		Clinique clinique=new Clinique();
		clinique.readFile();
		
		do{
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
			System.out.println("Enter Your Choice:");
			choice=utility.nextInt();
			switch (choice) {
			case 1:
				clinique.addDoctor();
				break;
				
			case 2:
				clinique.writeDoctor();
				break;
			case 3:
				clinique.displayDoctor();
				break;
			case 4:
				clinique.addPatient();
				break;
				
			case 5:
				clinique.writePatient();
				break;
			case 6:
				clinique.displayPatient();
				break;
				
			case 7:
				System.out.println("Enter id of Doctor");
				int id=utility.nextInt();
				doctor=clinique.searchDoctorById(id);
				System.out.println(doctor);
				break;
				
			case 8:
				System.out.println("Enter Doctor Name");
				String name=utility.next();
				doctor=clinique.searchDoctorByName(name);
				System.out.println(doctor);
				break;
				
			case 9:
				System.out.println("Enter Specialization of Doctor");
				String specialization=utility.next();
				doctorList=clinique.searchDoctorBySpecialization(specialization);
				Iterator<Doctor> iterator=doctorList.iterator();
				while(iterator.hasNext())
				{
					System.out.println(iterator.next());
				}
				break;
				
			case 10:
				System.out.println("Enter Availability of Doctor");
				String availability=utility.next();
				doctorList=clinique.searchDoctorByAvailability(availability);
				Iterator<Doctor> iterator1=doctorList.iterator();
				while(iterator1.hasNext())
				{
					System.out.println(iterator1.next());
				}
				break;
				
				
			case 11:
				System.out.println("Search Patient By Name");
				String patientName=utility.next();
				patient=clinique.searchPatientByName(patientName);
				System.out.println(patient);
				break;
				
			case 12:
				System.out.println("Search Patient By id");
				int patientId=utility.nextInt();
				patient=clinique.searchPatientById(patientId);
				System.out.println(patient);
				break;
				
				
			case 13:
				System.out.println("Search Patient By PhoneNo");
				long phoneNo=utility.nextLong();
				patient=clinique.searchPatientByPhoneNo(phoneNo);
				System.out.println(patient);
				break;
				
			case 14:
				System.out.println("Enter Doctor Name:");
				String doctorName=utility.next();
				System.out.println("Enter Patient Name:");
				String patientName1=utility.next();
				clinique.takeAppointment(doctorName,patientName1);
				System.out.println("Appointment Confirmed");
				break;
				
			case 15:clinique.popularDoctor();
				break;
				
				
			case 16:
				System.out.println("Program Terminated!!!!!!!!!!!Thank You!!!");
				System.exit(0);
				break;
				
				
				
				
			default:
				break;
			}
			
			
		}while(choice!=17);
		
	}
	

}
