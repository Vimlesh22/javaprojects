package com.bridgelabz.utility;

public class Stack {

	int top;
	Object stack[];
	int capacity;
	
	public Stack(int size)
	{
		stack=new Object[size];
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
	public void push(int ele)
	{
		if(!isFull())
		{					
			stack[top]=ele;
			top++;
			
		}
		else
		{
			System.out.println("Stack is Full!! Can't add element!!");
			
		}
	}
	public Object pop()
	{
		if(!isEmpty())
		{
			Object x=stack[top];
			top--;
			return x;
		}
		else
		{
			System.out.println("Stack is Empty!! Can't pop!!");
			return -1;
		}
		
	}
	

}
