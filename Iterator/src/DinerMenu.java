import java.util.Iterator;

public class DinerMenu implements Menu{

    static final int MAX_ITEMS = 5;
    int numberOfItems = 0;

    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("Vegetarian BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("Vegetarian BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("Vegetarian BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("Vegetarian BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99);
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

    private void addItem(String name, String description, boolean isVegeterian, double price) {
        MenuItem menuItem = new MenuItem(name, description, isVegeterian, price);

        if(numberOfItems >= MAX_ITEMS)
            System.out.println("Sorry! Array is full");
        else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }
}
