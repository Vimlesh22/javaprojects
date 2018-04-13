package com.bridgelabz.addressbook;

import java.util.List;
public interface AddressBookInterface {
	public List<Person> getPersonList();
	public void setPersonList(List<Person> personList);
	public List<Person> addPerson();
	public Person editPerson(long mobileNo);
	public List<Person> deletePerson(long mobileNo);
	public List<Person> sortByName();
	public List<Person> sortByZip();
}
