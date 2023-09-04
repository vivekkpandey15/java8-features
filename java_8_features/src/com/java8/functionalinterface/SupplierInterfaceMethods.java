package com.java8.functionalinterface;

import java.util.function.Supplier;

public class SupplierInterfaceMethods {
    /* The Supplier Interface is the part of the java.util.function package.
     * It represents a function which does not take in any argument but produces a value of type T.
     *
     * T: denotes the type of the result
     *
     * The lambda expression assigned to an object of supplier type is used to define its get() which
     * eventually produces a value. Supplier are useful when we don't need to supply any value and
     * obtain a result at the same time.
     *
     * get(): This method does not take in any argument but produces a value of type T.
     * Syntax: T get()
     *
     * Returns: This method returns a value of type T.
     *
     */

    public static void main(String[] args) {

        // This function returns a random value.
        Supplier<Double> randomValue = () -> Math.random();

        // Print the random value using get()
        System.out.println(randomValue.get());
    }
}
