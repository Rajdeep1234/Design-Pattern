package concurrency;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ShopperLock extends Thread {
	static int garliccount=0;
	private synchronized static int getnumber() //without static it will not work, threads will invoke their own version of getnumber
	{
		return garliccount++;
	};
	public void run()
	{
		
		for(int i=0;i<1000000;i++)
		{
			synchronized(ShopperLock.class)//synchronized static method or this one
			{
			getnumber();
			}
		}
		
	}
	
}
public class DataRaceDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ShopperLock s1=new ShopperLock();
		ShopperLock s2 =new ShopperLock();
		
		s1.start();
		s2.start();
		
		s1.join();
		s2.join();
		
		
		System.out.println(" count "+ShopperLock.garliccount);
		
	}

}
