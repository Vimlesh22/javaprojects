/**
 * Purpose:To find the different permutation of string 
 * @author Vimlesh Kumar
 * @since 3 March 2018
 *
 */
package com.bridgelabz.algorithms;

import com.bridgelabz.utility.Utility;
import static com.bridgelabz.utility.Utility.permute;

public class StringPermutation
{
 public static void main(String[] args)
 {
	 Utility utility=new Utility();
	 System.out.println("Enter a word");
	 String word=utility.next();
     int n = word.length();
     permute(word, 0, n-1);
 }

 

}