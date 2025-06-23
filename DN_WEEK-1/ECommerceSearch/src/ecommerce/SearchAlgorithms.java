package ecommerce;

import java.util.Arrays;
import java.util.Comparator;

public class SearchAlgorithms {

    // Linear Search
    public static Product linearSearch(Product[] products, String searchKey, String attribute) {
        for (Product product : products) {
            switch (attribute) {
                case "productId":
                    if (product.getProductId().equals(searchKey)) {
                        return product;
                    }
                    break;
                case "productName":
                    if (product.getProductName().equals(searchKey)) {
                        return product;
                    }
                    break;
                case "category":
                    if (product.getCategory().equals(searchKey)) {
                        return product;
                    }
                    break;
            }
        }
        return null; // Product not found
    }

    // Binary Search (requires sorted array)
    public static Product binarySearch(Product[] products, String searchKey, String attribute) {
        // Ensure the array is sorted by the specified attribute for binary search
        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                switch (attribute) {
                    case "productId":
                        return p1.getProductId().compareTo(p2.getProductId());
                    case "productName":
                        return p1.getProductName().compareTo(p2.getProductName());
                    case "category":
                        return p1.getCategory().compareTo(p2.getCategory());
                    default:
                        throw new IllegalArgumentException("Invalid attribute for sorting");
                }
            }
        });

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            Product midProduct = products[mid];
            int comparisonResult = 0;

            switch (attribute) {
                case "productId":
                    comparisonResult = searchKey.compareTo(midProduct.getProductId());
                    break;
                case "productName":
                    comparisonResult = searchKey.compareTo(midProduct.getProductName());
                    break;
                case "category":
                    comparisonResult = searchKey.compareTo(midProduct.getCategory());
                    break;
            }

            if (comparisonResult == 0) {
                return midProduct; // Found
            } else if (comparisonResult < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null; // Product not found
    }
}

