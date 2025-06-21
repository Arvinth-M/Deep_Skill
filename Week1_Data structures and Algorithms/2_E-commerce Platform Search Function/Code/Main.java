public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(203, "Headphones", "Electronics"),
            new Product(302, "Shoes", "Fashion"),
            new Product(150, "Keyboard", "Electronics"),
            new Product(410, "Watch", "Accessories")
        };

        int searchId = 302;

        System.out.println("=== Linear Search ===");
        Product resultLinear = LinearSearch.searchById(products, searchId);
        System.out.println(resultLinear != null ? resultLinear : "Product not found");

        System.out.println("\n=== Binary Search ===");
        Product resultBinary = BinarySearch.searchById(products, searchId);
        System.out.println(resultBinary != null ? resultBinary : "Product not found");
    }
}
