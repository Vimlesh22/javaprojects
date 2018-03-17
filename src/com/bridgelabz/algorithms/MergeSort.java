package com.bridgelabz.algorithms;


import com.bridgelabz.utility.Utility;

public class MergeSort {

	public static void merge(int array[] ,int p,int q,int r)
	{
		int sortedarray[]=new int[array.length];
		int k=0;
		int i=0;
		int j=0;
		
 		int n1=q-p+1;
		System.out.println("n1: "+n1);
		int n2=(r-q);
		System.out.println("n2: "+n2);
		
		int leftarray[]=new int[n1+1] ;
		int rightarray[]=new int[n2+1] ;
		for(i=p;i<n1;i++)
		{
			leftarray[(i-p)]=array[p+i];
		}
		for(j=0;j<n2;j++)
		{
			rightarray[j]=array[q+i];
		}
		
		leftarray[n1]=(int) Float.POSITIVE_INFINITY;
		rightarray[n2]=(int) Float.POSITIVE_INFINITY;
		for(k=p;k<=r;k++)
		{
			if(leftarray[i]<=rightarray[j])
			{
				array[k]=leftarray[i];
				i++;	
			}
			else{
				array[k]=rightarray[j];
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
		Utility utility=new Utility();
		System.out.println("Enter Size of array");
		int size=utility.nextInt();
		int array[]=new int[size];
		System.out.println("Enter element in array");
		for(int i=0;i<array.length;i++)
		{
			array[i]=utility.nextInt();
		}
		System.out.println("Array Length"+(array.length-1));
		mergeSort(array,0,array.length-1);
		
	}

}
