package com.bridgelabz.utility;

import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONObject;

public class AddressBook {
	
	String addressPath="/home/bridgeit/project/File/AddressBook.json";
	JSONObject jsonObject;
	public boolean addPerson(String firstName,String lastName,String address,String city,String state,long zip,long phoneNo)
	{
		
		jsonObject=Utility.readJsonFile(addressPath);
		
		if(jsonObject.get(firstName)==null)
		{	
			JSONObject person=new JSONObject();
			person.put("LastName", lastName);
			person.put("Address",address);
			person.put("City",city);
			person.put("State",state);
			person.put("Zip",zip);
			person.put("PhoneNo", phoneNo);
			jsonObject.put(firstName, person);
			Utility.writeJsonFile(addressPath, jsonObject);
			return true;
			
		}
		return false;
	}
	
	public boolean editPerson(String firstName,String lastName,String address,String city,String state,long zip,long phoneNo)
	{
	
		jsonObject=Utility.readJsonFile(addressPath);
		
		if(jsonObject.get(firstName)!=null)
		{	
			JSONObject person=new JSONObject();
			person.put("LastName", lastName);
			person.put("Address",address);
			person.put("City",city);
			person.put("State",state);
			person.put("Zip",zip);
			person.put("PhoneNo", phoneNo);
			jsonObject.put(firstName, person);
			Utility.writeJsonFile(addressPath, jsonObject);
			return true;
			
		}
		return false;
	}
	
	public boolean deletePerson(String name)
	{
		
		jsonObject=Utility.readJsonFile(addressPath);
		if(jsonObject.get(name)!=null)
		{
			jsonObject.remove(name);
			Utility.writeJsonFile(addressPath, jsonObject);
			return true;
		}
		return false;
	}
	public void display()
	{
		jsonObject=Utility.readJsonFile(addressPath);
		Iterator<JSONObject> iterator=jsonObject.entrySet().iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	
	public void sortByName()
	{
		jsonObject=Utility.readJsonFile(addressPath);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
