package com.java8;

public class ClosureExample {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		doProcess(a, (i) -> System.out.println(i+b));	//lambda expression freezes the value of b			
			
                                                         //b  is effectively final
	}                                                    // you are not  allowed to change the value

	private static void doProcess(int i, Process p) {
		p.process(i);
	}

}

interface Process{
	void process(int i);
}