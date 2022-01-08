package com.ds.stack;

public class StackImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack st=new Stack();
   st.push(10);
   st.push(20);
   st.push(30);
   st.push(40);

   System.out.println(""+st.pop());
   System.out.println(""+st.pop());
   System.out.println(""+st.pop());
   System.out.println(""+st.pop());
   System.out.println(""+st.pop());
   
   System.out.println(""+st.isEmpty());

	}

}


class Stack{
	
	int size=100;
	int[] arr=new int[size];
	int top;
	
	public Stack()
	{
		this.top=-1;
	}
	
	
	boolean push(int value)
	{
		if(!isFull())
		{
			arr[++top]=value;
			return true;
		}
		else
		{
			return false;
		}
		
		
	}


	private boolean isFull() {
		return top==arr.length;
	}
	
	
	int pop()
	{
		int value = 0;
		if(!isEmpty())
		{
			//System.out.println(""+top);
		 value= arr[top];
		top--;
		return value;
		}
		else {
			return -1;
		}
		
		
	}
	
	boolean isEmpty()
	{
		return (top==-1);
		
	}
}













