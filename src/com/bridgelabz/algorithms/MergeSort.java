/**
 * Purpose:To Merge Sort an array, we divide it into two halves, sort the two halves independently, 
 * and then merge the results to sort the full array,using recursion.
 * @author Vimlesh Kumar
 * @since 1 March 2018
 *
 */

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
import static com.bridgelabz.utility.Utility.printArray;
import static com.bridgelabz.utility.Utility.sort;

public class MergeSort
{
   
    
    public static void main(String args[])
    {
    	Utility utility=new Utility();
    	System.out.println("Enter Size of array:");
    	int size=utility.nextInt();
        int array[] =new int[size];
        System.out.println("Enter Array elements");
        for(int i=0;i<array.length;i++)
        {
        	array[i]=utility.nextInt();
        }
        System.out.println("Array Elements:");
        printArray(array);
 
        
        sort(array, 0, array.length-1);
 
        System.out.println("\nSorted array");
        printArray(array);
    }
}