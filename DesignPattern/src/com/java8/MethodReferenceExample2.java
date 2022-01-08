package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
	public static void main(String[] args) {
	   List<Person> people=Arrays.asList(
			   new Person("abc","def",42),
			   new Person("abcr","def",42),
			   new Person("abcg","def",42)
			   
			   );
			   
		
		
		
		
		//printALl(people);
		
		printPersonCOnditionally(people,p->true, System.out::println);//p->method(p)
		

}

private static void printPersonCOnditionally(List<Person> people,Predicate <Person> condition, Consumer<Person> consumer) { //Predicate is ootb FI
	for(Person p: people)
	{
		if(condition.test(p)) {
			consumer.accept(p);
		}
	}
}



}
