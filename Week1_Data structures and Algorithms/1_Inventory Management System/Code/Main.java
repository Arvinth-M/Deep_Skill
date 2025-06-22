public class Main {
    public static void main(String[] args) {
        InventorySystem inventory = new InventorySystem();

        Product p1 = new Product(1, "Laptop", 50, 1200.99);
        Product p2 = new Product(2, "Monitor", 70, 299.99);
        Product p3 = new Product(3, "Keyboard", 100, 49.99);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        inventory.displayInventory();

        inventory.updateProduct(2, "Monitor - 27 inch", 60, 279.99);
        inventory.deleteProduct(3);

        System.out.println("\nAfter update and delete:");
        inventory.displayInventory();
    }
}
