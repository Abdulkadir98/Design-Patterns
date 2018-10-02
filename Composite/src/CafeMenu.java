import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu extends Menu {
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        super("Cafe Menu", "Dinner");
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99);
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99);
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99);
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99);
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99);
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99);
    }

    private void addItem(String name, String description, boolean isVeg, double price) {
        MenuItem menuItem = new MenuItem(name, description, isVeg, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

}
