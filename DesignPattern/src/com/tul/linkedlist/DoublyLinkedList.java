package com.tul.linkedlist;


public class DoublyLinkedList {


	Node head;
	
	static class Node
	{
		int val;
		Node next;
		Node prev;
		Node(int val)
		{
			this.val=val;
		}
	}
	 
	 public Node push(int i,Node head) {
		 Node n=new Node(i);
		 n.next=head;
		 n.prev=null;
		 if(null!=head) head.prev=n;
		 head=n;
		 return head;
		 
	}
	 
	 public void delete (Node head,int val )
	 {
		 Node current=head;
		 
		 while(null!= current)
		 {
			 if(current.val==val)
			 {
				Node n_1=current.prev;
				Node n=current.next;
				n_1.next=n;
				n.prev=n_1;
			 }
			
			 current=current.next;
		 }
	 }
	 
	 public void printValues(Node head)
	 {
		 while(null != head)
		 {
			 System.out.println("value "+head.val);
			 head=head.next;
		 }
	 }
		
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList list=new DoublyLinkedList();
		list.head=new Node(1);
		Node n =list.head;
		n=list.push(3, n);
		n=list.push(4, n);
		n=list.push(5, n);
		n=list.push(6, n);
		list.printValues(n);
		
		list.delete(n, 4);
		list.printValues(n);

	}

}

