import java.util.*;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int id, String name, int q, double p) {
        productId = id;
        productName = name;
        quantity = q;
        price = p;
    }
}

public class InventoryManagementSystem {
    static HashMap<Integer, Product> inventory = new HashMap<>();

    static void addProduct(Product p) {
        inventory.put(p.productId, p);
    }

    static void updateProduct(int id, int quantity) {
        if (inventory.containsKey(id)) {
            inventory.get(id).quantity = quantity;
        }
    }

    static void deleteProduct(int id) {
        inventory.remove(id);
    }

    public static void main(String[] args) {
        addProduct(new Product(1,"Laptop",5,50000));
        updateProduct(1,10);
        deleteProduct(1);
    }
}