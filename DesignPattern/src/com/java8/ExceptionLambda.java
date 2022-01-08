package com.java8;

import java.util.function.BiConsumer;

public class ExceptionLambda {

	public static void main(String[] args) {
int[] numbers= {1,2,3,4,5};

int key=2;

process(numbers,key,(v,k)->{
		try 
		{
		System.out.println(v+k);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			});
	}

	private static void process(int[] numbers, int key, BiConsumer<Integer,Integer> bifuns) {
		for(int t:numbers)
		bifuns.accept(t, key);
	}

}
