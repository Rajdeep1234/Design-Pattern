package concurrency;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Shopper extends Thread {
	//static int garliccount=0;
	static AtomicInteger ai=new AtomicInteger(0);
	static  Lock pencil=new ReentrantLock();
	public void run()
	{
		
		for(int i=0;i<1000000;i++)
		{
			pencil.lock();
			ai.getAndIncrement();
			pencil.unlock();
			System.out.println(""+Thread.currentThread().getName()+"is thinking");
			
			try
			{
				Thread.sleep(500);
				
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
}
public class DataRaceDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Shopper s1=new Shopper();
Shopper s2 =new Shopper();
		
		s1.start();
		s2.start();
		
		s1.join();
		s2.join();
		
		
	//	System.out.println(" count "+TryLockDemo.ai);
		
	}

}
