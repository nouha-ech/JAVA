package tp;

import tp.ecommerce.Product;


public class Main {

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200.0);
        Product p2 = new Product("Smartphone", 800.0);
        Order order = new Order(101, "Nouha");
        order.addProduct(p1);
        order.addProduct(p2);

        System.out.println(order.displayOrderDetails());


      
    }
}
