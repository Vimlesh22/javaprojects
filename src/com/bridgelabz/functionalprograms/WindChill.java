/**
 * Purpose:To create windChill Formula 
 * @author Vimlesh Kumar
 * @since 16-03-2018
 *
 */



package com.bridgelabz.functionalprograms;



public class WindChill {
	public static void windChill(String a,String b)
	{
		
		double t=Double.parseDouble(a);
		double v=Double.parseDouble(b);
		if(t<50 && (v<120 || v>3))
		{
			
				double windchill=((35.74+0.6215*t)+(0.4275*t-35.75)*Math.pow(v, 0.16));
				System.out.println("Wind chill:"+windchill);
		
		}
		else
		{
			System.out.println("Value of t should > 50 and v should be <120 and > 3");
		}
	}

	public static void main(String[] args) {
		windChill(args[0],args[1]);

	}

}
