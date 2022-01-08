package concurrency;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ShopperRet extends Thread
{
	static int garlicCount, potatoCOunt=0;
	static Lock pencil=new ReentrantLock();
	
	private void getGarlic()
	{
		pencil.lock();
		garlicCount++;
		pencil.unlock();
	}
	
	private void getPotatoCount()
	{
		pencil.lock();
		potatoCOunt++;
		pencil.unlock();	
	}
	
	public void run()
	{
		for(int i=0;i<100000;i++)
		{
			getGarlic();
			getPotatoCount();
		}
	}
}



public class ReentrantLockDemo  {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
        Thread barron =new ShopperRet();
        Thread olivia =new ShopperRet();
        barron.start();
        olivia.start();
        
        barron.join();
        olivia.join();
        
        System.out.println(""+ShopperRet.garlicCount);
	}

}
