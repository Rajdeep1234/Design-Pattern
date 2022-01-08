package com.ds.stack;

import com.ds.stack.StackAsLinkedList.StackNode;

public class StackLsImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackAsLinkedList node=new StackAsLinkedList();
		
		System.out.println(""+node.pop());
		node.push(10);
		node.push(20);
		node.push(30);
		node.push(40);
		System.out.println(""+node.pop());
		System.out.println(""+node.pop());
		System.out.println(""+node.pop());
		System.out.println(""+node.pop());
		System.out.println(""+node.pop());
		
	}

}


class StackAsLinkedList {
	
	StackNode head;
	class StackNode
	{
		int value;
		StackNode next;
		StackNode(int value)
		{
			this.value=value;
			this.next=null;
		}
		
	}
	
	
	void push(int value)
	{
		
		if(head==null)
		{
          head=new StackNode(value);
		}
		else
		{
		StackNode node=new StackNode(value);
		node.next=head;
		head=node;
		}
		
		System.out.println(" "+head.value);
	}
	
	int pop()
	{
		int value;
	
		if(null!=head)
		{		
		value= head.value;
		head=head.next;
		return value;
		}
		return -1;
		
	}
	
	
}