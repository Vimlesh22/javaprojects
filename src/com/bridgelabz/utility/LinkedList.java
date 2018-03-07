package com.bridgelabz.utility;
import com.bridgelabz.utility.Node;


public class LinkedList<T> {
	
	Node<T> head;
	Node<T> tail;
	int count;
	
	public LinkedList()
	{
		count=0;
		head=null;
		tail=null;
	}
	
	public boolean isEmpty()
	{
		if(head==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int size()
	{
		return count;
	}
	
	public boolean search(T value)
	{
		Node<T> temp=head;
		int var=1;
		while(!temp.getData().equals(value) && var<count)
		{
			temp=temp.getNext();
			var++;
		}
		if(temp.getData().equals(value))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public void remove(T value)
	{
		Node<T> temp=null;
		temp=head;
		Node<T> tempnext=temp.getNext();
		if(count==0)
		{
			System.out.println("Can't remove list is empty!!!!!");
			return;
		}
		if(temp.getData().equals(value) && head.getData().equals(value))
		{
			head=head.getNext();
			temp.setNext(null);
			count--;
		}
		else
		{
			while(!tempnext.getData().equals(value))
			{
				temp=temp.getNext();
				tempnext=tempnext.getNext();
			}
			temp.setNext(temp.getNext().getNext());
			tempnext.setNext(null);
			count--;
		}
		
		
	}
	public void addAtBegin(T item)
	{
		Node<T> node=new Node<T>();
		node.setData(item);
		if(head==null)
		{
			node.setNext(null);
			head=node;
			tail=node;
			count++;
		}
		else
		{
			node.setNext(head);
			head=node;
			count++;
		}
	}
	
	public void addAtEnd(T item)
	{
		Node<T> node=new Node<T>();
		node.setData(item);
		if(head==null)
		{
			node.setNext(null);
			head=node;
			tail=node;
			count++;
		}
		else
		{
			tail.setNext(node);
			node.setNext(null);
			tail=node;
			count++;
		}
	}
	
		
	public void printList()
	{
		if(count==0)
		{
			System.out.println("List is empty!!!!");
			return;
		}
		if(count==1)
		{
			System.out.print(head.getData()+" ");
			
		}
		else
		{
			Node<T> temp=null;
			temp=head;
			//System.out.print(head.getData()+"-->");
			while(temp.getNext()!=null)
			{
				System.out.print(temp.getData()+" ");
				temp=temp.getNext();
				
			}
			System.out.print(temp.getData()+" ");
		}
		System.out.println("");
	}
	
	
	
	public String toString()
	{
		Node<T> temp=head;
		String str="";
		while(temp!=null)
		{
			str+=temp.getData()+" ";
			temp=temp.getNext();
		}
		return str;
	}

}
