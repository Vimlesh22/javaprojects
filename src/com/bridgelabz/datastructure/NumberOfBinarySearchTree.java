/**
 * Purpose:To Find no. of binary tree
 * @author Vimlesh Kumar
 * @since 16-03-2018
 *
 */

package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;


public class NumberOfBinarySearchTree {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter Number:");
		double number=utility.nextInt();
		double numberofbinary=Utility.numberofbinarytree(number);
		System.out.println("Number of binary tree:"+numberofbinary);

	}

}
