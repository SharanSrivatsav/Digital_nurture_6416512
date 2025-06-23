package ecommerce;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Generate a large number of products for testing
        int numProducts = 10000;
        Product[] products = generateProducts(numProducts);

        // --- Linear Search Testing ---
        System.out.println("\n--- Linear Search Testing ---");
        String searchProductIdLinear = products[numProducts / 2].getProductId(); // Search for a product in the middle
        long startTimeLinear = System.nanoTime();
        Product foundProductLinear = SearchAlgorithms.linearSearch(products, searchProductIdLinear, "productId");
        long endTimeLinear = System.nanoTime();
        System.out.println("Linear Search Time: " + (endTimeLinear - startTimeLinear) + " ns");
        System.out.println("Product Found (Linear): " + (foundProductLinear != null ? foundProductLinear.getProductName() : "Not Found"));

        String nonExistentProductIdLinear = "NONEXISTENT";
        startTimeLinear = System.nanoTime();
        foundProductLinear = SearchAlgorithms.linearSearch(products, nonExistentProductIdLinear, "productId");
        endTimeLinear = System.nanoTime();
        System.out.println("Linear Search (Non-existent) Time: " + (endTimeLinear - startTimeLinear) + " ns");
        System.out.println("Product Found (Linear): " + (foundProductLinear != null ? foundProductLinear.getProductName() : "Not Found"));

        // --- Binary Search Testing ---
        System.out.println("\n--- Binary Search Testing ---");
        // Binary search requires a sorted array. We sort by productId for this test.
        Product[] sortedProducts = Arrays.copyOf(products, products.length);
        Arrays.sort(sortedProducts, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));

        String searchProductIdBinary = sortedProducts[numProducts / 2].getProductId(); // Search for a product in the middle
        long startTimeBinary = System.nanoTime();
        Product foundProductBinary = SearchAlgorithms.binarySearch(sortedProducts, searchProductIdBinary, "productId");
        long endTimeBinary = System.nanoTime();
        System.out.println("Binary Search Time: " + (endTimeBinary - startTimeBinary) + " ns");
        System.out.println("Product Found (Binary): " + (foundProductBinary != null ? foundProductBinary.getProductName() : "Not Found"));

        String nonExistentProductIdBinary = "NONEXISTENT";
        startTimeBinary = System.nanoTime();
        foundProductBinary = SearchAlgorithms.binarySearch(sortedProducts, nonExistentProductIdBinary, "productId");
        endTimeBinary = System.nanoTime();
        System.out.println("Binary Search (Non-existent) Time: " + (endTimeBinary - startTimeBinary) + " ns");
        System.out.println("Product Found (Binary): " + (foundProductBinary != null ? foundProductBinary.getProductName() : "Not Found"));
    }

    private static Product[] generateProducts(int count) {
        Product[] products = new Product[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            String productId = String.format("P%05d", i);
            String productName = "Product_" + i;
            String category = "Category_" + random.nextInt(10);
            products[i] = new Product(productId, productName, category);
        }
        return products;
    }
}

