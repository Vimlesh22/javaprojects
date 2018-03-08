package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Queue;
import com.bridgelabz.utility.Utility;
public class BankingCashCounter {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter Size of queue");
		int size=utility.nextInt();
		Queue queue=new Queue(size);
		int ch=0;
		do{
			System.out.println("1)Enqueue");
			System.out.println("2)Dequeue");
			System.out.println("3)Display");
			System.out.println("4)exit");
			System.out.println("Enter your choice");
			ch=utility.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter element:");
					int ele=utility.nextInt();
					queue.enqueue(ele);
					break;
					
				case 2:
					String s=(String)queue.dequeue();
					System.out.println(s);
					break;
					
				case 3:
					queue.display();
					break;
					 
				case 4:
					System.exit(0);
						
			}
		}while(ch!=9);

	}

}
