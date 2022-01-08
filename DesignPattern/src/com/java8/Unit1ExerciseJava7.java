package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseJava7 {

	public static void main(String[] args) {
		   List<Person> people=Arrays.asList(
				   new Person("abc","def",42),
				   new Person("abcr","def",42),
				   new Person("abcg","def",42)
				   
				   );
				   
				   
				   
			Collections.sort(people,new Comparator<Person>() {

				@Override
				public int compare(Person o1, Person o2) {
					// TODO Auto-generated method stub
					return o1.getLastName().compareTo(o2.getLastName());
				}
				
			});
			
			printALl(people);
			
			printPersonLastNameStartsWihC(people, new Condition() {

				@Override
				public boolean test(Person p) {
					// TODO Auto-generated method stub
					return p.getLastName().startsWith("c");
				}
				
			});

	}

	private static void printPersonLastNameStartsWihC(List<Person> people,Condition condition) {
		for(Person p: people)
		{
			if(condition.test(p)) {
			System.out.println(p);
			}
		}
	}

	private static void printALl(List<Person> people) {
		for(Person p: people)
		{
			System.out.println(p);
		}
	}

}


interface Condition{
	boolean test(Person p);
}
