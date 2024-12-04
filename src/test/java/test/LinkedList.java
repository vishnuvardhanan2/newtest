package test;

public class LinkedList {

public static void main(String[] args) {
		
	LinkedList l= new LinkedList();
l.insertvalueatlast(100);
l.insertvalueatlast(110);
l.insertvalueatlast(120);
l.insertvalueatlast(130);
//l.insertvalueatindex(115, 2);

l.printvalue();
l.pairwiseswap();
System.out.println("after swap");
l.printvalue();
	}

public void insertvalueatlast(int data)
{
	node newnode= new node(data);
	if(head==null)
	{
		head=newnode;
	}
	else
	{
		node temp= head;
		
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newnode;
		
	}
	
}

public void insertvalueatfirst(int data)
{
	node newnode= new node(data);
	
	if(head==null)
	{
		head=newnode;
	}
	else
	{
		newnode.next=head;
		head=newnode;
	}
}

public void insertvalueatindex(int data, int index)
{
	node newnode= new node(data);
	if(index==0)
	{
		insertvalueatfirst(data);
	}
	else
	{
		node temp= head;
		
		for(int i=0;i<index-1;i++)
		{
			temp=temp.next;
		}
		newnode.next=temp.next;
		temp.next=newnode;
		
	}
}

public void printvalue()
{
	node temp= head;
	while(temp!=null)
	{
		System.out.println(temp.value);
		temp=temp.next;
	}
	
}

public void pairwiseswap()
{
	node temp=head;
	
	while(temp!=null && temp.next!=null)
	{
		int k= temp.value;
		temp.value=temp.next.value;
		temp.next.value=k;
		
		temp=temp.next.next;
		
		
	}
}

node head;
	class node{
		
		int value;
		node next;
		
		public node(int value)
		{
		this.value=value;
		next=null;	
		}
	}
	
	
	
	
	
	

}
