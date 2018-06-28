
public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehaviour = new FlyNoWings();
		quackBehaviour = new Quack();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a model Duck.");
	}

}
