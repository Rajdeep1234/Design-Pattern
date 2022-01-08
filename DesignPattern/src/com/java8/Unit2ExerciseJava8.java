package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit2ExerciseJava8 {

	public static void main(String[] args) {

			   List<Person> people=Arrays.asList(
					   new Person("abc","def",42),
					   new Person("abcr","def",42),
					   new Person("abcg","def",42)
					   
					   );
					   
					   //sort
					   
		/*
		 * Collections.sort(people,new Comparator<Person>() {
		 * 
		 * @Override public int compare(Person o1, Person o2) { // TODO Auto-generated
		 * method stub return o1.getLastName().compareTo(o2.getLastName()); }
		 * 
		 * });
		 */
				
				Collections.sort(people, ( p1, p2)->p1.getLastName().compareTo(p2.getLastName()));
				
				//print
				
				//printALl(people);
				
				printPersonCOnditionally(people,p->true, p->System.out.println(p));
				
				//last name starts with c
				printPersonCOnditionally(people,p->p.getFirstName().startsWith("c"), p->System.out.println(p));

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
	
	
	


