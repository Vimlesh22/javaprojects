package com.bridgelabz.utility;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static com.bridgelabz.utility.Utility.readJsonArrayFile;
import static com.bridgelabz.utility.Utility.writeJsonArrayFile;

public class Clinique {
	
	String doctorFile="/home/bridgeit/project/File/Doctor.json";
	String patientFile="/home/bridgeit/project/File/Patient.json";
	String appointmentFile="/home/bridgeit/project/File/Appointments.json";
	
	
	public void addDoctor(String name,String availability,String specialization,long doctorId,long NoOfPatient)
	{
		JSONArray jsonArray=readJsonArrayFile(doctorFile);
		if(jsonArray==null)
		{
			jsonArray=new JSONArray();
		}
		else
		{
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("DoctorName", name);
			jsonObject.put("Availability", availability);
			jsonObject.put("Specialization", specialization);
			jsonObject.put("DoctorId", doctorId);
			jsonObject.put("NoOfPatient", NoOfPatient);
			jsonArray.add(jsonObject);
		}
		writeJsonArrayFile(doctorFile, jsonArray);
	}

	public void addPatient(String patientName, long patientId, long patientAge, long mobileNo) {
		JSONArray jsonArray=readJsonArrayFile(patientFile);
		if(jsonArray==null)
		{
			jsonArray=new JSONArray();
		}
		else
		{
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("PatientName",patientName );
			jsonObject.put("PatientId", patientId);
			jsonObject.put("PatientAge", patientAge);
			jsonObject.put("MobileNo", mobileNo);
			jsonArray.add(jsonObject);
		}
		writeJsonArrayFile(patientFile, jsonArray);
		
		
	}
	
	
	public void displayDoctor()
	{
		JSONArray jsonArray=readJsonArrayFile(doctorFile);
		JSONObject jsonObject=null;
		for(int i=0;i<jsonArray.size();i++)
		{
			jsonObject=(JSONObject) jsonArray.get(i);
			System.out.println(jsonObject.toJSONString());
		}
	}
	
	public void displayPatient()
	{
		JSONArray jsonArray=readJsonArrayFile(patientFile);
		JSONObject jsonObject=null;
		for(int i=0;i<jsonArray.size();i++)
		{
			jsonObject=(JSONObject) jsonArray.get(i);
			System.out.println(jsonObject.toJSONString());
		}
	}

	public JSONObject searchDoctorByName(String doctorName) {
		
		JSONArray jsonArray=readJsonArrayFile(doctorFile);
		JSONObject jsonObject=null;
		JSONObject jsonDoctor=null;
		for(int i=0;i<jsonArray.size();i++)
		{
			jsonObject=(JSONObject) jsonArray.get(i);
			if(jsonObject.containsValue(doctorName))
			{
				jsonDoctor=jsonObject;
				return jsonDoctor;
			}
		}
		return jsonDoctor;
	}

	public JSONObject searchDoctorById(long doctorId) {
		JSONArray jsonArray=readJsonArrayFile(doctorFile);
		JSONObject jsonObject=null;
		JSONObject jsonDoctor=null;
		for(int i=0;i<jsonArray.size();i++)
		{
			jsonObject=(JSONObject) jsonArray.get(i);
			if(jsonObject.containsValue(doctorId))
			{
				jsonDoctor=jsonObject;
				return jsonDoctor;
			}
		}
		return jsonDoctor;
		
	}

	public JSONArray searchDoctorBySpecialization(String specialization) {
		JSONArray jsonArray=readJsonArrayFile(doctorFile);
		JSONObject jsonObject=null;
		JSONArray jsonDoctorArray=new JSONArray() ;
		for(int i=0;i<jsonArray.size();i++)
		{
			jsonObject=(JSONObject) jsonArray.get(i);
			if(jsonObject.containsValue(specialization))
			{
				jsonDoctorArray.add(jsonObject);
			}
		}
		return jsonDoctorArray;
	}

	public JSONArray searchDoctorByAvailability(String specialization) {
		JSONArray jsonArray=readJsonArrayFile(doctorFile);
		JSONObject jsonObject=null;
		JSONArray jsonDoctorArray=new JSONArray() ;
		for(int i=0;i<jsonArray.size();i++)
		{
			jsonObject=(JSONObject) jsonArray.get(i);
			if(jsonObject.containsValue(specialization))
			{
				jsonDoctorArray.add(jsonObject);
			}
		}
		return jsonDoctorArray;
	}

	public JSONObject searchPatientByName(String patientName) {
		JSONArray jsonArray=readJsonArrayFile(patientFile);
		JSONObject jsonObject=null;
		JSONObject jsonPatient=null;
		for(int i=0;i<jsonArray.size();i++)
		{
			jsonObject=(JSONObject) jsonArray.get(i);
			if(jsonObject.containsValue(patientName))
			{
				jsonPatient=jsonObject;
				return jsonPatient;
			}
		}
		return jsonPatient;
	}

	public JSONObject searchPatientById(long patientId) {
		JSONArray jsonArray=readJsonArrayFile(patientFile);
		JSONObject jsonObject=null;
		JSONObject jsonPatient=null;
		for(int i=0;i<jsonArray.size();i++)
		{
			jsonObject=(JSONObject) jsonArray.get(i);
			if(jsonObject.containsValue(patientId))
			{
				jsonPatient=jsonObject;
				return jsonPatient;
			}
		}
		return jsonPatient;
	
	}

	public JSONObject searchPatientByMobile(long mobileNo) {
		JSONArray jsonArray=readJsonArrayFile(patientFile);
		JSONObject jsonObject=null;
		JSONObject jsonPatient=null;
		for(int i=0;i<jsonArray.size();i++)
		{
			jsonObject=(JSONObject) jsonArray.get(i);
			if(jsonObject.containsValue(mobileNo))
			{
				jsonPatient=jsonObject;
				return jsonPatient;
			}
		}
		return jsonPatient;
	}
	
	public void takeAppointment()
	{
		Utility utility=new Utility();
		 JSONArray doctorJson=readJsonArrayFile(doctorFile);
		 JSONArray patientJson=readJsonArrayFile(patientFile);
		 JSONArray appointmentJson=readJsonArrayFile(appointmentFile);
		 boolean flag=false;
		 long noOfAppointments=0;
		 JSONArray appointmentArrayObject=new JSONArray();
		 
		 JSONObject doctorObject;
		 JSONObject patientObject = new JSONObject();
		 JSONArray patientArray=null;
		 JSONArray appointmentArray=new JSONArray();
		 System.out.println("Enter Patient Name:");
		 String patientName=utility.next();
		 for(int i=0;i<patientJson.size();i++)
		 {
			 patientObject=(JSONObject) patientJson.get(i);
			 if(patientObject.containsValue(patientName))
			 {
				 System.out.println("Enter Doctor Name:");
				 String doctorName=utility.next();
				 for(int j=0;j<doctorJson.size();j++)
				 {
					 doctorObject=(JSONObject) doctorJson.get(j);
					 if(doctorObject.containsValue(doctorName))
					 {
						 System.out.println("Enter Doctor specialization");
						 String specialization=utility.next();
						 System.out.println(doctorObject.get("Specialization"));
						 if(doctorObject.get("Specialization").equals(specialization))
						 {						
							 System.out.println(doctorObject.get("Specialization"));

							 if((long)doctorObject.get("NoOfPatient")<5)
							 {
								 System.out.println(doctorObject.get("Specialization"));


									 for(int k=0;k<appointmentJson.size();k++)
									 {
										 
										 System.out.println(doctorObject.get("Specialization"));

										 JSONObject object=(JSONObject) appointmentJson.get(k);
										 if(object.containsValue(doctorName))
										 {
											 
											 System.out.println("hi");
											 	JSONArray patientObj=(JSONArray) object.get("Patient");
											 	JSONObject nameObj=new JSONObject();
											 	nameObj.put("PatientName",patientName);
											 	patientObj.add(nameObj);
											 	object.put("Patient", patientObj);
											 	appointmentJson.add(k, object);
											 	doctorObject.put("NoOfPatient",(long)doctorObject.get("NoOfPatient")+1);
											 	doctorJson.add(doctorObject);
											 	writeJsonArrayFile(doctorFile, doctorJson);
											 	appointmentJson.remove(k+1);
											 	
											 	 writeJsonArrayFile(appointmentFile, appointmentJson);
											 	 flag=true;
											 	 return;
										 }
									 }
									 
								if(flag==false)
								{
									 System.out.println("hello");
	
									 JSONObject patientObject1=new JSONObject();
									 JSONObject nameObject1=new JSONObject();
									 JSONObject newPatientObject=new JSONObject();
									 JSONArray patientArray1=new JSONArray();
									 nameObject1.put("PatientName", patientName);
									 patientArray1.add(nameObject1);
									 newPatientObject.put("DoctorName",doctorName);
									 newPatientObject.put("Specialization",specialization);
									 newPatientObject.put("Patient", patientArray1);
									 appointmentJson.add(newPatientObject);
									noOfAppointments=(long)doctorObject.get("NoOfPatient") + 1;
									 doctorObject.put("NoOfPatient",noOfAppointments);
									 	doctorJson.add(doctorObject);
									 	
									 	for(int m=0;m<doctorJson.size();m++)
									 	{
									 		doctorJson.remove(m+1);
									 	}
									 	writeJsonArrayFile(doctorFile, doctorJson);
									 writeJsonArrayFile(appointmentFile, appointmentJson);
									 return;
								 }
							}
						 }
					 }
				 }
			 }
		 }
		
		
		
	}
	

}
