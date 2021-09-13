package com.exceptions.part_b.resturant;

public class Main {
    public static void main(String[] args) throws Exception {
        Customer customer=new Customer("John Smith","077-7777888");
        Waiter waiter= new Waiter();
        try{
            waiter.recieveOrder(customer, "pizza");
        }
        catch (ItemOutOfStockException e){
            System.out.println(e.getCustomerName());
            e.printStackTrace();
            System.out.println(e.getMessage()+" "+e.getCustomerName());
        }
    }
}
