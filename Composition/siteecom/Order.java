package tp;

import java.util.ArrayList;
import java.util.List;

import tp.ecommerce.Product;

public class Order {
    int orderId;
    String customerName;
    List<Product> products;

   
    public Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.products = new ArrayList<>();
    }


	public void addProduct(Product product) {
        products.add(product);
    }

    public String displayOrderDetails() {
        StringBuilder details = new StringBuilder("Order #" + orderId + " for " + customerName + "\nProducts:\n");
        for (Product product : products) {
            details.append("- ").append(product.displayDetails()).append("\n");
        }
        return details.toString();
    }
}

