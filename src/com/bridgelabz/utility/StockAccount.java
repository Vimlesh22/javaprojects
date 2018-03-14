package com.bridgelabz.utility;

import static com.bridgelabz.utility.Utility.writeJsonFile;
import static com.bridgelabz.utility.Utility.readJsonFile;

import org.json.simple.JSONObject;

public class StockAccount {
	
	int value=0;
	JSONObject stockObject;
	JSONObject jsonObject;
	String customerPath="/home/bridgeit/project/File/CustomerDetails.json";
	String stockPath="/home/bridgeit/project/File/StockAccount.json";
	public StockAccount()
	{
		
	}
	public StockAccount(Customer customer,String fileName)
	{
		jsonObject=new JSONObject();
		stockObject=readJsonFile(customerPath);
		if(stockObject==null)
		{
			stockObject=new JSONObject();
		}
		jsonObject.put("Money", customer.getMoney());
		jsonObject.put("Total Share", 0);
		stockObject.put(customer.getName(),jsonObject);
		writeJsonFile(fileName, stockObject);
	}
	
	public double valueOf()
	{
		return value;
	}
	public void buy(long amount,String symbol,String name)
	{
		JSONObject jsonObject=readJsonFile(customerPath);
		JSONObject jsonStockObject=readJsonFile(stockPath);
		JSONObject customerObject=(JSONObject) jsonObject.get(name);
		JSONObject shareValue=null;
		
		if(customerObject.get("Share")!=null)
		{
			
			shareValue=(JSONObject) customerObject.get("Share");
			
			if(shareValue.get(symbol)!=null)
			{
				shareValue.put(symbol,(long) shareValue.get(symbol)+amount);
				
			}
			else
			{
				shareValue.put(symbol,amount);
			}
			
			
		}
		else
		{
			shareValue =new JSONObject();
			shareValue.put(symbol, amount);
			customerObject.put("Share",shareValue);
		}
		JSONObject symbolObject=(JSONObject) jsonStockObject.get(symbol);
		
		customerObject.put("Total Share", (long)customerObject.get("Total Share")+(amount));
		customerObject.put("Money",((long)customerObject.get("Money")-(amount*(long)symbolObject.get("Price"))));
		symbolObject.put("NumberOfShare", (long)symbolObject.get("NumberOfShare")-amount);
		jsonStockObject.put(symbol, symbolObject);
		jsonObject.put(name,customerObject);
		writeJsonFile(customerPath, jsonObject);
		writeJsonFile(stockPath, jsonStockObject);
	}

}