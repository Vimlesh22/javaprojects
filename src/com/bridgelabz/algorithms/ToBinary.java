/**
 * Purpose:To find the different permutation of string 
 * @author Vimlesh Kumar
 * @since 4 March 2018
 *
 */

package com.bridgelabz.algorithms;
import static com.bridgelabz.utility.Utility.toBinary;
import com.bridgelabz.utility.Utility;
public class ToBinary {

	public static void main(String[] args) {
		Utility util=new Utility();
		System.out.println("Enter a Number:");
		int no=util.nextInt();
		
		toBinary(no);
		
		
	}

}
