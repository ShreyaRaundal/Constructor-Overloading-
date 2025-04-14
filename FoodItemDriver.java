public class FoodItemDriver {
    public static void main(String[] args) {
        FoodItem f1 = new FoodItem("Burger", 120.0);
        f1.displayFoodItem();

        FoodItem f2 = new FoodItem("Pizza", 300.0, "Domino's");
        f2.displayFoodItem();

        FoodItem f3 = new FoodItem("Paneer Wrap", 180.0, "Subway", true, 4.5);
        f3.displayFoodItem();
    }
}
