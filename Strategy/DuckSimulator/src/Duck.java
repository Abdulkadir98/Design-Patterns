
public abstract class Duck {
	
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	public abstract void display();
	
	public void performQuack( ) {
		quackBehaviour.quack();
	}
	public void performFly() {
		flyBehaviour.fly();
	}
	public void setFlyingBehaviour(FlyBehaviour fb) {
		flyBehaviour = fb;
	}
	public void setQuackingBehaviour(QuackBehaviour qb) {
		quackBehaviour = qb;
	}

}
