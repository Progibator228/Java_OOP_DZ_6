package org.example.View;

import org.example.Model.Product;
import org.example.Model.Stock;

public class StokView {

    public void print (Stock stock){
        for (Product product : stock.stock) {
            System.out.println("product = " + product);
        }
    }
}
