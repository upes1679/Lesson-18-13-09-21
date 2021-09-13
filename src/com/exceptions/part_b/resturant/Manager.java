package com.exceptions.part_b.resturant;

import java.io.IOException;

public class Manager {

    public void checkFood(String order,Customer customer) {
            if (order=="pizza"){
                    throw new ItemOutOfStockException("No pizzas left",customer);
            }
    }
}
