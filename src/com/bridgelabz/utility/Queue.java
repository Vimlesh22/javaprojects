package com.bridgelabz.utility;

public class Queue {
	
	int front;
	int rear;
	int capacity;
	Object queue[];
	
	public Queue(int size)
	{
		capacity=size;
		front=-1;
		rear=-1;
		queue=new Object[size];
	}
	
	public boolean isEmpty()
	{
		if(rear==-1)
		{
			return true;
		}
		else 
			return false;
		
	}
	public boolean isFull()
	{
		if(rear==capacity)
		{
			return true;
		}
		else 
			return false;
	}
	public int size()
	{
		return rear+1;
	}
	
	public void enqueue(Object ele)
	{
		if(isFull())
		{
			System.out.println("Queue is Full!!!");
		}
		if(front==-1)
		{
			front=0;
			rear=0;
			queue[rear]=ele;
		}
		else
		{
			rear++;
			queue[rear]=ele;
		}
	}
	public Object dequeue()
	{
		if(isEmpty())
		{
			return "Queue is empty..cant remove!!!";
			
		}
		else
		{
			if(rear==0)
			{
				rear--;
			}
			else
			{
			for(int i=front;i<=rear;i++)
			{
				queue[i]=queue[i+1];
			}
			rear--;
			}
			return "Successfully removed!!";
		}
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("List is Empty!!!!");
		}
		else
		{
			for(int i=0;i<=rear;i++)
			{
				System.out.println(queue[i]);
			}
		}
	}

}
