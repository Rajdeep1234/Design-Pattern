package com.java8;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people=Arrays.asList(
				   new Person("abc","def",42),
				   new Person("abcr","def",42),
				   new Person("abcg","def",42)
				   
				   );
		//external iterator--you are controlling the iteration
		for(int i=0;i<people.size();i++) {
			System.out.println(people.get(i));
		}
		
		for(Person p:people) {
			System.out.println(p);
		}

		//internal iteration
		people.forEach(p->System.out.println(p));
		
		people.forEach(System.out::println);//no necessarily sequential, parallel processing possible
		
	}

}


