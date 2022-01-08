package com.java8;

public class MethodReferenceExample {

//	public static void main(String[] args) {
//       Thread t =new Thread(()->printMessage());
//       t.start();
//	}

	
	public static void main(String[] args) {
	       Thread t =new Thread(MethodReferenceExample::printMessage);
	       t.start();
		}
	
	
	private static void printMessage() {
		System.out.println("H W");
	}

}
