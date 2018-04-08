package com.bridgelabz.utility;
import static com.bridgelabz.utility.Utility.bubbleSortInteger; 
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
	
	public void order()
	{
		Node<T> i;
		Node<T> j;
		T c=null;
		for(i=head;i!=null;i=i.getNext())
		{
			for(j=i.getNext();j!=null;j=j.getNext())
			{
				int a=(int)i.getData();
				int b=(int)j.getData();
				if(a>b)
				{
					c=i.getData();
					i.setData(j.getData());
					j.setData(c);
				}
			}
		}
	}
	
	public void orderString()
	{
		 T temp=null;
		 String a,b;
		 for(Node<T> i=head;i!=null;i=i.getNext())
		 {
			 for(Node<T> j=i.getNext();j!=null;j=j.getNext())
			 {
				 a=(String)i.getData();
				 b=(String)j.getData();
				 if(a.compareTo(b)>0)
				 {
					 temp=i.getData();
					 i.setData(j.getData());
					 j.setData(temp);
				 }
			 }
		 }
}
	
	public boolean search(T value)
	{
		Node<T> temp=head;
		int var=1;
		//String value=search.toString();
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
	
	
	public T getLastElement()
	{
		return tail.getData();
	}
	
	public T getFirstElement()
	{
		if(head!=null)
		{
		return head.getData();
		}
		else 
			return null;
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
			while(temp.getNext()!=null)
			{
				System.out.print(temp.getData()+" ");
				temp=temp.getNext();
				
			}
			System.out.print(temp.getData()+" ");
		}
		System.out.println("");
	}
	
	public void printReverseList(int length)
	{
		int[] store=null;
		if(count==0)
		{
			System.out.println("List is empty!!!!");
			
		}
		if(count==1)
		{
			System.out.print(head.getData()+" ");
			
		}
		else
		{
			Node<T> temp=null;
			temp=head;
			store=new int[length];
			int count=0;
			while(temp.getNext()!=null)
			{
				store[count]=(int)temp.getData();
				temp=temp.getNext();
				count++;
			}
			/*count++;
			store[count]=(String)temp.getData();*/
		}
		int[] sortedArray=bubbleSortInteger(store);
		for(int i=sortedArray.length-1;i>0;i--)
		{
			System.out.print(sortedArray[i]+" ");
		}
		
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
	
	
	public String[] retrieve()
	{
		int size=this.count;
		String array[]=new String[count];
		int count=0;
		for(Node<T> i=head;i!=null;i=i.getNext())
		{
			array[count]=(String)i.getData();
			count++;
		}
		return array;
}

}
