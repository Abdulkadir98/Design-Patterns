
public class PizzaTestDrive {

	public static void main(String[] args) {
		
		Pizza pizza;
		PizzaStore nyPizzaStore = new NYPizzaStore();
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		
		pizza = nyPizzaStore.orderPizza("cheese");
		System.out.println("Ethan ordered a "+ pizza.getName());
		
		pizza = chicagoPizzaStore.orderPizza("cheese");
		System.out.println("Frank ordered a "+ pizza.getName());

	}

}
