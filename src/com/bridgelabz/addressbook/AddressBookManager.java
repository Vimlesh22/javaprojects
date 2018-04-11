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

public class AddressBookManager {
	List<AddressBook> listAddressBook;
	List<Person> list;
	AddressBook addressBook;
	String filePath;
	File file;
	ObjectMapper objectMapper=new ObjectMapper();
	Utility utility=new Utility();
	
	public List<Person> openAddressBook(String path) throws JsonParseException, JsonMappingException, IOException
	{
		file=new File(path);
		list=new ArrayList<Person>(Arrays.asList(objectMapper.readValue(file,Person[].class)));
		return list;
	}
	
	public AddressBook createNewAddressBook()
	{
		
		
		addressBook=new AddressBook();
		return addressBook;
		
	}
	
	
	
	void saveAddressBook()
	{
		
	}
	
	void quit()
	{
		
	}
	
}
