import animals.Animal;
import food.Food;

public class Garfield extends Animal {
	
	public void winterSleep() {
		System.out.println("加菲猫睡觉了,明天春天见.");
	}
	
	public void eat(Food f) {
		if(f.getIsEated()) {
			System.out.println("加菲猫 不吃被吃过的食物");
		}else {
			System.out.println("加菲猫 爱吃"+f.getName());
			f.isEated();
		}
	}
}
