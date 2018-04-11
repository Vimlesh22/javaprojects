package com.bridgelabz.addressbook;


import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;



import com.bridgelabz.utility.Utility;

public class AddressBook {
	
	List<Person> personList=new ArrayList<>();
	Utility utility=new Utility();
	String firstName;
	String lastName;
	String city;
	String state;
	long mobileNo;
	Iterator<Person> iterator;
	Address address;
	Person person;
	long zip;
	
	
	
	
	public AddressBook() {
		
	}

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	
	public List<Person> addPerson(){
		
		System.out.println("Enter First Name");
		firstName=utility.next();
		System.out.println("Enter Last Name");
		lastName=utility.next();
		System.out.println("Enter city");
		city=utility.next();
		System.out.println("Enter state");
		state=utility.next();
		System.out.println("Enter zip");
		zip=utility.nextLong();
		System.out.println("Enter Mobile No");
		mobileNo=utility.nextLong();
		address=new Address(city, state, zip);
		person=new Person(firstName,lastName,address,mobileNo);
		personList.add(person);
		return personList;
		
	}
	
	Person editPerson(long mobileNo){
		
		
		Iterator<Person> iterator=personList.iterator();
		while(iterator.hasNext())
		{
			Person person=iterator.next();
			if(person.getMobileNo()==mobileNo)
			{
				System.out.println("Enter city");
				String city=utility.next();
				System.out.println("Enter state");
				String state=utility.next();
				System.out.println("Enter zip code");
				long zip=utility.nextLong();
				Address address=new Address(city, state, zip);
				person.setAddress(address);
				break;
			}
		}
		return person;
		
	
	}
	
	public List<Person> deletePerson(long mobileNo){
		iterator=personList.iterator();
		while(iterator.hasNext())
		{
			person=(Person) iterator.next();
			if(person.getMobileNo()==mobileNo)
			{
				personList.remove(person);
				break;
				
			}
			
		}
		return personList;
	}
	
	List<Person> sortByName(){
		Collections.sort(personList,new SortByName());
		return personList;
		
	}
	
	List<Person> sortByZip(){
		
		Collections.sort(personList,new SortByZip());
		return personList;
		
	}

}
