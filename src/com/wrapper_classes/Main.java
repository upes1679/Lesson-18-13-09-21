package com.wrapper_classes;

public class Main {
    public static void main(String[] args) {
        Integer i= new Integer(5);
        Integer is= new Integer("5");


        //System.out.println(a);
        Integer ii=5;//Autoboxing
        Integer iii=Integer.valueOf(8);
        int a=ii;//Unboxing

        int aa= iii.intValue();
        System.out.println(aa);
    }
}
