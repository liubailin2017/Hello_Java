package food;

public class Lasagna extends Food {
	public String name;
	public Boolean isEatEd = false;
	@Override
	public String getName() {
		return name;
	}
	
	public Lasagna() {
		this("千层面");
	}
	
	public Lasagna(String name) {
		this.name = name;
	}


	@Override
	public void isEated() {
		this.isEatEd = true;
	}
	
	public boolean getIsEated() {
		return this.isEatEd;
	}


	
		
}
