package com.bridgelabz.objectoriented;

import com.bridgelabz.utility.Customer;
import com.bridgelabz.utility.StockAccount;

public class CommercialStockAccount {

	public static void main(String[] args) {
		String path="/home/bridgeit/project/File/CustomerDetails.json";
		Customer customer=new Customer("vimlesh", 400000);
		Customer customer1=new Customer("siddhesh", 5000000);
		StockAccount stockAccount=new StockAccount(customer1,path);
		stockAccount.buy(100, "@", "vimlesh");
		stockAccount.buy(200, "%", "siddhesh");
		stockAccount.buy(100,"@","siddhesh");
		
		

	}

}
