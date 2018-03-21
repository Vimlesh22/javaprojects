/**
 * Purpose:Takes a command-line argument N, asks you to think of a number between 0 and N-1, 
 * where N = 2^n, and always guesses the answer with n questions
 * @author Vimlesh Kumar
 * @since 1 March 2018
 *
 */
package com.bridgelabz.algorithms;
import static com.bridgelabz.utility.Utility.*;


public class GuessNumber{

	

	public static void main(String args[]){
		System.out.println("Enter the Range :");
		find(0,Integer.parseInt(args[0])-1);
	}
}

