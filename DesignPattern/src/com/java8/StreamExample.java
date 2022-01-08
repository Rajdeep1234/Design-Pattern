package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		List<Person> people=Arrays.asList(
				   new Person("abc","def",42),
				   new Person("abcr","def",42),
				   new Person("abcg","def",42)
				   
				   );
		
		people.stream().filter(p->p.getLastName().startsWith("d")).forEach(p->System.out.println(p.getFirstName()));
		
		
		Stream<Person> stream=people.stream();
		
	long count=	people.stream().filter(p->p.getFirstName().startsWith("a")).count();
	
	people.parallelStream().filter(p->p.getFirstName().startsWith("a")).count();
	
	System.out.println(count);
	}

}
