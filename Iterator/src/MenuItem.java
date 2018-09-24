public class MenuItem {
    String name;
    String description;
    boolean isVegeterian;
    double price;

    public MenuItem(String name, String description, boolean isVegeterian, double price) {
        this.name = name;
        this.description = description;
        this.isVegeterian = isVegeterian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVegeterian() {
        return isVegeterian;
    }

    public void setVegeterian(boolean vegeterian) {
        isVegeterian = vegeterian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
