public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine){
       this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("Sorry there are no gumballs!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You have to enter a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sorry there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("Sorry there are no gumballs");

    }
}
