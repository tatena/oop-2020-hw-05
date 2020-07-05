package store;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public List<Product> getItems() {
        return items;
    }

    public void addItem(Product p) {
        int index = items.indexOf(p);
        if (index == -1) {
            items.add(p);
            return;
        }
        Product old  = items.get(index);
        old.setQuantity(old.getQuantity() + 1);
    }

    public void updateQuantity(Product product, int val) {
        if (val == 0) {
            items.remove(product);
        } else {
            int index = items.indexOf(product);
            Product old  = items.get(index);
            old.setQuantity(val);
        }
    }

    public double getPrice() {
        double price = 0;
        for (Product p : items) {
            price += (p.getPrice() * p.getQuantity());
        }
        return price;
    }
}
