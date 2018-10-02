public class MenuTestDrive {
    public static void main(String[] args) {

        MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu", "Breakfast");
        MenuComponent dinerMenu = new Menu("Diner Menu", "Lunch");
        MenuComponent cafeMenu = new Menu("Cafe Menu", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Desserts!");

        MenuComponent allMenus = new Menu("All Menus", "All menus combined!");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Pasta", "Sphagetti with marnara sauce", true, 3.9));
        dinerMenu.add(new MenuItem("Pasta", "Sphagetti with marnara sauce", true, 3.9));
        dinerMenu.add(new MenuItem("Pasta", "Sphagetti with marnara sauce", true, 3.9));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with flaky crust", true, 1.59));

        pancakeHouseMenu.add(new MenuItem("Pasta", "Pasta and Ravioli", true, 2.55));
        pancakeHouseMenu.add(new MenuItem("Pasta", "Pasta and Ravioli", true, 2.55));
        pancakeHouseMenu.add(new MenuItem("Pasta", "Pasta and Ravioli", true, 2.55));

        cafeMenu.add(new MenuItem("Chicken Biriyani", "An Indain rice dish", false, 10));
        cafeMenu.add(new MenuItem("Chicken Biriyani", "An Indain rice dish", false, 10));
        cafeMenu.add(new MenuItem("Chicken Biriyani", "An Indain rice dish", false, 10));


        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
