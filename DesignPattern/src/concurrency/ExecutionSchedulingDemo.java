package concurrency;
class VegetableChopper extends Thread{
	
	public int vegetable_count=0;
	public static boolean chopping=true;
	
	public VegetableChopper(String name)
	{
		this.setName(name);
	}
	
	public void run() {
		while (chopping)
		{
			System.out.println(this.getName()+" chopped a vegetable");
			vegetable_count++;
		}
	}
}



public class ExecutionSchedulingDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		VegetableChopper barron=new VegetableChopper("barron");
		
		VegetableChopper olivia=new VegetableChopper("olivia");
		
		barron.start();
		olivia.start();
		
		Thread.sleep(1000); //continue chopping for 1 sec
		VegetableChopper.chopping=false;// stop hopping
		
		
		barron.join();
		olivia.join();
		
		System.out.println(" "+barron.vegetable_count);
		System.out.println(" "+olivia.vegetable_count);
		
		// it doesn't maintain any order or sequence
		

	}

}
