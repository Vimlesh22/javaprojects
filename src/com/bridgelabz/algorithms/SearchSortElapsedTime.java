package com.bridgelabz.algorithms;

import com.bridgelabz.utility.Utility;
import static com.bridgelabz.utility.Utility.binarySearchInteger;
import static com.bridgelabz.utility.Utility.binarySearchString;

public class SearchSortElapsedTime {
	
	
	public static void main(String[] args) {
		Utility utility=new Utility();
		int choice=0;
		do{
			System.out.println("********************Menu*****************************");
			System.out.println("1)Binary Serach Integer Method Time Elapsed");
			System.out.println("2)Binary Serach String Method Time Elapsed");
			System.out.println("3)Insertion Sort Integer Method Time Elapsed");
			System.out.println("4)Insertion Sort String Method Time Elapsed");
			System.out.println("5)Bubble Sort Integer Method Time Elapsed");
			System.out.println("6)Bubble Sort String Method Time Elapsed");
			System.out.println("7)Exit from Program");
			System.out.println("*****************************************************");
			System.out.println("Enter Your Choice: ");
			choice=utility.nextInt();
			System.out.println("Enter Size of array: ");
			int size=utility.nextInt();
			
			switch(choice)
			{
				case 1: System.out.println("Enter Elements of array");
						int array[]=new int[size];
						for(int i=0;i<size;i++)
						{
							array[i]=utility.nextInt();
						}
						System.out.println("Enter No to be searchedin array:");
						int number=utility.nextInt();
						long timeelapsed1=System.nanoTime();
						int position=binarySearchInteger(array, number);
						long timeelapsed2=System.nanoTime();
						long searchIntTime=(timeelapsed2-timeelapsed1);
						if(position>0)
						{
							System.out.println("Element "+number+" found at position "+position);
							System.out.println("Time Elapsed to search a number: "+searchIntTime+" nanosecond");
						}
						else{
							System.out.println("No not found in array list!!!!!!!!!!!!!!!!!");
						}
				break;
				
				case 2: System.out.println("Enter Elements of array");
						String array1[]=new String[size];
						for(int i=0;i<size;i++)
						{
							array1[i]=utility.next();
						}
						System.out.println("Enter No to be searchedin array:");
						String word=utility.next();
						long timeelapsed3=System.nanoTime();
						int position1=binarySearchString(array1, word);
						long timeelapsed4=System.nanoTime();
						long searchStringTime=(timeelapsed4-timeelapsed3);
						if(position1>0)
						{
							System.out.println("Element "+word+" found at position "+position1);
							System.out.println("Time Elapsed to search a number: "+searchStringTime+" nanosecond");
						}
						else{
							System.out.println("No not found in array list!!!!!!!!!!!!!!!!!");
						}
				break;
				
				case 3:
					 	System.out.println("Enter Elements of array");
						int array2[]=new int[size];
						for(int i=0;i<size;i++)
						{
							array2[i]=utility.nextInt();
						}
						long timeelapsed5=System.nanoTime();
						int[] sortedArray=utility.insertionSortInteger(array2);
						long timeelapsed6=System.nanoTime();
						long sortIntegerTime=timeelapsed6-timeelapsed5;
						System.out.println("Sorted Array: ");
						for(int i=0;i<sortedArray.length;i++)
						{
							System.out.print(sortedArray[i]+" ");
						}
						System.out.println("");
						System.out.println("Time Elapsed to sort an array: "+sortIntegerTime+" nanosecond");
					break;
						
						
				case 4:
						System.out.println("Enter Elements of array");
						String array3[]=new String[size];
						for(int i=0;i<size;i++)
						{
							array3[i]=utility.next();
						}
						long timeelapsed7=System.nanoTime();
						String[] sortedArrayString=utility.insertSortSting(array3);
						long timeelapsed8=System.nanoTime();
						long sortStringTime=timeelapsed8-timeelapsed7;
						System.out.println("Sorted Array: ");
						for(int i=0;i<sortedArrayString.length;i++)
						{
							System.out.print(sortedArrayString[i]+" ");
						}
						System.out.println("");
						System.out.println("Time Elapsed to sort an array: "+sortStringTime+" nanosecond");	
					break;
					
				case 5:
					System.out.println("Enter Elements of array");
					int array4[]=new int[size];
					for(int i=0;i<size;i++)
					{
						array4[i]=utility.nextInt();
					}
					long timeelapsed9=System.nanoTime();
					int[] sortedArrayBubble=utility.bubbleSortInteger(array4);
					long timeelapsed10=System.nanoTime();
					long sortBubbleStringTime=timeelapsed10-timeelapsed9;
					System.out.println("Sorted Array: ");
					for(int i=0;i<sortedArrayBubble.length;i++)
					{
						System.out.print(sortedArrayBubble[i]+" ");
					}
					System.out.println("");

					System.out.println("Time Elapsed to sort an array: "+sortBubbleStringTime+" nanosecond");	
				break;
					
					
				case 6:
					System.out.println("Enter Elements of array");
					String array5[]=new String[size];
					for(int i=0;i<size;i++)
					{
						array5[i]=utility.next();
					}
					long timeelapsed11=System.nanoTime();
					String[] sortedBubbleString=utility.bubbleSortString(array5);
					long timeelapsed12=System.nanoTime();
					long sortedBubbleTime=timeelapsed12-timeelapsed11;
					System.out.println("Sorted Array: ");
					for(int i=0;i<sortedBubbleString.length;i++)
					{
						System.out.print(sortedBubbleString[i]+" ");
					}
					System.out.println("");

					System.out.println("Time Elapsed to sort an array: "+sortedBubbleTime+" nanosecond");	
				break;
					
					
					
					
					
					
					
			}
			
		}while(choice!=9);
	}

}
