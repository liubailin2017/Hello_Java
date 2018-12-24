
import animals.Animal;
import animals.impl.Cat;
import food.Food;
import food.Lasagna;

public class Driver {
	
	
	public static Food f = new Lasagna();
	
	public static void act(Animal animal) {
		animal.eat(f);
	}
	
	public static void act(Cat animal) {
		animal.makeNoiser();
	}

	public static void main(String [] args) {
		Garfield grfield = new Garfield();
		act(grfield);
		act(grfield);
	
	}
}
