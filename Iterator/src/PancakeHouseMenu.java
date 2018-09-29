import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B’s Pancake Breakfast", "Pancakes with scrambled eggs, and toast",true, 3.99);
        addItem("K&B’s Pancake Breakfast", "Pancakes with scrambled eggs, and toast",true, 3.99);
        addItem("K&B’s Pancake Breakfast", "Pancakes with scrambled eggs, and toast",true, 3.99);
        addItem("K&B’s Pancake Breakfast", "Pancakes with scrambled eggs, and toast",true, 3.99);
        addItem("K&B’s Pancake Breakfast", "Pancakes with scrambled eggs, and toast",true, 3.99);

    }

    private void addItem(String name, String descrption, boolean isVegeterian, double price) {
        MenuItem menuItem = new MenuItem(name, descrption, isVegeterian, price);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
