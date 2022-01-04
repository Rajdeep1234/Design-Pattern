package com.tul.linkedlist;

import com.tul.linkedlist.LinkedListReverse.Node;

public class ReverseAlinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListReverse list=new LinkedListReverse();
		list.head=new Node(85);
		list.head.next=new Node(120);
		list.head.next.next=new Node(100);
		list.head.next.next.next=new Node(150);
		
		printList(list);
		
		Node head=reverseAlinkedList(list.head);
		System.out.println("-----------");
		printListrev(head);

	}

	private static void printListrev(Node head) {
		
		Node n=head;
		
		while(null!=n)
		{
			System.out.println("val:"+n.value);
			n=n.next;
		}
		
	}

	private static Node reverseAlinkedList(Node head ) {
		// TODO Auto-generated method stub
		Node prev=null;
		Node current=head;
		Node next=null;
		
		while(current!=null)
		{
			
			next=current.next;
			current.next=prev;
			
			prev=current;
			current=next;
						
		}
		head=prev;
		return head;
		
	}

	private static void printList(LinkedListReverse list) {
		
		Node n=list.head;
		
		while(null!=n)
		{
			System.out.println("val:"+n.value);
			n=n.next;
		}
		
	}

}

class LinkedListReverse
{
	static Node head;
	
	static class Node{
	  int value;
	  Node next;
	  
	  Node(int value)
	  {
		  this.value=value;
		  this.next=null;
	  }
	}
}
