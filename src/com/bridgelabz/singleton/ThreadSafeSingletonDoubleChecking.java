package com.bridgelabz.singleton;

public class ThreadSafeSingletonDoubleChecking {
	
	private static ThreadSafeSingletonDoubleChecking instance;
	
	private ThreadSafeSingletonDoubleChecking()
	{}
	
	public static ThreadSafeSingletonDoubleChecking getInstance()
	{
		
			
			synchronized (ThreadSafeSingletonDoubleChecking.class) {
				if(instance==null)
				{
					instance=new ThreadSafeSingletonDoubleChecking();
				}
			}
		
		return instance;
	}

}
