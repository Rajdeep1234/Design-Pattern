package structural.adapter;

public class Main {

	public static void main(String[] args) {
Sparrow sparrow =new Sparrow(); //bird is adaptee
Duck duck=new PlasticToyDuck(); //duck is target

Duck birdAdapter=new BirdAdapter(sparrow);

birdAdapter.squeak();

	}

}
