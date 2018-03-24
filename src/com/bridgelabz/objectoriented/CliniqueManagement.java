package com.bridgelabz.objectoriented;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.utility.Clinique;
import com.bridgelabz.utility.Utility;


public class CliniqueManagement {

	public static void main(String[] args) {
		Clinique clinique=new Clinique();
		Utility utility=new Utility();
		String doctorName,availability,specialization,patientName;
		long doctorId,patientId,patientAge,mobileNo;
		JSONObject doctorObject,patientObject;
		JSONArray doctorObjectArray,patientObjectArray;
		int choice;
		do{
	
			System.out.println("********************Menu*********************");
			System.out.println("1)Add Doctor to the list");
			System.out.println("2)Add Patient to the list");
			System.out.println("3)Display Doctor");
			System.out.println("4)Display Patient");
			System.out.println("5)Search Doctor by Name");
			System.out.println("6)Search Doctor by Id");
			System.out.println("7)Search Doctor by specialization");
			System.out.println("8)Search Doctor by availability");
			System.out.println("9)Search Patient by Name");
			System.out.println("10)Search Patient by id");
			System.out.println("11)Search Patient by Mobile Number");
			System.out.println("12)Take Appointment by doctor Name");
			System.out.println("13)Display Appointments");
			System.out.println("*********************************************");
			System.out.println("Enter your choice:");
			choice=utility.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter Doctor Name:");
					doctorName=utility.next();
					System.out.println("Enter Doctor's availibility");
					availability=utility.next();
					System.out.println("Enter Doctor's specialization");
					specialization=utility.next();
					System.out.println("Enter Doctor's id");
					doctorId=utility.nextInt();
					clinique.addDoctor(doctorName, availability, specialization, doctorId, 0);
					break;
					
					
				case 2:
					System.out.println("Enter Patient Name:");
					patientName=utility.next();
					System.out.println("Enter Patient's id:");
					patientId=utility.nextLong();
					System.out.println("Enter Patient's Age:");
					patientAge=utility.nextLong();
					System.out.println("Enter Patient's mobile number:");
					mobileNo=utility.nextLong();
					clinique.addPatient(patientName,patientId,patientAge,mobileNo);
					break;
					
				case 3:
					clinique.displayDoctor();
					break;
					
					
				case 4:
					clinique.displayPatient();
					break;
					
				case 5:
					System.out.println("Enter Doctor name");
					doctorName=utility.next();
					doctorObject=clinique.searchDoctorByName(doctorName);
					if(doctorObject==null)
					{
						System.out.println("Doctor Not found!!!!!!");
					}
					else
					{
						System.out.println(doctorObject.toJSONString());
					}
					break;
					
			 case 6:
				 System.out.println("Enter Doctor id");
				 doctorId=utility.nextLong();
				 doctorObject=clinique.searchDoctorById(doctorId);
				 if(doctorObject==null)
				 {
					 System.out.println("Doctor Not found!!!!!!");
				 }
				 else
				 {
					System.out.println(doctorObject.toJSONString());
				 }
				 break;
				 
			 case 7:System.out.println("Enter Doctor Specialization");
			 specialization=utility.next();
			 doctorObjectArray=clinique.searchDoctorBySpecialization(specialization);
			 if(doctorObjectArray==null)
			 {
				 System.out.println("Doctor Not found!!!!!!");
			 }
			 else
			 {
				 for(int i=0;i<doctorObjectArray.size();i++)
					{
						doctorObject=(JSONObject) doctorObjectArray.get(i);
						System.out.println(doctorObject.toJSONString());
					}
			 }
			 break;
			 
			 case 8:
				 System.out.println("Enter Doctor Availability");
				 availability=utility.next();
				 doctorObjectArray=clinique.searchDoctorByAvailability(availability);
				 if(doctorObjectArray==null)
				 {
					 System.out.println("Doctor Not found!!!!!!");
				 }
				 else
				 {
					 for(int i=0;i<doctorObjectArray.size();i++)
						{
							doctorObject=(JSONObject) doctorObjectArray.get(i);
							System.out.println(doctorObject.toJSONString());
						}
				 }
				 break;
				 
			 case 9:
				 System.out.println("Enter Patient Name");
				 patientName=utility.next();
				 patientObject=clinique.searchPatientByName(patientName);
					if(patientObject==null)
					{
						System.out.println("Patient Not found!!!!!!");
					}
					else
					{
						System.out.println(patientObject.toJSONString());
					}
					break;
					
			 case 10:
				 System.out.println("Enter Patient id");
				 patientId=utility.nextLong();
				 patientObject=clinique.searchPatientById(patientId);
					if(patientObject==null)
					{
						System.out.println("Patient Not found!!!!!!");
					}
					else
					{
						System.out.println(patientObject.toJSONString());
					}
					break;
				
			 case 11:
				 System.out.println("Enter Patient Mobile No");
				 mobileNo=utility.nextLong();
				 patientObject=clinique.searchPatientByMobile(mobileNo);
					if(patientObject==null)
					{
						System.out.println("Patient Not found!!!!!!");
					}
					else
					{
						System.out.println(patientObject.toJSONString());
					}
					break;
					
			 case 12:
				 clinique.takeAppointment();
				 break;
		
			}
		}while(choice!=13);
	}

}
