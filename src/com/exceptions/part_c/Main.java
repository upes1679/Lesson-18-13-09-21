package com.exceptions.part_c;

public class Main {
    public static void main(String[] args) {
        Person p=new Person();
        try {
            Person p2=(Person)p.clone();
        } catch (CloneNotSupportedException e) {
            //e.printStackTrace();
        }

        System.out.println("Reached this line");
    }
}
