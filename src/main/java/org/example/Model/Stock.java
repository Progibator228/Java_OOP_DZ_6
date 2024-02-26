package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class Stock implements ManagementAddRemove , ManagmentQuantity , Buy{

    public List<Product> stock;

    public Stock() {
        this.stock = new ArrayList<>();
    }

    public List<Product> getStock() {
        return stock;
    }



    @Override
    public void BuyOrder(Product product, Integer value) {
        if ( product.getQuantity() >= value){
            product.setQuantity(product.getQuantity()-value);
            System.out.println("Товар заказан");
        }
        else {
            System.out.println("Такого количества товара нет складе");
        }
    }

    @Override
    public void increaseQuantity(Product product, Integer value) {
        product.setQuantity(product.getQuantity() + value);
    }

    @Override
    public void decreaseQuantity(Product product, Integer value) {
        product.setQuantity(product.getQuantity() - value);
    }



    @Override
    public void addProduct(Product product) {
        stock.add(product);
    }

    @Override
    public void RemoveProduct(Product product) {
        stock.remove(product);
    }
}
