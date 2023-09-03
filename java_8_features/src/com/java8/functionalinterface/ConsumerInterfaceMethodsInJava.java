package com.java8.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceMethodsInJava {

    /* The Consumer Interface is a part of the java.util.function package, which has been introduced in Java 8.
     * It represents a function which takes in one argument and produces a result. However, these kind of functions
     * don't return any value.
     *
     * T - Denotes the type of the input argument to the operation.
     *
     * The lambda expression assigned to an object of Consumer type is used to define it's accept() which eventually
     * applies the given operation on its argument. Consumers are useful when it is not needed to return any values as
     * they are expected to operate via side effects.
     *
     * Consumer Interface consists of the following two functions
     * 1. accept() - This method accepts one value and performs the operation  on the given argument.
     *  Syntax - void accept(T t)
     *
     * Parameter: This method takes in one parameter: t- the input argument
     * Return: This method does not return any value.
     *
     */

    /* 2. andThen() - It returns composed Consumer wherein the parameterized Consumer will be executed
     *   after the first one.
     * Note: The function being passed as the argument should be of type Consumer.
     *
     * Syntax: default Consumer <T> andThen(Consumer<? super T> after)
     *
     * Parameter: This method accepts a parameter after which is the Consumer to be applied after the current one.
     *
     * Return Value: This method returns a composed Consumer that first applies the current Consumer first and then
     * the after operation.
     *
     * Exception: This method throws NullPointerException if the after operation is null.
     *
     */

    public static void main(String[] args) {
        // Consumer to display a number
        Consumer<Integer> display = num -> System.out.println(num);
        // Implement display using accept()
        display.accept(10);

        // Consumer to multiply 2 to every integer of a list
        Consumer<List<Integer>> modify = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };

        // Consumer to display a list of numbers
        Consumer<List<Integer>>
                dispList = list -> list.stream().forEach(num -> System.out.print(num + " "));
        System.out.println();

        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(10);

        // Implement modify using accept()
        modify.accept(list);

        // Implement dispList using accept()
        dispList.accept(list);
        System.out.println();

        //using andThen() method
        modify.andThen(dispList).accept(list);
        System.out.println();

        // using addThen() using tyr catch
        try {
            dispList.andThen(modify).accept(list);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

}
