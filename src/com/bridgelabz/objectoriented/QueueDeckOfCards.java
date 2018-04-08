package com.bridgelabz.objectoriented;
import com.bridgelabz.utility.*;

public class QueueDeckOfCards 
{
	public static void main(String[] args) 
	{
		String suit[]={"Clubs","Diamonds","Hearts","Spades"};
		String rank[]={"a2","b3","c4","d5","e6","f7","g8","h9","i10","jJack","kQueen","lKing","mAce"};
		String unShuffledCards[][]=new String [52][2];
		int row=0,column=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<13;j++)
			{
				unShuffledCards[row][column]=suit[i];
				unShuffledCards[row][column+1]=rank[j];
				row++;
			}
		}
		Utility.queueDeckOfCards(unShuffledCards,suit,rank);
	}
}
