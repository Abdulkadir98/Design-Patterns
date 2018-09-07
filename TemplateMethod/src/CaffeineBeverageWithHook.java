public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments())
        addCondiments();
    }

    private final void boilWater() {
        System.out.println("Boiling water.");
    }

    private final void pourInCup() {
        System.out.println("Pouring beverage in cup");
    }

    abstract void brew();

    abstract void addCondiments();

    // This method is known as hook
    //It has a default implementation in the parent class.
    //This method can be overriden by the subclass but the subclass doesn't have to.
    boolean customerWantsCondiments() {
        return true;
    }
}
