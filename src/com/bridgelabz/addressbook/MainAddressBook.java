package com.bridgelabz.addressbook;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import com.bridgelabz.addressbook.AddressBookManager;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;
import com.bridgelabz.utility.Utility;

public class MainAddressBook {
	ObjectMapper mapper;
	public static void main(String[] args) throws IOException 
	{
		int choice;
		Utility utility=new Utility();
		ObjectMapper mapper;
		AddressBookInterface addressBook=new AddressBook();
		String filePath="/home/bridgeit/project/AddressBookFiles";
		File file;
		String path=null;
		long mobileNo;
		List<Person> personList=new ArrayList<>();
		AddressBookManagerInterface addressBookManager=new AddressBookManager();
		do{
			System.out.println("**********MENU*************");
			System.out.println("1)Create new Address Book");
			System.out.println("2)Open Address Book");
			System.out.println("3)Save AddressBook");
			System.out.println("4)Exit");
			System.out.println("***************************");
			System.out.println("Enter Your choice");
			choice=utility.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter File Path to Create an AddressBook");
				path=filePath+"/"+utility.next()+".txt";
				file=new File(path);
				file.createNewFile();
				int choice3;
				addressBook=addressBookManager.createNewAddressBook();
				do{
					addressBookManager.menu();
					choice3=utility.nextInt();
					switch (choice3) {
					case 1:
						addressBook.addPerson();
						break;
					case 2:
						System.out.println("Enter mobile No of Person to be edited!!");
						mobileNo=utility.nextLong();
						addressBook.editPerson(mobileNo);
						break;
					case 3:
						System.out.println("Enter mobile No of Person to be Deleted!!");
						mobileNo=utility.nextLong();
						addressBook.deletePerson(mobileNo);
						break;
					case 4:
						addressBook.sortByName();
						break;
					case 5:
						addressBook.sortByZip();

						break;
					case 6:
						System.out.println(addressBook.getPersonList());
						break;
					case 7:
						break;
					}	
				}while(choice3!=7);
				break;
			case 2:
				System.out.println("Enter File Path to open an AddressBook");
				path=filePath+"/"+utility.next()+".txt";
				int choice2;
				personList=addressBookManager.openAddressBook(path);
				addressBook.setPersonList(personList);
				System.out.println(personList);
				do{
					addressBookManager.menu();
					System.out.println("Enter Your choice");
					choice2=utility.nextInt();
					switch (choice2) {
					case 1:
						addressBook.addPerson();
						break;
					case 2:
						System.out.println("Enter mobile No of Person to be edited!!");
						mobileNo=utility.nextLong();
						addressBook.editPerson(mobileNo);
						break;
					case 3:
						System.out.println("Enter mobile No of Person to be deleted!!");
						mobileNo=utility.nextLong();
						addressBook.deletePerson(mobileNo);
						break;
					case 4:
						addressBook.sortByName();
						break;
					case 5:
						addressBook.sortByZip();
						break;
					case 6:
						System.out.println(addressBook.getPersonList());
						break;
					case 7:
						break;
					}

				}while(choice2!=7);		
				break;
			case 3:
				List<Person> personListSave=addressBook.getPersonList();
				mapper=new ObjectMapper();
				mapper.writerWithDefaultPrettyPrinter().writeValue(new File(path), personListSave);
				break;
			}
		}while(choice!=4);	
	}
}

