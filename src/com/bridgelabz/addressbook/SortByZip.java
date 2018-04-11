package com.bridgelabz.addressbook;

import java.util.Comparator;

public class SortByZip implements Comparator<Person> {

	@Override
	public int compare(Person person1, Person person2) {
		
		return (int) (person1.getAddress().getZip()-person2.getAddress().getZip());
	}

	
}
