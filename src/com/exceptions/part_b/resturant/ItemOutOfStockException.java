package com.exceptions.part_b.resturant;

public class ItemOutOfStockException extends RuntimeException{
    private Customer customer;

    public ItemOutOfStockException() {
        customer=new Customer("Anonymous","None");
    }

    public ItemOutOfStockException(String message) {
        super(message);
        customer=new Customer("Anonymous","None");
    }

    public ItemOutOfStockException(String message,Customer customer) {
        super(message);
        this.customer=customer;
    }

    public String getCustomerName(){
        return customer.getName();
    }
}
