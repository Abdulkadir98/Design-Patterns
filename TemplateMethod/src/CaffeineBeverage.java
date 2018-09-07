public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
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
}
