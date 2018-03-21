package com.bridgelabz.singleton;

public class LazyInitilization {
	
	private static LazyInitilization instance;
	
	private LazyInitilization()
	{}
	
	public static LazyInitilization getInstance()
	{
		if(instance==null)
		{
			instance=new LazyInitilization();
		}
		return null;
	}
	
	

}
