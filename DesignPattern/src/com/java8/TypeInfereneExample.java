package com.java8;

public class TypeInfereneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	StringGetLength mylambda=(String s)->s.length();
	
	//	StringGetLength mylambda=( s)->s.length();

		StringGetLength mylambda= s->s.length();
		
		
		
	}
	public static void printLmbda(StringGetLength l) {
		System.out.println(l.getLength("Hello World"));
	}
	
	interface StringGetLength{
		int getLength(String s) ;
	}
}
