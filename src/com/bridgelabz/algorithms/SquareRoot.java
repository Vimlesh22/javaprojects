/**
 * Purpose:To find the square root of a number provided by the user.
 * @author Vimlesh Kumar
 * @since 3 March 2018
 *
 */
package com.bridgelabz.algorithms;
import static com.bridgelabz.utility.Utility.squareRoot;
import com.bridgelabz.utility.Utility;

public class SquareRoot {

	public static void main(String[] args) {
		Utility util=new Utility();
		System.out.println("Enter number to find squareroot");
		double num=util.nextDouble();
		double root=squareRoot(num);
		System.out.println("Square Root of Number is: "+root);
		

	}

}
