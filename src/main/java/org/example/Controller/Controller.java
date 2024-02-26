package org.example.Controller;

import org.example.Model.Product;
import org.example.Model.Stock;
import org.example.View.StokView;

public class Controller {

    private Stock service;

    private StokView view;


    public Controller() {
        service = new Stock();
        view = new StokView();

    }

    public void run (){

        Stock stock = new Stock();
        view.print(stock);

        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();

        System.out.println("product1 = " + product1);
        System.out.println("product1 = " + product2);
        System.out.println("product1 = " + product3);

        stock.addProduct(product1);
        stock.addProduct(product2);
        stock.addProduct(product3);

        System.out.println("---------------------------");

        stock.decreaseQuantity(product2,100);
        stock.increaseQuantity(product3,100);
        view.print(stock);

        System.out.println("---------------------------");

        stock.BuyOrder(product2,120);
        stock.BuyOrder(product3,120);
        view.print(stock);



    }
}
