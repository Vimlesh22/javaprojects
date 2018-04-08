package com.bridgelabz.utility;

import static com.bridgelabz.utility.Utility.writeJsonFile;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static com.bridgelabz.utility.Utility.readJsonFile;

import org.json.simple.JSONObject;

public class StockAccount {
	
	int value=0;
	int count=1;
	Map<String,String> transaction=new HashMap<String,String>();
	SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date=new Date();
	String dateToString;  
	JSONObject stockObject;
	JSONObject jsonObject;
	JSONObject symbolObject;
	String customerPath="/home/bridgeit/project/File/CustomerDetails.json";
	String stockPath="/home/bridgeit/project/File/StockAccount.json";
	public StockAccount()
	{
		
	}
	public StockAccount(Customer customer)
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
		writeJsonFile(customerPath, stockObject);
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
		symbolObject=(JSONObject) jsonStockObject.get(symbol);
		customerObject.put("Total Share", (long)customerObject.get("Total Share")+(amount));
		customerObject.put("Money",((long)customerObject.get("Money")-(amount*(long)symbolObject.get("Price"))));
		
		
		symbolObject.put("NumberOfShare", (long)symbolObject.get("NumberOfShare")-amount);
		
		jsonStockObject.put(symbol,symbolObject);
		dateToString=simpleDateFormat.format(date);
		transaction.put(symbol+(count++), dateToString);
		writeJsonFile(customerPath, jsonObject);
		writeJsonFile(stockPath, jsonStockObject);
	}
	
	public void sell(String name,String symbol,long number)
	{
		JSONObject jsonStockObject=readJsonFile(stockPath);
		symbolObject=(JSONObject) jsonStockObject.get(symbol);
		JSONObject jsonObject=readJsonFile(customerPath);
		JSONObject customerObject=(JSONObject) jsonObject.get(name);
		JSONObject shareObject=(JSONObject) customerObject.get("Share");
		shareObject.put(symbol, (long)shareObject.get(symbol)-number);
		customerObject.put("Share",shareObject);
		customerObject.put("Total Share", (long)customerObject.get("Total Share")-(number));
		customerObject.put("Money",((long)customerObject.get("Money")+(number*(long)symbolObject.get("Price"))));
		jsonObject.put(name, customerObject);
		writeJsonFile(customerPath, jsonObject);
		
		
		
		symbolObject.put("NumberOfShare", (long)symbolObject.get("NumberOfShare")+number);
		jsonStockObject.put(symbol,symbolObject);
		dateToString=simpleDateFormat.format(date);
		transaction.put((count++)+symbol, dateToString);
		writeJsonFile(stockPath, jsonStockObject);
		
		
		
		
	}
	
	public void displayTransaction()
	{
		for(Map.Entry<String, String> entry:transaction.entrySet())
		{
			System.out.println(entry.getKey()+" company shares "+"Added at "+entry.getValue());
		}
	}
	
	public void display()
	{
		JSONObject csJsonObject=readJsonFile(customerPath);
		JSONObject stockObject=readJsonFile(stockPath);
		System.out.println(csJsonObject.toJSONString());
		System.out.println(stockObject.toJSONString());
	}
	
	public void addCompany(String symbol,long shares,long price)
	{
		JSONObject jsonStockObject=readJsonFile(stockPath);
		JSONObject symbolObject=new JSONObject();
		symbolObject.put("NumberOfShare", shares);
		symbolObject.put("Price",price);
		jsonStockObject.put(symbol,symbolObject);
		writeJsonFile(stockPath, jsonStockObject);
	}
	public void removeCompany(String symbol1) {
		
		JSONObject jsonStockObject=readJsonFile(stockPath);
		jsonStockObject.remove(symbol1);
		writeJsonFile(stockPath, jsonStockObject);
		
	}
	
	

}