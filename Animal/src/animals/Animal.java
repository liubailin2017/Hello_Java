package animals;

import food.Food;

public class Animal {
	
	public void eat(Food f) {
		System.out.println("animal Eat "+f.getName());
		f.isEated();
	}
	
}
