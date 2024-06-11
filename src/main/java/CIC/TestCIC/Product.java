package CIC.TestCIC;

import java.math.BigDecimal;

public class Product {
    private String id;
    private String description;
    private BigDecimal price;

    public Product(String id, String description, BigDecimal price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
