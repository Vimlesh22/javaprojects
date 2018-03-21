package com.bridgelabz.singleton;

import java.io.Serializable;

public class SingletonSerialization implements Serializable {
	
	private static final long serialVersionUID = -7809395313977991058L;


	private SingletonSerialization()
	{
		
	}
	private static class SingletonHelper
	{
		private static final SingletonSerialization INSTANCE=new SingletonSerialization();
	}
	
	
	public static SingletonSerialization getInstance()
	{
		return SingletonHelper.INSTANCE;
	}

}
