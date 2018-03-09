package com.bridgelabz.utility;

public class Queue<T> {
	
	int front;
	int rear;
	int capacity;
	LinkedList<T> queue;
	
	public Queue(int size)
	{
		capacity=size;
		front=-1;
		rear=-1;
		queue=new LinkedList<T>();
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
	
	public void enqueue(T ele)
	{
		if(isFull())
		{
			System.out.println("Queue is Full!!!");
		}
		else
		{
			rear++;
			queue.addAtEnd(ele);
		}
	}
	public T dequeue()
	{
		if(isEmpty())
		{
			return null;
			
		}
		else
		{
			T ele=queue.getFirstElement();
			queue.remove(ele);
			return ele;
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
			queue.printList();
		}
	}

}
