package com.bridgelabz.algorithms;
import static com.bridgelabz.algorithms.Utility.*;



public class TemperatureConversion {
	
	
	
	public static void main(String[] args) {
		int ch=0;
		Utility util=new Utility();
		do{
			System.out.println("**********Menu*******************");
			System.out.println("1)Celsius to fahrenheit ");
			System.out.println("2)Fahrenheit to celsius");
			System.out.println("3)Exit");
			System.out.println("*********************************");
			System.out.println("Enter Your choice:");
			ch=util.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Temprature in Celcius");


				float fah=celToFah(util.nextInt());

				System.out.println("Temperature in fahrenheit is : "+fah);
				break;
				
			case 2:
				System.out.println("Enter Temprature in fahrenheit");

				float cel=fahToCel(util.nextInt());
				System.out.println("Temperature in Celcius is : "+cel);
				break;
		
				
			case 3 :
				
				System.exit(0);
				break;
				
			}
		}while(ch!=9);
		

	}

}
