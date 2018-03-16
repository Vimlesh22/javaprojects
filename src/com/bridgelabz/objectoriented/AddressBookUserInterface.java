package com.bridgelabz.objectoriented;

import com.bridgelabz.utility.AddressBook;
import com.bridgelabz.utility.Utility;

public class AddressBookUserInterface {

	public static void main(String[] args) {
		
		int choice=0;
		String firstName,lastName,address,city,state;
		long zip,phoneNo;
		boolean flag;
		Utility utility=new Utility();
		AddressBook addressBook=null;;
		do
		{
			System.out.println("**************Menu***********");
			System.out.println("1)Add Person");
			System.out.println("2)Edit Person ");
			System.out.println("3)Delete Person");
			System.out.println("4)Display Person");
			System.out.println("*****************************");
			System.out.println("Enter Your Choice:");
			choice=utility.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter Your First Name:");
					firstName=utility.next();
					System.out.println("Enter Your Last Name:");
					lastName=utility.next();
					System.out.println("Enter Your Address:");
					address=utility.next();
					System.out.println("Enter Your City:");
					city=utility.next();
					System.out.println("Enter Your State:");
					state=utility.next();
					System.out.println("Enter Your Pin Code:");
					zip=utility.nextLong();
					System.out.println("Enter Your Mobile No:");
					phoneNo=utility.nextLong();
					addressBook=new AddressBook();
					flag=addressBook.addPerson(firstName, lastName, address, city, state, zip, phoneNo);
					if(flag==true)
					{
						System.out.println("Person Added Successfully!!!!!!!!!");
					}
					else
					{
						System.out.println("Person was already Present....so person was not added!!!! ");
					}
					break;
					
				case 2:
					System.out.println("Enter Your First Name:");
					firstName=utility.next();
					System.out.println("Enter Your Last Name:");
					lastName=utility.next();
					System.out.println("Enter Your Address:");
					address=utility.next();
					System.out.println("Enter Your City:");
					city=utility.next();
					System.out.println("Enter Your State:");
					state=utility.next();
					System.out.println("Enter Your Pin Code:");
					zip=utility.nextLong();
					System.out.println("Enter Your Mobile No:");
					phoneNo=utility.nextLong();
					addressBook=new AddressBook();
					flag=addressBook.addPerson(firstName, lastName, address, city, state, zip, phoneNo);
					if(flag==true)
					{
						System.out.println("Person Edited Successfully!!!!!!!!!");
					}
					else
					{
						System.out.println("Person was Not Present....so can't edit!!!! ");
					}
					break;
					
				case 3:
					System.out.println("Enter Name to be deleted");
					firstName=utility.next();
					flag=addressBook.deletePerson(firstName);
					if(flag==true)
					{
						System.out.println(firstName+" was deleted from list!!!!!!");
					}
					else
					{
						System.out.println(firstName+" was not deleted successfully!!!!");
					}
					break;
					
				case 4:
					addressBook.display();
					break;
					
					
					
					
			}
			
		}while(choice!=9);
		
		
		

	}

}
