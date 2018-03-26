package com.bridgelabz.objectoriented;

import com.bridgelabz.utility.Utility;

public class DeckOfCards {

	public static void main(String[] args) {
		
		String suit[]={"Clubs","Diamonds","Hearts","Spades"};
		String rank[]={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		String unShuffledCards[][]=new String [52][2];
		int row=0,column=0;
		//for storing all the unshuffled card,we will iterate through loop in which 4 column  and 13 rows will store
		//all the cards.
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<13;j++)
			{
				unShuffledCards[row][column]=suit[i];
				unShuffledCards[row][column+1]=rank[j];
				row++;
			}
		}
		String distributeCards[][]=Utility.deckOfCards(unShuffledCards,suit,rank);
		distributeCards=Utility.alignSpace(distributeCards);
		System.out.println("Distributed Cards for All four Player:");
		for(int i=0;i<14;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(distributeCards[i][j]+"  ");
			}
			System.out.println();
		}
}

}
