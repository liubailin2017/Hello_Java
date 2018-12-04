
import animals.Animal;
import animals.impl.Cat;
public class Driver {
	
	public static void act(Animal animal) {
		animal.eat();
	}
	public static void act(Cat animal) {
		animal.makeNoiser();
	}

	public static void main(String [] args) {
		Garfield grfield = new Garfield();
		act(grfield);
	
	}
}