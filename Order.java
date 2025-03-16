public class Order {
    public static void main(String[] args) {
        Furniture chair = new Chair(10, 50);
        Furniture table = new Table(15.0, 15.0);
        Furniture cabinet = new Cabinet(25.0, 50.0);

        ShippingCalculator calculator = new FurnitureShipping();

        System.out.println("Chair Shipping Cost: $" + chair.accept(calculator));
        System.out.println("Table Shipping Cost: $" + table.accept(calculator));
        System.out.println("Cabinet Shipping Cost: $" + cabinet.accept(calculator));
    }
}