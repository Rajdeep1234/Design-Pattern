package com.java8;

import java.util.function.BiConsumer;

public class ExceptionLambda2 {

	public static void main(String[] args) {
int[] numbers= {1,2,3,4,5};

int key=2;

process(numbers,key,wrapperLambda((v,k)->	System.out.println(v+k)));
		
	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biconsumer) {
		// TODO Auto-generated method stub
		return (k,v)-> {
			try {
			biconsumer.accept(k, v);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		};
	}

	private static void process(int[] numbers, int key, BiConsumer<Integer,Integer> bifuns) {
		for(int t:numbers)
		bifuns.accept(t, key);
	}

}
