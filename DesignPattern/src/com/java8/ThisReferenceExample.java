package com.java8;

public class ThisReferenceExample {

	public void doProcess(int i, Process p) {
		p.process(i);
	}
//	public static void main(String[] args) {
//		ThisReferenceExample example=new ThisReferenceExample();
//		example.doProcess(10, new Process() {
//
//			@Override
//			public void process(int i) {
//           System.out.println(i);	
//           System.out.println(this);	
//			}
//			
//			public String toString() {
//				return "This is anonymous inner class";
//				
//			}
//			
//		});
//
//	}
	public void execute()
	{
		doProcess(10, i-> {
	           System.out.println(i);	
	           System.out.println(this);	//lambda treats this differently than anonymous inner class
				}
				
				
				
			);
		
	}
	
	public static void main(String[] args) {
		ThisReferenceExample example=new ThisReferenceExample();
		example.doProcess(10, i-> {
           System.out.println(i);	
          // System.out.println(this);	//lambda treats this differently than anonymous inner class
			}
			
			
			
		);
example.execute(); //
	}
public String toString() {
	return "this is ThisReferenceExample class instance";  
}
}

