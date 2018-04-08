package com.bridgelabz.algorithms;

import com.bridgelabz.utility.Utility;
import static com.bridgelabz.utility.Utility.binarySearchInteger;
import static com.bridgelabz.utility.Utility.binarySearchString;
import static com.bridgelabz.utility.Utility.timeElapsed;
import static com.bridgelabz.utility.Utility.bubbleSortString;
import static com.bridgelabz.utility.Utility.bubbleSortInteger;
import static com.bridgelabz.utility.Utility.insertionSortInteger;
import static com.bridgelabz.utility.Utility.insertSortSting;
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
			System.out.println("7)Time taken for searching and sorting in descending order");
			System.out.println("8)Exit from Program");
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
						long timeElapsed1=System.nanoTime();
						int position=binarySearchInteger(array, number);
						long timeElapsed2=System.nanoTime();
						long searchIntTime=(timeElapsed2-timeElapsed1);
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
						long timeElapsed3=System.nanoTime();
						int position1=binarySearchString(array1, word);
						long timeElapsed4=System.nanoTime();
						long searchStringTime=(timeElapsed4-timeElapsed3);
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
						long timeElapsed5=System.nanoTime();
						int[] sortedArray=insertionSortInteger(array2);
						long timeElapsed6=System.nanoTime();
						long sortIntegerTime=timeElapsed6-timeElapsed5;
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
						long timeElapsed7=System.nanoTime();
						String[] sortedArrayString=insertSortSting(array3);
						long timeElapsed8=System.nanoTime();
						long sortStringTime=timeElapsed8-timeElapsed7;
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
					long timeElapsed9=System.nanoTime();
					int[] sortedArrayBubble=bubbleSortInteger(array4);
					long timeElapsed10=System.nanoTime();
					long sortBubbleStringTime=timeElapsed10-timeElapsed9;
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
					long timeElapsed11=System.nanoTime();
					String[] sortedBubbleString=bubbleSortString(array5);
					long timeElapsed12=System.nanoTime();
					long sortedBubbleTime=timeElapsed12-timeElapsed11;
					System.out.println("Sorted Array: ");
					for(int i=0;i<sortedBubbleString.length;i++)
					{
						System.out.print(sortedBubbleString[i]+" ");
					}
					System.out.println("");

					System.out.println("Time Elapsed to sort an array: "+sortedBubbleTime+" nanosecond");	
				break;
					
				case 7:
					timeElapsed(size);
					break;
					
			}
			
		}while(choice!=9);
	}

}
