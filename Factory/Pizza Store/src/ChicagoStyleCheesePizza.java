
public class ChicagoStyleCheesePizza extends Pizza {
	
	public ChicagoStyleCheesePizza() {
		name = "Chicago Style deep dish cheese pizza";
		dough = "Thick crust dough";
		sauce = "Plum Tomato sauce";
		
		toppings.add("Shredded mozzarella cheese");
	}
	
	void cut() {
		System.out.println("Cutting in square pieces");
	}

}
