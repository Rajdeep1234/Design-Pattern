package concurrency;
class ChefOlivia extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		System.out.println("Olivia is done cutting sausage");
	}
}


public class ThreadLifeCycleDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Barron started & requesting oilivia's help");
		
		Thread olivia =new ChefOlivia();
		 System.out.println(" Olivia state "+ olivia.getState());
		System.out.println("Barron tells olivia to start");
         olivia.start();
         System.out.println(" Olivia state "+ olivia.getState());
         
         
         System.out.println("Barron continues cooking soup");
         Thread.sleep(500);
         
         System.out.println(" Olivia state "+ olivia.getState());
         System.out.println("Barren patiently waiting for olivia to finish and join");
         
         olivia.join(); //main thread will wait untill olivia thread terminates
         System.out.println(" Olivia state "+ olivia.getState());
         
         System.out.println("Barron and olivia are both done");
         
        
         
	}

}
