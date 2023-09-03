package com.java8.functionalinterface;

public class FunctionalInterfaceTest {

    public static void main(String[] args) {
        int a = 10;

        //lambda expression to define the calculate method
        FunctionalInterfaceExample functionalInterfaceExample = (int num) -> num * num;
        int square = functionalInterfaceExample.square(a);
        System.out.println(square);
    }
}
