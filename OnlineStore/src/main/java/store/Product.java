package store;

public class Product {

    private final String id;
    private final String img;
    private final double price;
    private final String name;
    private int quantity;

    public Product(String id, String name, String img, double price) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
        this.quantity = 1;
    }

    public String getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        Product p = (Product)obj;
        return p.getId().equals(this.id);
    }
}
