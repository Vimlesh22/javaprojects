package com.bridgelabz.designpattern;

import com.bridgelabz.utility.SocketAdapter;
import com.bridgelabz.utility.SocketClassAdapter;
import com.bridgelabz.utility.Volt;

public class AdapterPattern {
	
	public static void main(String[] args) {
	
		System.out.println("Class Adapter");
		SocketAdapter socketAdapter=new SocketClassAdapter() ;
		Volt v=socketAdapter.get3Volt();
		System.out.println("Class Adapter Voltage: "+v.getVolt());
		System.out.println("***********************************************************");
		System.out.println("Object Adapter");
		SocketAdapter socketAdapterObject=new SocketClassAdapter() ;
		Volt volt=socketAdapterObject.get3Volt();
		System.out.println("Object Adapter Voltage: "+volt.getVolt());
			
			
	}
}