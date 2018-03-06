package com.bridgelabz.functionalprograms;

public class Distance {
	public static void eucledian(String a,String b)
	{
		int x=Integer.parseInt(a);
		int y=Integer.parseInt(b);
		double distance= Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		System.out.println("Eucledian distance is: "+distance);
	}

	public static void main(String[] args) {
		
		eucledian(args[0],args[1]);
		

	}

}
