package com.bridgelabz.algorithms;
import static com.bridgelabz.utility.Utility.*;
import com.bridgelabz.utility.Utility;

public class GuessNumber{

	

	public static void main(String args[]){
		System.out.println("Enter the Range :");
		int num=new Utility().nextInt();
		find(0,num-1);
	}
}

