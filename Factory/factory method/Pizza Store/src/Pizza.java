import java.util.ArrayList;

public abstract class Pizza {
	String name, dough, sauce;
	ArrayList toppings = new ArrayList<>();
	
	void prepare() {
		System.out.println("Preparing.. "+name);
		System.out.println("Tossing dough ");
		System.out.println("Adding sauce.. ");
		
		for(int i=0; i<toppings.size(); i++)
		System.out.println("Adding topping "+toppings.get(i));

	}
	
	void bake() {
		System.out.println("Bake for 25 mins at 350 ");

	}
	
	void cut() {
		System.out.println("Cut into diagonal pieces ");

	}
	
	void box() {
		System.out.println("Place Pizza in official Pizza Store box ");

	}
	public String getName() {
		return name;
	}

}
