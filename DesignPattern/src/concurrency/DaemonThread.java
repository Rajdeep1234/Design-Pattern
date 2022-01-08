package concurrency;
class kitchenCleaner extends Thread 
{
	public void run ()
	{
		while(true)
		{
			System.out.println("Olivia cleaned the kithen");
			try
			{
				Thread.sleep(1000);
							
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}


public class DaemonThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Thread olivia=new kitchenCleaner();
olivia.setDaemon(true);// if not set then program will keep on continue, main thread will not be able to terminate
olivia.start();
System.out.println("Barron is cooking");
Thread.sleep(500);
System.out.println("Barron is cooking");
Thread.sleep(500);

	}

}
