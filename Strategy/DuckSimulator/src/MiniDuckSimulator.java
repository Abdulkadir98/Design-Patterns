
public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MallardDuck duck = new MallardDuck();
		duck.performQuack();
		duck.performFly();
		
		ModelDuck md = new ModelDuck();
		md.performFly();
		md.setFlyingBehaviour(new FlyRocketPowered());
		md.performFly();
		

	}

}
