package com.java8;

public class Greeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter greet=new Greeter();
		HellowWorldGreetings greeting=new HellowWorldGreetings();
            greet.greet(greeting);

            Greeting   myLambdaFunction=()-> System.out.println("hw"); 
            
           //takes no arg , returns nothing
            MyAdd myaddlambdaFUncion=(int a, int b)-> a+b;
            
          greeting.perform();//new class , implemented the interface
          myLambdaFunction.perform();//lambda is a implementation of the interface
          
          Greeting innerClass=new Greeting () {
        	  public void perform()
        	  {
        		  System.out.println("HW");
        	  }
          };//annonymous inner class
          
          innerClass.perform();//annonymous inner class
          
          
          //lambda and annonymous inner class is different
          
          
          greet.greet(myLambdaFunction);
          greet.greet(innerClass);
          
	}
public void greet(Greeting greet) {  //passing a behaviour
  greet.perform();
}
}

interface Mylambda{
	void foo();// exactly same sig as the lambda funtion
	
}

interface MyAdd{
	int add(int a , int b);
}

///polymorphism in action 