package com.exceptions.part_a;

public class Calculator {
    public void divide(int a, int b){
        if(b==0){
//            ArithmeticException e=new ArithmeticException("Divison by zero!!!");
//            throw e;
           throw new ArithmeticException("Divison by zero!!!");
        }
    }
}
