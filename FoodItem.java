public class FoodItem {
    String name;
    double price;
    String restaurantName;
    boolean isVeg;
    double rating;

    // Constructor 1: name and price
    FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Constructor 2: name, price, and restaurantName
    FoodItem(String name, double price, String restaurantName) {
        this.name = name;
        this.price = price;
        this.restaurantName = restaurantName;
    }

    // Constructor 3: all attributes
    FoodItem(String name, double price, String restaurantName, boolean isVeg, double rating) {
        this.name = name;
        this.price = price;
        this.restaurantName = restaurantName;
        this.isVeg = isVeg;
        this.rating = rating;
    }

    public void displayFoodItem() {
        System.out.println("Item: " + name);
        System.out.println("Price: " + price);
        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Veg: " + isVeg);
        System.out.println("Rating: " + rating);
        System.out.println("---------------------------");
    }
}
