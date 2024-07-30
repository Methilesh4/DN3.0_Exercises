public class InventoryManagementSystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Adding products
        Product product1 = new Product("001", "Laptop", 10, 999.99);
        Product product2 = new Product("002", "Smartphone", 50, 499.99);

        inventory.addProduct(product1);
        inventory.addProduct(product2);

        // Updating a product
        inventory.updateProduct("001", "Laptop Pro", 8, 1099.99);

        // Getting and displaying a product
        Product product = inventory.getProduct("001");
        System.out.println(product);

        // Deleting a product
        inventory.deleteProduct("002");
    }
}
