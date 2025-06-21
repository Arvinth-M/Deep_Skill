import java.util.*;

public class BinarySearch {
    public static Product searchById(Product[] products, int targetId) {
        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midId = products[mid].getProductId();

            if (midId == targetId) {
                return products[mid];
            } else if (midId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}
