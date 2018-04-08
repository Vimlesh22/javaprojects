package com.bridgelabz.utility;

public class DeQueue<T> {
	
	int front;
	int rear;
	int capacity;
	LinkedList<T> deque;
	
	public DeQueue(int size)
	{
		capacity=size;
		front=-1;
		rear=-1;
		deque=new LinkedList<T>();
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
	
	public void addAtEnd(T ele)
	{
		if(isFull())
		{
			System.out.println("DeQue is Full!!!");
		}
		else
		{
			rear++;
			deque.addAtEnd(ele);
		}
	}
	public void addAtBegin(T ele)
	{
		if(isFull())
		{
			System.out.println("DeQue is Full!!!");
		}
		else
		{
			rear++;
			deque.addAtBegin(ele);
		}
	}
	public T removeFromLast()
	{
		if(isEmpty())
		{
			return null;
			
		}
		else
		{
			T ele=deque.getLastElement();
			deque.remove(ele);
			return ele;
		}
	}
	public T removeFromFirst()
	{
		if(isEmpty())
		{
			return null;
			
		}
		else
		{
			T ele=deque.getFirstElement();
			deque.remove(ele);
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
			deque.printList();
		}
	}
	
	public String toString()
	{
		return deque.toString();
	}

}
