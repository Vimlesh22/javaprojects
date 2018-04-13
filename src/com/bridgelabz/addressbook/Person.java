package com.bridgelabz.addressbook;

public class Person {	
	private String firstName;
	private String lastName;
	private Address address;
	private long mobileNo;
	public Person(String firstName, String lastName, Address address, long mobileNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobileNo = mobileNo;
	}
	public Person() {
		
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", mobileNo=" + mobileNo + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
}
