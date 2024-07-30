public class EcommerceSearch {

    public static void main(String[] args) {
        Product[] products = {
                new Product("001", "Laptop", "Electronics"),
                new Product("002", "Smartphone", "Electronics"),
                new Product("003", "Tablet", "Electronics"),
                new Product("004", "Headphones", "Accessories"),
                new Product("005", "Charger", "Accessories")
        };

        // Linear Search
        String targetName = "Tablet";
        Product result = SearchAlgorithms.linearSearch(products, targetName);
        System.out.println("Linear Search Result: " + (result != null ? result : "Product not found"));

        // Binary Search
        targetName = "Charger";
        result = SearchAlgorithms.binarySearch(products, targetName);
        System.out.println("Binary Search Result: " + (result != null ? result : "Product not found"));
    }
}
