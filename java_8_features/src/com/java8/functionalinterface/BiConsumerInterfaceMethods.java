package com.java8.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerInterfaceMethods {

    /* The BiConsumer Interface is a part of the java.util.function package introduced in java8 to implement functional programming.
     * This functional interface takes in two generics namely:
     * T: denotes the type of the first input argument to the operation.
     * U: denotes the type of the second input argument to the operation.
     *
     * The lambda expression assigned to an object of the BiConsumer type is used to define it's accept
     * which eventually applies the given operation to its arguments.
     *
     * BiConsumer is used when it is not required to return any value.
     *
     * accept()- This method accepts two values and performs the operation on the given arguments.
     *           void accept(T t, U u)
     * Parameter: this takes two parameter t- first argument, u second argument
     *
     * Return: This method does not return any value.
     *
     * 2. andThen() :It returns a composed BiConsumer wherein the parameterized BiConsumer will be executed after
     * the first one. If the evaluation of either operation throws an error, it is relayed to the caller of the
     * composed operation.
     * default BiConsumer <T, U> andThen(BiConsumer<? super T, ? super U> after)
     */
    public static void main(String[] args) {

        // Create the first list
        List<Integer> firstList = new ArrayList<Integer>();
        firstList.add(2);
        firstList.add(1);
        firstList.add(2);

        // Create the second list
        List<Integer> secondList = new ArrayList<Integer>();
        secondList.add(2);
        secondList.add(1);
        secondList.add(2);

        // BiConsumer to compare both lists
        BiConsumer<List<Integer>, List<Integer>> equals = (list1, list2) -> {
            if (list1.size() != list2.size()) {
                System.out.println("FALSE");
            } else {
                for (int i = 0; i < list1.size(); i++)
                    if (list1.get(i) != list2.get(i)) {
                        System.out.println("FALSE");
                        return;
                    }
                System.out.println("TRUE");
            }
        };
        equals.accept(firstList, secondList);
        System.out.println("======");

        //andThen()
        BiConsumer<List<Integer>, List<Integer>> disp = (list1, list2) ->
        {
            list1.stream().forEach(l -> System.out.print(l + " "));
            System.out.println();
            list2.stream().forEach(l -> System.out.print(l + " "));
            System.out.println();
        };

        // Using addThen() method
        equals.andThen(disp).accept(firstList, secondList);
    }

}

/* OUTPUT
 *=========
 * TRUE
 */