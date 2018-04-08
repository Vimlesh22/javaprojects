/**
 * Purpose:To create a console game to play tic-tac-toe
 * @author Vimlesh Kumar
 * @since 13-03-2018
 *
 */
package com.bridgelabz.functionalprograms;
import static com.bridgelabz.utility.Utility.ticTacToe;
import static com.bridgelabz.utility.Utility.ticTacToeResult;


public class TicTacToe {
	

	public static void main(String[] args) {
		
		char array[][]=new  char[3][3];
		array=ticTacToe(array);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(array[i][j]+"  ");;
			}
			System.out.println("");
			System.out.println("");
		}
		String result=ticTacToeResult(array);
		System.out.println(result);
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

