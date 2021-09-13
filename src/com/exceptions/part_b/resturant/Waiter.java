package com.exceptions.part_b.resturant;

public class Waiter {
    private Chef chef;

    public Waiter() {
        this.chef = new Chef();
    }

    public void recieveOrder(Customer customer, String order) throws ItemOutOfStockException {
            chef.prepareFood(order, customer);
    }
}
