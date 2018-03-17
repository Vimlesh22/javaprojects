package com.bridgelabz.algorithms;

import static com.bridgelabz.utility.Utility.*;
import com.bridgelabz.utility.Utility;

public class MergeSort {

	public static void merge(int array[] ,int p,int q,int r)
	{
		int sortedarray[]=new int[array.length];
		int k=p;
		int i=p;
		int j=q;
		
 		int n1=q-p+1;
		System.out.println("n1: "+n1);
		int n2=(r-q);
		System.out.println("n2: "+n2);
		
		int leftarray[]=new int[n1+1] ;
		int rightarray[]=new int[n2+1] ;
		for(i=p;i<=q;i++)
		{
			leftarray[(i-p)+1]=array[i];
		}
		for(j=q+1;j<=r;j++)
		{
			rightarray[j-q]=array[j];
		}
		
		leftarray[n1]=(int) Float.POSITIVE_INFINITY;
		rightarray[n2]=(int) Float.POSITIVE_INFINITY;
		//int sortedarray[]=new int[p+r-1];
		for(k=p;k<r;k++)
		{
			if(leftarray[i]<=rightarray[j])
			{
				sortedarray[k]=leftarray[i];
				i++;	
			}
			else{
				sortedarray[k]=rightarray[j];
				j++;
			}
		}
		for(int s=0;s<sortedarray.length;s++)
		{
			System.out.println(sortedarray[s]+" ");
		}
	}
	
	public static void mergeSort(int array[],int p,int r)
	{
		System.out.println(p+" "+r);
		int q;
		if(p<r)
		{
			q=(p+r)/2;
			
			mergeSort(array, p, q);
			mergeSort(array, q+1, r);
			merge(array, p, q, r);
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Size of array");
		int size=scanner.nextInt();
		int array[]=new int[size];
		System.out.println("Enter element in array");
		for(int i=0;i<array.length;i++)
		{
			array[i]=scanner.nextInt();
		}
		
		mergeSort(array,0,array.length-1);
		scanner.close();
	}

}
