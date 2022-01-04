package com.tul.linkedlist;

import com.tul.linkedlist.LinkedListLoop.Node;

public class CircularLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   
		LinkedListLoop list=new LinkedListLoop();
		
		list.head=new Node(1);
		
		list.head.next=new Node(4);
		
		list.head.next.next=new Node(4);
		list.head.next.next.next=new Node(6);
		list.head.next.next.next.next=new Node(7);
		printvalues(list.head);
		list.head.next.next.next.next=list.head;
		
	
		 detectloop(list.head);
		//How to print circular linked list

	}
	
	
	static void printvalues(Node head)
	{
		Node node=head;
		while(null!=node)
		{
			System.out.println("Value : "+node.value);
			node=node.next;
		}
	}
	
	void push(Node newnode,Node head)
	{
		newnode.next=head.next;
		head=newnode.next;
	}
	
	static void detectloop(Node head)
	{
		Node fast=head;
		Node slow=head;
		int i=0;
		 System.out.println("@@@ "+fast.value+" : "+slow.value);
		while(null!=fast && null!=slow && fast.next!=null )
		{
			System.out.println("@@@ "+fast.value+" : "+slow.value);
         if(fast==slow && i!=0 )
         {
        	 i++;
        	 System.out.println("loop detected : "+fast.value+" "+slow.value+" "+i);
        	 System.out.println(fast.value+" : "+slow.value);
        	 break;
         }
         else
         {
        	 i++;
        	 System.out.println(fast.value+" : "+slow.value);
         }
         fast=fast.next;
         slow=slow.next.next;
        
		}
		
	}

}



class LinkedListLoop
{
	Node head;
	
	static  class Node
	{
		int value;
		Node next;
		
		Node(int value)
		{
			this.value=value;
			this.next=null;
		}
	}
}