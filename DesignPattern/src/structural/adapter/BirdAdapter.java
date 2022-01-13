package structural.adapter;

public class BirdAdapter implements Duck {

	private Bird bird;
	
	public BirdAdapter(Bird bird) {
		this.bird=bird;
	};
	@Override
	public void squeak() {
        bird.makeSound();		
	}

	

}
