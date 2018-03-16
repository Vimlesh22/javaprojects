package com.bridgelabz.functionalprograms;

import java.util.concurrent.ThreadLocalRandom;

import com.bridgelabz.utility.Utility;

public class TicTacToe {
	

	public static void main(String[] args) {
		Utility utility=new Utility();
		int row,column,i,j,randomRow,randomColumn;
		System.out.println("**********Tic Tac Toe************");
		String array[][]=new String[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				array[i][j]="*";
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(array[i][j]+"  ");
			}
			System.out.println("");
			System.out.println("");
		}
		System.out.println("Player 1: User");
		System.out.println("Player 2: Computer");
		System.out.println("*********************************");
		System.out.println("Player 1 will start the game:");
		int count=0;
		do
		{
			count++;
			
			do
			{
				System.out.println("Enter row and coloumn");
				row=utility.nextInt();
				column=utility.nextInt();
				if(array[row][column]=="*")
				{
					array[row][column]="X";
				}
			}while(array[row][column]=="*");
			do
			{
				randomRow=ThreadLocalRandom.current().nextInt(0, 3);
				randomColumn=ThreadLocalRandom.current().nextInt(0, 3);
				array[randomRow][randomColumn]="0";
			}while(array[randomRow][randomColumn]=="X" || array[randomRow][randomColumn]=="0");
			
			
		}while(count!=9);
		System.out.println("");
		

	}

}





























/*
System.out.println(randomRow+"   "+randomColumn);
for(i=0;i<3;i++)
{
	
	for(j=0;j<3;j++)
	{
		if(i==row && j==column)
		{
			array[i][j]="X";
		}
	}

	for(j=0;j<3;j++)
	{
		
		if(array[randomRow][randomColumn]=="*")
		{
			array[randomRow][randomColumn]="0";
		}
		do
		{
			randomRow=ThreadLocalRandom.current().nextInt(0, 3);
			randomColumn=ThreadLocalRandom.current().nextInt(0, 3);
			array[randomRow][randomColumn]="0";
			
		}while(array[randomRow][randomColumn]=="*");
		
	}
	
	
}

for(i=0;i<3;i++)
{
	for(j=0;j<3;j++)
	{
		System.out.print(array[i][j]+"  ");
	}
	System.out.println("");
	System.out.println("");
}*/

