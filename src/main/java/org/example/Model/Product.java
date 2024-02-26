package org.example.Model;

public class Product {

    private String name;
    private Double price;
    private Integer quantity;



    public Product() {
        this.name = "Дефолт продукт";
        this.price = 100.0;
        this.quantity = 100;
    }


    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
