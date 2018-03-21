/**
 * Purpose:Reads in strings from standard input and prints them in sorted order
 * Uses insertion sort.
 * @author Vimlesh Kumar
 * @since 1 March 2018
 *
 */
package com.bridgelabz.algorithms;
import static com.bridgelabz.utility.Utility.*;
import com.bridgelabz.utility.Utility;
import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		Utility util=new Utility();
		System.out.println("Enter Size of Array");
		int size=util.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements in array:");
		for(int i=0;i<size;i++)
		{
			arr[i]=util.nextInt();
		}
		int arr1[]=insertionSortInteger(arr);
		System.out.println("Sorted Array :"+Arrays.toString(arr1));
	}

}
