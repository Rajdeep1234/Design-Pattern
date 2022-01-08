package com.java8;

public class RunnableExample {

	public static void main(String[] args) {
Thread mythread=new Thread(new Runnable() {

	@Override
	public void run() {
   System.out.println("Hello World ");		
	}
	
});

mythread.run();


Thread mylambdathread=new Thread(()->System.out.println("Printed lambda runnable"));
mylambdathread.run();
	}

}
