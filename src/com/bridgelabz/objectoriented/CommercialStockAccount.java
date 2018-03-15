package com.bridgelabz.objectoriented;
import com.bridgelabz.utility.Customer;
import com.bridgelabz.utility.StockAccount;
import com.bridgelabz.utility.Utility;

public class CommercialStockAccount {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Customer customer;
		StockAccount stockAccount=new StockAccount();
		int choice;
		do
		{
			System.out.println("**************Menu***************");
			System.out.println("1)Create Stock Account");
			System.out.println("2)Buy Shares");
			System.out.println("3)Sell Shares");
			System.out.println("4)Display Report");
			System.out.println("5)Company Add");
			System.out.println("6)Company Remove");
			System.out.println("7)Time of Transaction");
			System.out.println("8)Exit");
			System.out.println("*********************************");
			System.out.println("Enter Your choice:");
			choice=utility.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter Your Name:");
					String name=utility.next();
					System.out.println("Enter Initial Money");
					long money=utility.nextLong();
					customer=new Customer(name, money);
					stockAccount=new StockAccount(customer);
					break;
					
				case 2:
					System.out.println("Enter Your Name");
					String name1=utility.next();
					System.out.println("Enter Symbol to buy:");
					String symbol=utility.next();
					System.out.println("Enter How many share you want to buy");
					int number=utility.nextInt();
					stockAccount.buy(number, symbol, name1);
					break;
					
				case 3:
					System.out.println("Enter Your Name");
					String name2=utility.next();
					System.out.println("Enter Symbol to Sell:");
					String symbol2=utility.next();
					System.out.println("Enter How many share you want to Sell");
					int number2=utility.nextInt();
					stockAccount.sell(name2, symbol2, number2);
					break;
					
				case 4:
					StockAccount stockAccount2=new StockAccount();
					stockAccount2.display();
					break;
					
				case 5:
					System.out.println("Enter Company Symbol:");
					String companySymbol=utility.next();
					System.out.println("Enter Number of Share:");
					long numberOfShare=utility.nextLong();
					System.out.println("Enter Price of Share:");
					long price=utility.nextLong();
					stockAccount.addCompany(companySymbol, numberOfShare, price);
					break;
					
				case 6:
					System.out.println("Enter Company Symbol to be removed:");
					String symbol1=utility.next();
					
					stockAccount.removeCompany(symbol1);
					break;
					
				case 7:
					stockAccount.displayTransaction();
					break;
					
					
					
			}
			
		}while(choice!=8);
		
		

	}

}
