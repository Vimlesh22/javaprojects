/**
 * Purpose:To find the  given the temperature in fahrenheit as input outputs the temperature in Celsius or viceversa 
 * using the formula:
 *	Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F
 *	Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C
 * @author Vimlesh Kumar
 * @since 3 March 2018
 *
 */

package com.bridgelabz.algorithms;
import static com.bridgelabz.utility.Utility.celToFah;
import static com.bridgelabz.utility.Utility.fahToCel;
import com.bridgelabz.utility.Utility;



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
