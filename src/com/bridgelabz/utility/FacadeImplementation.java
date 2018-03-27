package com.bridgelabz.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


class Facade
{
	public static JSONObject readJsonFile(String path)
	{
		FileReader file=null;
		JSONParser parser=null;
		JSONObject jsonObject=null;
		File checkingFile=null;
		try
		{
			checkingFile=new File(path);
			if(checkingFile.length()==0)
			{
				jsonObject=null;
			}
			else
			{
				file=new FileReader(path);
				parser=new JSONParser();
				jsonObject=(JSONObject)parser.parse(file);
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				file.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		return jsonObject;
	}
	
}

public class FacadeImplementation 
{
	public JSONObject getDetailsFromFile(String path) 
	{
		return Facade.readJsonFile(path);
	}

	public void printDetails(JSONObject jsonObject) 
	{
		System.out.println(jsonObject);
	}
}
