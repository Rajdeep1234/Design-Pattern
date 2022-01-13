package structural.adapter;

public class Sparrow implements Bird {

	@Override
	public void canFly() {
System.out.println("Fly");		
	}

	@Override
	public void makeSound() {
System.out.println("Chirp chirp");		
	}

}
