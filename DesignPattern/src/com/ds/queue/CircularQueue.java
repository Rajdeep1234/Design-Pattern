package com.ds.queue;

public class CircularQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CirQueue que=new CirQueue();
		que.enqueue(10);
		que.enqueue(10);
		que.enqueue(10);
		que.enqueue(10);
		que.enqueue(10);
		que.enqueue(10);
		que.enqueue(10);
		que.enqueue(10);
		que.enqueue(10);
		que.enqueue(10);
		que.enqueue(10);
		
		que.dqueue();
		que.dqueue();
		que.dqueue();
		que.dqueue();
		que.dqueue();
		que.dqueue();
		que.dqueue();
		que.dqueue();
		que.dqueue();
		que.dqueue();
		que.dqueue();
		
		
	}

}
class  CirQueue{
	
	int front=-1,rear=-1;
	int[] arr=new int[10];
	int capacity=arr.length;
	
	void enqueue(int value)
	{
		if(front==-1 && rear==-1)
		{
			front=0;
			rear=0;
			arr[rear]=value;
			System.out.println(""+arr[rear]);
		}
		
		if(front==(rear+1)%capacity) {
			System.out.println("queue is full");
			return;
		}
		else {
			rear=(rear+1)%capacity;
			arr[rear]=value;
			System.out.println(""+arr[rear]);
		}
		
	}
	
	
	void dqueue() {
		
		if((front==-1) && (rear==-1))
		{
			System.out.println("Queue is empty");
		}
		else if(front==rear){
			System.out.println("element id"+arr[front]);
			front=-1;
			rear=-1;
		}
		else {
			System.out.println("element is "+arr[front]);
			front=(front+1)%capacity; 
		}
		
		
		
	}
}