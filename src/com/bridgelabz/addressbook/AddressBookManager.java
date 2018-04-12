package com.bridgelabz.addressbook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.utility.Utility;

public class AddressBookManager implements AddressBookManagerInterface {
	List<AddressBook> listAddressBook;
	List<Person> list;
	AddressBook addressBook;
	String filePath;
	ObjectMapper objectMapper=new ObjectMapper();
	Utility utility=new Utility();
	
	@Override
	public List<Person> openAddressBook(String path) 
	{
		File file=new File(path);
		try {
			list=new ArrayList<>(Arrays.asList(objectMapper.readValue(file,Person[].class)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public void menu()
	{
		System.out.println("**********MENU*************");
		System.out.println("1)Add Person");
		System.out.println("2)Edit Person");
		System.out.println("3)Delete Person ");
		System.out.println("4)Sort By Name");
		System.out.println("5)Sort By Zip");
		System.out.println("6)Display List");
		System.out.println("7)Exit");
		System.out.println("***************************");
	}
	@Override
	public AddressBook createNewAddressBook()
	{
		
		
		addressBook=new AddressBook();
		return addressBook;
		
	}
}
