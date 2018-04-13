package com.bridgelabz.addressbook;

import java.util.List;

public interface AddressBookManagerInterface {
	public List<Person> openAddressBook(String path);
	public AddressBook createNewAddressBook();
	public void menu();

}
