package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class TwoDArray {
	public static<E> void display(E[][] array,int row,int col)
	{
		for(int m=0;m<row;m++)
		{
			for(int n=0;n<col;n++)
			{
				
				System.out.print(array[m][n]+" ");
			}
			System.out.println("");
		}
	}
	

	public static void twodarray()
	{
		int ch=0;
		
		try(Scanner sc=new Scanner(System.in);)
		{
			do
			{
				{
					System.out.println("****************Menu************************"+
							"\n1)TwoDArray for integer"+
							"\n2)Two2Array for boolean"+
							"\n3)Two2Array for double"+
							"\n*****************************************");
					System.out.println("Enter your choice");
					ch=sc.nextInt();
					System.out.println("Enter rows and column for array");
					int row=sc.nextInt();
					int col=sc.nextInt();
					switch(ch)
					{
					case 1:
						
						Integer array[][]=new Integer [row][col];
						System.out.println("Enter elements in array:");
						for(int i=0;i<row;i++)
						{
							for(int j=0;j<col;j++)
							{
								array[i][j]=sc.nextInt();
							}
						}
						display(array,row,col);
						break;
						
					case 2:
						Boolean array2[][]=new Boolean[row][col];
						System.out.println("Enter elements in array:");
						for(int i=0;i<row;i++)
						{
							for(int j=0;j<col;j++)
							{
								array2[i][j]=sc.nextBoolean();
							}
						}
						display(array2,row,col);
						
						break;
						
					case 3:
						Double array1[][]=new Double[row][col];
						System.out.println("Enter elements in array:");
						for(int a=0;a<row;a++)
						{
							for(int b=0;b<col;b++)
							{
								array1[a][b]=sc.nextDouble();
							}
						}
						display(array1,row,col);
						
						break;
						
					}
				
				}
				
				
			}while(ch!=5);

		}

	}
	
	public static void main(String[] args) {
		twodarray();
		
	}
}
