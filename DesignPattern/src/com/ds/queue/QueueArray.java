package com.ds.queue;

//front--dqueue---inserted first
//rear --enqueue---inserted last

public class QueueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue que=new Queue();
que.enqueue(10);
que.enqueue(20);
que.enqueue(30);
que.enqueue(40);
que.enqueue(50);
que.enqueue(50);
que.enqueue(50);
que.enqueue(50);
que.enqueue(50);
que.enqueue(50);
que.enqueue(50);
que.enqueue(50);

que.dequeue();
que.dequeue();
que.dequeue();
que.dequeue();
que.dequeue();
que.dequeue();
que.dequeue();
que.dequeue();
que.dequeue();
que.dequeue();
que.dequeue();




	}

}


class Queue{
	
	
	int [] arr=new int[10];
	int front=0, rear=0,capacity=arr.length;
	void enqueue(int value) {
																								
		if(rear==capacity)
		{
			System.out.println("Queue is full");
			return ;
		}
		else {
			arr[rear]=value;
			
		}
		System.out.println(""+arr[rear]);
		rear++;
	}
	
	void dequeue()
	{
		
		if(  front>=rear)
		{
			System.out.println("queue is empty");
			return ;
		}
		else {
		int	value=arr[front];
		System.out.println(""+value);
		front++;
		}
		
	}
	
}