import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product product) {
        if (products.containsKey(product.getProductId())) {
            throw new IllegalArgumentException("Product with this ID already exists.");
        }
        products.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, String productName, Integer quantity, Double price) {
        Product product = products.get(productId);
        if (product == null) {
            throw new IllegalArgumentException("Product not found.");
        }
        if (productName != null)
            product.setProductName(productName);
        if (quantity != null)
            product.setQuantity(quantity);
        if (price != null)
            product.setPrice(price);
    }

    public void deleteProduct(String productId) {
        if (!products.containsKey(productId)) {
            throw new IllegalArgumentException("Product not found.");
        }
        products.remove(productId);
    }

    public Product getProduct(String productId) {
        return products.get(productId);
    }
}
