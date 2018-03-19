package com.bridgelabz.utility;

public class Stack<T> {

	int top;
	LinkedList<T> stack;
	int capacity;
	
	public Stack(int size)
	{
		stack=new LinkedList<T>();
		top=0;
		capacity=size;
	}
	public boolean isEmpty()
	{
		if(top==0)
		{
			return true;
		}
		else
			return false;
		
	}
	public boolean isFull()
	{
		if(top==capacity)
		{
			return true;
		}
		else
			return false;
	}
	public void push(T ele)
	{
		if(!isFull())
		{					
			stack.addAtEnd(ele);
			top++;
			
		}
		else
		{
			System.out.println("Stack is Full!! Can't add element!!");
			
		}
	}
	public T pop()
	{
		if(!isEmpty())
		{
			T x=stack.getLastElement();
			stack.remove(x);
			top--;
			return x;
		}
		else
		{
			
			//System.out.println("Stack is Empty!! Can't pop!!");
			return null;
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
			stack.printList();
		}
	}
	

}
