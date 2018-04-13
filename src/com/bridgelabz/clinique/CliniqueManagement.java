/**
 * Purpose:Programme is used to manage a list of Doctors associated with the Clinique.
 * This also manages the list of patients who use the Clinique. 
 * It manages Doctors by Name, Id, Specialization and Availability (AM,  PM or both). 
 * It manages Patients by Name, ID, Mobile Number and Age.
 * @author Vimlesh Kumar
 * @version 1.0v
 * @since 13 April 2018
 */
package com.bridgelabz.clinique;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import com.bridgelabz.utility.Utility;

public class CliniqueManagement 
{	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		int choice;
		Utility utility=new Utility();
		Doctor doctor;
		Patient patient;
		List<Doctor> doctorList;
		CliniqueInterface clinique=new CliniqueImplementation();
		clinique.readFile();
		do{
			clinique.menu();
			System.out.println("Enter Your Choice:");
			choice=utility.nextInt();
			switch (choice) {
			case 1:
				clinique.addDoctor();
				break;
				
			case 2:
				clinique.saveDoctor();
				break;
			case 3:
				clinique.displayDoctor();
				break;
			case 4:
				clinique.addPatient();
				break;
				
			case 5:
				clinique.savePatient();
				break;
			case 6:
				clinique.displayPatient();
				break;
				
			case 7:
				System.out.println("Enter id of Doctor");
				int id=utility.nextInt();
				doctor=clinique.searchDoctorById(id);
				if(doctor != null)
				{
					System.out.println(doctor);
					break;
				}
				System.out.println("Doctor not Foud");
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
