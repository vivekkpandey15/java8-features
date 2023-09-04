package com.java8.functionalinterface;

import java.util.function.Function;

public class FunctionInterfaceMethods {
    /* The Function Interface is part of the java.util.function package.
     * It is introduced to implement functional programing in Java.
     * Function represents a function which takes in one argument and produces a result.
     * T: denotes the type of the input argument
     * R: denotes the return type of the function
     *
     * The lambda function assigned to an object of Function type is used to define its apply()
     * which eventually applies the given function on the argument.
     *
     * The Function interface consists of the following 4 methods as listed which are later discussed as follows:
     *
     * 1. apply() : Syntax: R apply(T t)
     *
     * Parameter: Takes only one parameter t which is the function argument.
     * Return Type: Returns the function result which is of type R.
     *
     * 2. andThen(): It returns a composed function wherein the parameterized function will be executed after the first one.
     *              If evaluation of either function throws an error, it is relaying to the caller of the composed function.
     *
     * Syntax: default<V> Function<T, V>
               andThen(Function<? super R, ? extends V> after)
     * where V is the type of output of the after function, and of the composed function.
     *
     * Parameters: This method accepts a parameter after which is the function to be applied after the current one.
     * Return Type: This method returns a composed function that applies the current function first and then the after function.
     * Exception: This method throws NullPointerException if the after function is null.
     *
     * 3. compose(): It return a composed function wherein the parameterized function will be executed first and then the first one.
     *               If evaluation of either function throws an error, it is relaying to the caller of the composed function.
     *  Syntax: default <V> Function<V, R>
                compose(Function<? super V, ? extends T before)
     *where V is the type of output of the before function, and of the composed function.
     *
     * Parameter: Accept a parameter before which is the function to be applied first and then the current one.
     * Return Type: This method returns a composed function that applies the current function after the parameterized function.
     * Exception: This method throws NullPointerException if the before function is null.
     *
     *
     * 4. identity(): This method returns a function that returns its only argument.
     * Syntax: static <T> Function<T, T> identity()
     *
     * Where T denotes the type of the argument and the value to be returned.
     * Returns: This method returns a function that returns its own argument.
     *
     */

    static void apply() {
        // Function which takes in a number and returns half of it
        Function<Integer, Double> half = num -> num / 2.0;

        // Applying the function to get the result
        System.out.println(half.apply(12));
    }

    static void andThen() {
        // Function which takes in a number and returns half of it
        Function<Integer, Double> half = num -> num / 2.0;

        // Now treble the output of half function andThen()
        half = half.andThen(num -> 5 * num);
        // Applying the function to get the result and printing on console
        System.out.println(half.apply(10));
    }

    static void compose() {
        // Function which takes in a number and returns half of it
        Function<Integer, Double> half = num -> num / 2.0;

        // However treble the value given to half function
        half = half.compose(num -> 3 * num);

        // Applying the function to get the result
        System.out.println(half.apply(5));

    }

    static void identity() {
        // Function which takes in a number and returns it
        Function<Integer, Integer> identity = Function.identity();
        System.out.println(identity.apply(10));
    }

    public static void main(String[] args) {
        apply();
        System.out.println("===============");
        andThen();
        System.out.println("===============");
        compose();
        System.out.println("===============");
        identity();

    }
}
