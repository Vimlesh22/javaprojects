/********************************************************** 
 *  Purpose: Utility Class for Methods.
 *
 *  @author  Vimlesh Kumar
 *  @since   26-02-2018
 *
 **********************************************************/
package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Map.Entry;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Utility {
	static int NUM=0;
	Scanner sc;
	public static int mNote=0;
	
	 /**
	  * Default Constructor to initialize Scanner Object.  
	  */
	public Utility()
	{
		sc=new Scanner(System.in);
	}
	/**
	  * Method to take String as input.  
	  */
	public String next()
	{
		try
		{
			return sc.next();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "";
	}
	
	/**
	  * Method to take String as input considering spaces.  
	  */
	public String nextLine()
	{
		try
		{
			return sc.nextLine();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "";
	}
	/**
	  * Method to take Double value as input.  
	  */
	public double nextDouble()
	{
		try
		{
			return sc.nextDouble();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0.0;
	}
	/**
	  * Method to take Integer as input.  
	  */
	public int nextInt()
	{
		try
		{
			return sc.nextInt();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}
	/**
	  * Method to take Float as input.  
	  */
	public float nextFloat()
	{
		try
		{
			return sc.nextFloat();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}
	/**
	  * purpose:Method to take Calculate SquareRoot using Newton method.
	  * @param num the number to check square root 
	  * @return returns square root of a number 
	  */
	public static double squareRoot(double num)
	{
		double t=num;
		double div;
		double epsilon=(Math.pow(10,-15));
		/**
		 * repeat until desired accuracy reached 
		 * using condition Math.abs(t - c/t) > epsilon*t 
		 * where epsilon = 1e-15
		 */
		do
		{
			t= ((num/t)+t)/2;
			div=Math.abs(t-(num/t));
		}
		while(div>epsilon*t);
		return t;
	}
	
	
	/**
	 * purpose: finding day of week
	 * @param year year in which to find a day
	 * @param month month in which to find a day
	 * @param day day on which to find a day
	 * @return returns day in in number as sunday is 0,monday is 1 and so on..
	 */
	public static int dayOfWeek(int year,int month,int day)
	{
		int y1 = (year) - ((14 - month) / 12);
		int x = (y1) + (y1/4) - (y1/100) + (y1/400);
		int m1 =(month) + ((12 * ((14 - month) / 12)) - 2);
		int d1 = (day + x + (31*m1) / 12) % 7;
		return d1;
	}
	
	
	/**
	 * purpose:Finding Monthly Payment
	 * @param principal input for  principal loan amount 
	 * @param rate input for rate of interest
	 * @param duration of loan amount
	 * @return returns monthly payment for loan
	 */
	public static double monthlyPayment(double principal,float rate,int duration)
	{
		float r=rate/(12*100);
		double n=12*duration;
		double cal=Math.pow((1+r),-n);
		double payment= (principal*r)/(1-cal);
		return payment;
	}
		
	/**
	 * purpose:Finds Fahrenheit from Celcius
	 * @param cal value of Celcius
	 * @return temperature value in fahrenheit 
	 */
	public static float celToFah(int cal)

	{
		float result=0;
		result=((cal*9)/5) + 32;
		return result;
	}
	
	
	/**
	 * purpose:Finds Celcius from Fahrenheit 
	 * @param fah value of Fahrenheit 
	 * @return temperature value in Celcius 
	 */
	public static float fahToCel(int fah)

	{
		float result=0;
		result=((fah - 32)*5)/9;
		return result;
	}
	
	
	/**purpose:There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which is returned by the Vending Machine
	 * @param amount for which vending machine needs to return Change
	 */
	public static void calculateMinNoNote(float amount){
		
		if(amount == 0)
			return;
	
		//calculate 1000 rupees notes
		if(amount>=1000){
			mNote+=((int)amount/1000);
			System.out.println("1000 Rupes Notes is: "+((int)amount/1000));
			if(amount/1000 == 0)
				return;
			else
				calculateMinNoNote(amount%1000);
		}
		
		//calculate 500 rupees notes
		else if(amount>= 500){
			mNote+=((int)amount/500);
			System.out.println("500 Rupes Notes is: "+((int)amount/500));
			if(amount/500 == 0)
				return;
			else
				calculateMinNoNote(amount%500);
		}

		//calculate 100 rupees notes
		else if(amount>= 100){
			mNote+=((int)amount/100);
			System.out.println("100 Rupes Notes is: "+((int)amount/100));
			if(amount/100 == 0)
				return;
			else
				calculateMinNoNote(amount%100);
		}

		//calculate 50 rupees notes
		else if(amount>= 50){
			mNote+=((int)amount/50);
			System.out.println("50 Rupes Notes is: "+((int)amount/50));
			if(amount/50 == 0)
				return;
			else
				calculateMinNoNote(amount%50);
		}
		
		//calculate 10 rupees notes
		else if(amount>= 10){
			mNote+=((int)amount/10);
			System.out.println("10 Rupes Notes is: "+((int)amount/10));
			if(amount/10 == 0)
				return;
			else
				calculateMinNoNote(amount%10);
		}

		//calculate 5 rupees notes
		else if(amount>= 5){
			mNote+=((int)amount/5);
			System.out.println("5 Rupes Notes is: "+((int)amount/5));
			if(amount/5 == 0)
				return;
			else
				calculateMinNoNote(amount%5);
		}

		//calculate 2 rupees notes
		else if(amount>= 2){
			mNote+=((int)amount/2);
			System.out.println("2 Rupes Notes is: "+((int)amount/2));
			if(amount/2 == 0)
				return;
			else
				calculateMinNoNote(amount%2);
		}

		//calculate 1 rupees notes
		else if(amount>= 1){
			mNote+=((int)amount/1);
			System.out.println("1 Rupes Notes is: "+((int)amount/1));
			if(amount/1 == 0)
				return;
			else
				calculateMinNoNote(amount%1);
		}
	}
	
	
	/**
	 * purpose:takes a command-line argument N, asks you to think of a number between 0 and N-1
	 * @param low lower range for guessing number
	 * @param up upper range for guessing number
	 */
	public static void find(int low,int up)
	{
	
    	//Displaying the value
    	if(low==up){
        System.out.println("Your number is : "+low);
        System.out.println("Intermediary numbers is "+(low-1)+" and "+(low+1));
        return;
    	}

        //Finding middle value between range low and up
    	int mid=(low+up)/2;
    	int ch;
    	System.out.println("Press 1 : "+low+" - "+mid);
    	System.out.println("Press 2 : "+(mid+1)+" - "+up);
    	ch=new Utility().nextInt();

    	//Number is in first half
   	 	if(ch==1)
   	 	{
   	 		find(low,mid);
   	 	}

    	//Number is in second half
    	else
    	{
    		find(mid+1,up);
    	}
	}

	
	/**
	 * purpose:Given two strings are to be checked for anagram.
	 * One string is an anagram of another if the second is simply a rearrangement of the first. 
	 * For example, 'heart' and 'earth' are anagrams.
	 * @param str1 string value 
	 * @param str2 string value which is to be checked for anagram
	 * @return
	 */
	public static boolean anagram(String str1,String str2)
	{
		
			

			char arr[]=bubbleSortStringAna(str1);
			char arr1[]=bubbleSortStringAna(str2);
			String s=new String(arr);
			String s1=new String(arr1);
			
			if(s.equals(s1))
			{
				return true;
			}
			else
			{
				return false;
			}
	
	}

	
	
	/**
	 * purpose:Finds out prime number between range 1 to 1000.
	 * @param size size is no upto which you want prime number 
	 * @return returns string of prime number
	 */
	public static String primeNumber(int size)

	{
		String prime="";
		for (int i = 1; i <= size; i++)         
	      { 		  	  
	          int counter=0; 	  
	          for(int num =i; num>=1; num--)
	          {
	             if(i%num==0)
	             {
	            	 counter = counter + 1;
	             }
	          }
	          if (counter ==2)
	          {
	        	  //System.out.print(i+" ");
	        	 prime+=i+" ";

	          }	
	       }
		return prime;
		
		
	}
	

	/**
	 * purpose:Finds Binary representation of number provided as input
	 * @param no number for finding binary
	 * @return integer array for binary representation of decimal number
	 */
	public static String toBinary(int no)
	{
		String str="";
		
		int arr[]=new int[50];
		int i=0;
	    while (no > 0)
	    {
	    	
	        arr[i] = no%2;
	        i++;
	        no = no/2;
	    }
	    System.out.println("Binary Represented of Number is:");
	    for (int j = i ; j >= 0 ; j--){
	    	str+=arr[j];
	        System.out.print(arr[j]);
	    }
		
	    return str;
	    
	}
	
	/**
	 * @param str
	 */
	public static void swapNibble(String str)
	{
		//Swapping Nibble and printing decimal value
		String str2="";
		String str3="";
		String str4="";
		for(int i=0;i<=3;i++)
		{
			str2=str2+str.charAt(i);
		}
		for(int i=4;i<str.length();i++)
		{
			str3=str3+str.charAt(i);
		}
		str4=str3+str2;
		
		int dec=0;
		char[] strtochar=str4.toCharArray();
		int count=0;
		for(int i=strtochar.length-1;i>=0;i--)
		{
			if(strtochar[i]=='1')
			{
				dec+=Math.pow(2,count);
			}
			count++;
		}
		System.out.println("\nDecimal Number After Swapping Nibble :"+dec);
		int num=dec;
		while(num>=0 && num%2==0)
		{
			if(num%2==0)
			{
				num=num/2;
			}
			
		}
		if(num==1)
		{
			System.out.println("The number is a power of 2");
		}
		else
		{
			System.out.println("The number is Not a power of 2");
		}
		
		
		
		
	}
	


	
	/**
	 * purpose:Bubble sort of string to find anagram using bubble sort
	 * @param str3 string value 
	 * @return character array of sorted string
	 */
	public static char[] bubbleSortStringAna(String str3)
	{
		char temp;
		char[] arr=str3.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{

					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
	
				}
			}
		}
		return arr;
	}
	

	/**
	 * purpose:this method sorts the integer array using bubble sort
	 * @param arr stores value of integer in array
	 * @return sorted integer array
	 */
	public static int[]  bubbleSortInteger(int arr[])

	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		return arr;
	}
	

	/**
	 * purpose:this method sorts the String array using bubble sort
	 * @param str stores value of Strings in array
	 * @return sorted String of array
	 */
	public static String[] bubbleSortString(String str[])
	{
		String temp;
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str.length-1;j++)
			{
				if(str[j].compareTo(str[j])<0)
				{
					temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
				}
			}
		}
		return str;
	}
	
	/**
	 * purpose:this method sorts the integer array
	 * @param arr stores value of integer in array
	 * @return sorted integer array
	 */
	public static int[] insertionSortInteger(int arr[])

	{
		int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
             
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
		return arr;
	}
	
	/**
	 * purpose:this method sorts the String array using insertion sort
	 * @param str stores value of Strings in array
	 * @return returns sorted String of array
	 */
	public static String[] insertSortSting(String str[])
	{
		int n = str.length;
        for (int i=1; i<n; ++i)
        {
            String key = str[i];
            int j = i-1;
             
            while (j>=0 && str[j].compareTo(key)>0)
            {
                str[j+1] = str[j];
                j = j-1;
            }
            str[j+1] = key;
        }
		return str;
	}
	
	

	/**
	 * purpose:Searches an element in an array using binary search method
	 * @param arr stores array of elements
	 * @param element stores element which is to be searched in an array
	 * @return index at which element is found in an array
	 */
	public static int binarySearchInteger(int arr[],int element)
	{
		int[] sortedarray=bubbleSortInteger(arr);
		int first=0;
		int last=sortedarray.length-1;
		int middle=(first+last)/2;
		while(first<=last)
		{
			middle=first+(last-first)/2;
			if(arr[middle]==element)
			{
				return middle;
			}
			else if(arr[middle]<element)
			{
				first=middle+1;
			}
			else
			{
				last=middle-1;
			}
			
		}
		return -1;
	}
	
	/**
	 * purpose:Searches a string in an array using binary search method
	 * @param strr stores array of strings
	 * @param str1 stores string which is to be searched in an array
	 * @return index at which string is found in an array
	 */
	
	public static int binarySearchString(String str[],String str1)
	{
		String str2[]=insertSortSting(str);
		int first=0;
		int last=str2.length-1;
		int middle=(first+last)/2;
		while(first<=last)
		{
			middle=first+(last-first)/2;
			if(str2[middle].equals(str1))
			{
				return middle;
			}
			else if(str2[middle].compareTo(str1)<0)
			{
				first=middle+1;
			}
			else
			{
				last=middle-1;
			}
			
		}
		return -1;
	}
	
	public static int[] mergeSort(int arr[],int p,int r)
	{
		int q=0;
		if(p<r)
		{
			q=(p+r)/2;
			mergeSort(arr,p,q);
		}
		return arr;
	}
	
	
	public static boolean leapyear(String year)
	{
		
				int yr=Integer.parseInt(year);
				if(yr%4==0)
				{
					if(yr%100==0)
					{
						if(yr%400==0)
						{
							return true;
						}
						else
						{
							return false;
						}
					}
					else
					{
						return true;
					}
					
				}
				else
				{
					return false;
				}
				
			
		
	}
	public static void writeToFile(String path,String str)
	{
		File file=new File(path);
		try {
			PrintWriter printWriter=new PrintWriter(file);
			printWriter.write(str);
			printWriter.close();
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	public static String[] readFromFile(String filelocation) 
	{
		
		
		
				int i;
				String str="";
				String[] stringsplit = null;
				try 
				{
					File file=new File(filelocation);
					BufferedReader br=new BufferedReader(new FileReader(file));
					while ((i=br.read()) != -1)
					{
						str=str+(char)i;
					}
					
					stringsplit=str.split(" ");
					
					br.close();
					
				}catch(IOException e)
				{
					e.printStackTrace();
				}
				return stringsplit;
	}
	 

	public String[][] calendar(int mon,String yr)
	{
		String[][] calendar=new String[7][7];
		String[] daychar={"Sun","Mon","Tue","Wed","Thr","Fri","Sat"};
		int leapdays[]={31,29,31,30,31,30,31,31,30,31,30,31};
		int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
		boolean y=leapyear(yr);
		
		if(y==true)
		{
			
				int day=dayOfWeek(Integer.parseInt(yr),mon,1);
				for(int i=0;i<7;i++)
				{
					if(i==0)
					{
						for(int k=0;k<7;k++)
						{
							calendar[i][k]=daychar[k];
						}
					}
					if(i==1)
					{
						for(int p=day;p<7;p++)
						{
							calendar[i][p]=""+(++NUM);
						}
					}
				}
				for(int i=2;i<7;i++)
				{
					for(int j=0;j<7;j++)
					{
						if(NUM==leapdays[mon-1])
						{
							break;
						}
						else
						{
							calendar[i][j]=""+(++NUM);
						}
					}					
				}		
			}
		
		else
		{
			int day=dayOfWeek(Integer.parseInt(yr),mon,1);
			for(int i=0;i<7;i++)
			{
				if(i==0)
				{
					for(int k=0;k<7;k++)
					{
						calendar[i][k]=daychar[k];
					}
				}
				if(i==1)
				{
					for(int p=day;p<7;p++)
					{
						calendar[i][p]=""+(++NUM);
					}
				}
			}
			for(int i=2;i<7;i++)
			{
				for(int j=0;j<7;j++)
				{
					if(NUM==days[mon-1])
					{
						break;
					}
					else
					{
						calendar[i][j]=""+(++NUM);
					}
				}					
			}
		}
		
		
		return calendar;
		
	}
	
	public static String hashing(String[] number)
	{
		Utility utility=new Utility();
		@SuppressWarnings("unchecked")
		LinkedList<Integer> list[]=new LinkedList[11];
		Map<Integer,LinkedList<Integer>> slot=new HashMap<>();
		
		int arr[]=new int[number.length-1];
		int x=0,mod;
		
		//converts array of string in array of integer
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(number[i]);
		}
		//creating linkedList object 
		for(int i=0;i<11;i++)
		{
			
			list[i]=new LinkedList<>();
			
		}
		//adding elements into slots
		for(int j=0;j<arr.length;j++)
		{
			x=arr[j]%11;
			list[x].addAtEnd(arr[j]);
			list[x].order();
		}
		//adding linkedlist into map
		for(int i=0;i<11;i++)
		{
			slot.put(i, list[i]);
		}
		//Iterating through map to display elements
		for(Map.Entry<Integer,LinkedList<Integer>> mp:slot.entrySet())
		{
			System.out.println("Key: "+mp.getKey()+"    Value: "+mp.getValue());
		}
		//searches the number in map
		System.out.println("Enter Number to be searched");
		Integer search=utility.nextInt();
		mod=search%11;
		//searches the number in map if found remove element else add to list
		boolean result=false;
		for(Entry<Integer, LinkedList<Integer>> sear:slot.entrySet())
		{
			
			if(mod==sear.getKey() && sear.getValue().getFirstElement()!=null)
			{
				result=list[mod].search(search);
			}
			
			
		}
		if(result == true)
		{
			System.out.println("Numer "+search+" found in list...and it has been deleted from list");
			list[mod].remove(search);
		}
		else
		{
			System.out.println("Numer "+search+" Not found in list...and it has been added to list");
			list[mod].addAtEnd(search);
			list[mod].order();
		}
		//itrate through list in which element is present and store the updated list in string
		String retrieve1="";
		
		for(Map.Entry<Integer,LinkedList<Integer>> mp:slot.entrySet())
		{
			System.out.println("Key: "+mp.getKey()+"    Value: "+mp.getValue());
			retrieve1+=mp.getValue();
		}
		return retrieve1;
	}
	
	public static void ricewheatpulse(String file)
	{
		FileReader filereader=null;
		JSONParser parser=null;
		JSONObject json=null;
		try 
		{
			filereader=new FileReader(file);
			parser=new JSONParser();
			json=(JSONObject)parser.parse(filereader);
			JSONObject rice=(JSONObject) json.get("Rice");
			JSONObject pulse=(JSONObject) json.get("Pulses");
			JSONObject wheat=(JSONObject) json.get("Wheat");
			System.out.println(rice);
			System.out.println(pulse);
			System.out.println(wheat);
			
		} 
		catch (ParseException | IOException e) 
		{
			
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				filereader.close();
			} 
			catch (IOException e) 
			{
			
				e.printStackTrace();
			}
		}
		

	}
	public static void inventorymanagement(String file)
	{
		FileReader fileReader=null;
		JSONParser parser;
		JSONObject rice,pulses,json,wheat;
		FileWriter fileWriter=null;
		long total=0; 
		try{
			fileReader=new FileReader(file);
			parser=new JSONParser();
			json=(JSONObject) parser.parse(fileReader);
			rice=(JSONObject) json.get("Rice");
			
			total=(Long)rice.get("Weight")*(Long)rice.get("Price");
			rice.put("Total",total);
			
			pulses=(JSONObject) json.get("Pulses");
			total=(Long)pulses.get("Weight")*(Long)pulses.get("Price");
			pulses.put("Total",total);
			
			wheat=(JSONObject) json.get("Wheat");
			total=(Long)pulses.get("Weight")*(Long)pulses.get("Price");
			wheat.put("Total",total);
			
			json=new JSONObject();
			json.put("Rice", rice);
			json.put("Wheat", wheat);
			json.put("Pulses", pulses);
			
			String writefile="/home/bridgeit/project/File/UpdatedInvertoryDetails.json";
			fileWriter=new FileWriter(writefile);
			
			fileWriter.write(json.toJSONString());
			System.out.println(json.toJSONString());
			

			
			}
		catch(IOException | ParseException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fileReader.close();
				fileWriter.close();
			} 
			catch (IOException e)
			{
				
				e.printStackTrace();
			}
			
		}
		
	}
	public static void stockReport()
	{
		 int shares=0,price=0,total=0;
		 JSONObject json=null;
		 int totalvalue=0;
		
		 FileWriter fileWriter=null;
		 String file;
		Utility utility=new Utility();
		System.out.println("Enter No of stocks");
		int size=utility.nextInt();
		JSONArray jsonArray=new JSONArray();;
		JSONObject stockReport=null;
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Stock Name:");
			String name=utility.next();
			System.out.println("Enter Number of shares");
			shares=utility.nextInt();
			System.out.println("Enter Price of shares");
			price=utility.nextInt();
			total=shares*price;
			
			json=new JSONObject();
			json.put("Name", name);
			json.put("Shares", shares);
			json.put("Price",price);
			json.put("Total", total);
			totalvalue+=total;
			jsonArray.add(json);
			
			
			
		}
		
		/*int arr[]=new int[jsonArray.size()];
		for(int i=0;i<jsonArray.size();i++)
		{
			JSONObject obj=(JSONObject)jsonArray.get(i);
			arr[i]=(int) obj.get("Total");
		}
		int total1=0;
		for(int i=0;i<arr.length;i++)
		{
			total1+=arr[i];
		}*/
			
		
		
		stockReport=new JSONObject();
		stockReport.put("StockReport", jsonArray);
		stockReport.put("Total Share Value", totalvalue);
		file="/home/bridgeit/project/File/Stockreport.json";
		try 
		{
			fileWriter=new FileWriter(file);
			fileWriter.write(stockReport.toJSONString());
			System.out.println(stockReport.toJSONString());
		} 
		catch (IOException e) 
		{
						e.printStackTrace();
		}

	}
	public static void regularexpression(String input)
	{
		Utility utility=new Utility();
		String namevalidate="^[a-zA-Z ]+$";
		String contactvalidate="[0-9]{10}+$";
		String firstName="";
		String lastName="";
		String contact="";
		Pattern pattern=Pattern.compile(namevalidate);
		Matcher matcher=null;
		
		do
		{
			System.out.println("Enter First Name: ");
			firstName=utility.next();
			matcher=pattern.matcher(firstName);
			if(!matcher.matches())
			{
				System.out.println("Please Try Again!!!!!");
			}
			
		}while(!matcher.matches());
		
		
		
		Pattern pattern2=Pattern.compile(namevalidate);
		Matcher matcher2=null;
		do
		{
			System.out.println("Enter Your Last Name: ");
			lastName=utility.next();
			matcher2=pattern.matcher(lastName);
			if(!matcher2.matches())
			{
				System.out.println("Please Try Again!!!!!");
			}
		}while(!matcher2.matches());
		
		

		
		Pattern pattern3=Pattern.compile(contactvalidate);
		Matcher matcher3=null;
		do
		{
			System.out.println("Enter Contact Number: ");
			contact=utility.next();
			matcher3=pattern3.matcher(contact);
			if(!matcher3.matches())
			{
				System.out.println("Please Try Again!!!!!");
			}
		}while(!matcher3.matches());
		
		
		
		SimpleDateFormat formater=new SimpleDateFormat("dd/MM/yyyy");
		Date date=new Date();
		String stringdate=formater.format(date);
		input=input.replace("<<name>>", firstName);
		input=input.replace("<<full name>>",firstName+" "+lastName);
		input=input.replace("xxxxxxxxxx", contact);
		input=input.replace("01/01/2016", stringdate);
		System.out.println(input);	
	}
	
	/**
	 * purpose: Reads json File
	 * @param file file from which json object is to be read
	 * @return returns Object of json
	 */
	public static JSONObject readJsonFile(String path)
	{
		File file=null;
		FileReader read=null;
		JSONParser parser=null;
		JSONObject jsonObject=null;
		try
		{
			file=new File(path);
			boolean empty = !file.exists() || file.length() == 0;
			if(!empty)
			{
				read=new FileReader(file);
				parser=new JSONParser();
				jsonObject=(JSONObject) parser.parse(read);
			}
			else
			{
				return null;
			}
		}
		catch(IOException | ParseException exception)
		{
			exception.printStackTrace();
			
		}
		finally
		{
			try
			{
				read.close();
			}
			catch(IOException exception2)
			{
				exception2.printStackTrace();
			}
		}
		return jsonObject;
	}
	
	/**
	 * purpose:Writes json object to the specific folder
	 * @param file file to which json object is to be written
	 * @param jsonObject json object 
	 */
	public static void writeJsonFile(String file,JSONObject jsonObject)
	{
		FileWriter write=null;
	
		try
		{
			write=new FileWriter(file);
			write.write(jsonObject.toJSONString());
		}
		catch(IOException exception)
		{
			exception.printStackTrace();
			
		}
		finally
		{
			try
			{
				write.close();
			}
			catch(IOException exception2)
			{
				exception2.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
