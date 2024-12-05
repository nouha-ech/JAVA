package tp.ecommerce;
import java.util.ArrayList;
import java.util.List;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String displayDetails() {
        return name + " ($" + price + ")";
    }



    public void addProduct(Product product) {
        Object products;
		products.add(product);
    }

    public String displayOrderDetails() {
        StringBuilder details = new StringBuilder("Order #" + orderId + " for " + customerName + "\nProducts:\n");
        Product[] products;
		for (Product product : products) {
            details.append("- ").append(product.displayDetails()).append("\n");
        }
        return details.toString();
    }
}

