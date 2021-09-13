package com.exceptions.part_a;

import com.sun.jdi.InconsistentDebugInfoException;

public class Main {

    public static void main(String[] args) {
//        System.out.println(divideWithTryCatch(10,0));
        Calculator calculator=new Calculator();
        try {
            calculator.divide(4,4);
            throw new IndexOutOfBoundsException();
        }
        catch (NullPointerException e){
            System.out.println("Caught null pointer exception");
        }
        catch (ArithmeticException e){
            System.out.println("Caught arithmetic exception");
        }
        catch (RuntimeException e){
            System.out.println("Caught runtime exception");
        }
        catch (Exception e){
            System.out.println("Caught exception");
        }
    }

    public static int divide(int a, int b){
        return a/b;
    }

    public static int divideWithValidation(int a, int b){
        if(b!=0){
            return a/b;
        }
        else{
            return 0;
        }
    }

    public static int divideWithTryCatch(int a, int b){
        try{
            int divisionResult=a/b;
           return divisionResult;
        }
        catch (Exception e){
            System.out.println("Caught an exception");
            return 0;
        }
        finally {
            System.out.println("a: "+a+"\nb: "+b);
        }
    }
}
