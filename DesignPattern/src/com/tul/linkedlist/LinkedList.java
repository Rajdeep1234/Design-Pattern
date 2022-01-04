package com.tul.linkedlist;




public class LinkedList {
	
	Node head;
	
	static class Node //static for accessing the linked list from main class//else create a non static class
	{
		int value;
		Node  next;
		
	Node (int value)
	{
		this.value=value;
		next=null;
	}
	
	
	}
	
	public void printList()
	{
		LinkedList list=new LinkedList();
		
		Node n=head;
				while(null!=n)
				{
					System.out.println(""+n.value);
					n=n.next;
					
				}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		
		list.head.next=second;
		second.next=third;
		list.printList();
		
		Node n=new Node(4);
		System.out.println("------------------");
		pushInFront(list,n);
		System.out.println("------------------");
		list.printList();
		System.out.println("------------------");
		insertAfterValue4(list,6);
		list.printList();
		atTheEndOfTheNode(list,7);
		System.out.println("------------------");
		list.printList();
		deletANodeOfValue5(list,4,10);
		System.out.println("------------------");
		list.printList();
		
		atTheEndOfTheNode(list,8);
		System.out.println("------------------");
		list.printList();
		
		lengthOfLinkedList(list);
	}


	private static void lengthOfLinkedList(LinkedList list) {
		// TODO Auto-generated method stub
		
		Node n=list.head;
		int len=0;
		while(null!=n)
		{
			n=n.next;
			len++;
		}
		System.out.println("len:"+len);
		
	}


	private static void deletANodeOfValue5(LinkedList list, int i,int newvalue) {
		// TODO Auto-generated method stub
		Node n=new Node(newvalue);
		Node listnode=list.head;
		Node prev=null;
		while(null!=listnode && listnode.value!=i)
		{
			prev=listnode;
			listnode=listnode.next;
		}
		
		if(prev!=null && null != listnode)
		{
		prev.next=listnode.next;
		}
		
		if(null!=listnode)
		System.out.println("Deleting a value "+listnode.value);
		
		
	}


	private static void atTheEndOfTheNode(LinkedList list, int i) {
		// TODO Auto-generated method stub
		
		Node n=list.head;
		
		while(null!=n.next)
		{
			n=n.next;
		}
		Node newnode=new Node(i);
		n.next=newnode;
		
		
		
		
	}


	private static void insertAfterValue4(LinkedList list, int i) {
		// TODO Auto-generated method stub
		Node n=list.head;
		while(null!=n)
		{
			if(n.value==4)
			{
				Node newnode=new Node(i);
				newnode.next=n.next;
				n.next=newnode;
				return;
			}
			n=n.next;
		}
		
	}


	private static void pushInFront(LinkedList list, Node n) {
		// TODO Auto-generated method stub
		
		n.next=list.head.next;
		list.head.next=n;
		
	}
	
	

}
