public class GumballMachine {
    State hasQuarterState;
    State noQuarterState;
    State soldOutState;
    State soldState;

    State state = soldOutState;
    private int count = 0;

    public GumballMachine(int count){
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        noQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = count;
        if(count > 0){
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
       state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state){
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out of the slot...");
        if(count != 0)
            count--;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }

    public int getCount() {
        return count;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }
}
