package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Queue;
import com.bridgelabz.utility.Utility;
public class BankingCashCounter {

	public static void main(String[] args) {
		Utility utility=new Utility();
		double amount=10000000;
		System.out.println("Enter Size of queue");
		int size=utility.nextInt();
		Queue<Integer> queue=new Queue<Integer>(size);
		int ch=0;
		for(int i=0;i<size;i++)
		{
			queue.enqueue(i);
		}
		int loop=size;
		do{
			System.out.println("1)Deposit Money To Bank");
			System.out.println("2)Withdraw Money From Bank");
			System.out.println("3)Display");
			System.out.println("4)exit");
			System.out.println("Enter your choice");
			ch=utility.nextInt();
			
			switch(ch)
			{
				case 1:
					System.out.println("Enter Amount to deposit");
					double depo=utility.nextDouble();
					amount+=depo;
					queue.dequeue();
					loop--;
					System.out.println("Amount in Bank"+amount);
					
					break;
					
				case 2:
					System.out.println("Enter Amount to withdraw");
					double withdraw=utility.nextDouble();
					if(amount<withdraw)
					{
						System.out.println("Bank dosn't have Sufficient Balance to withraw");
						queue.dequeue();
						loop--;
						
					}
					else
					{
						
						amount-=withdraw;
						queue.dequeue();
						loop--;
						System.out.println("Amount in Bank"+amount);
					}
					break;
					
				case 3:
					queue.display();
					break;
					
					
				case 4:
					System.exit(0);
					
						
			}
		}while(loop!=0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*do{
			System.out.println("1)Deposit Money To Bank");
			System.out.println("2)Withdraw Money From Bank");
			System.out.println("3)Display");
			System.out.println("4)exit");
			System.out.println("Enter your choice");
			ch=utility.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter Amount to deposit");
					double depo=utility.nextDouble();
					amount+=depo;
					queue.dequeue();
					System.out.println("Amount in Bank"+amount);
					
					break;
					
				case 2:
					System.out.println("Enter Amount to withdraw");
					double withdraw=utility.nextDouble();
					amount-=withdraw;
					queue.dequeue();
					System.out.println("Amount in Bank"+amount);
					break;
					
				case 3:
					queue.display();
					break;
					 
				case 4:
					System.exit(0);
						
			}
		}while(ch!=9);
*/
	}

}
