package com.java8.lambda;

/* @vivekkpandey157
 *
 */
public class LambdaTest {
    /* Lambda Expressions are anonymous functions. These functions do not need a name or a class
     * to be used. Lambda expressions are added in java 8 to define inline implementation of a functional
     * interfaces.
     *
     * Lambda expressions implement only one abstract function and therefore implement functional interfaces.
     * Predicate interface is an example of a functional interface that has only one abstract method called test().
     *
     * Syntax: (int arg1, String arg2) -> {System.out.println("Two arguments " + args1 + " and " + args2);}
     *         Argument List                Body of Lambda expression
     *
     * The body of a lambda expression can contain zero, one, or more statements.
     * When there is a single statement curly brackets are not mandatory and the return type of the
     *  anonymous function is the same as that of the body expression.
     * When there is more than one statement, then these must be enclosed in curly brackets and return
     *  of the anonymous value returned within the code block, or void if nothing is returned.
     *
     * Type 1: No Parameter
     * Syntax: () -> System.out.println("Hello");
     *
     * Type 2: Single Parameter
     * Syntax: (p) -> System.out.println(p);
     *
     * Type 3:  Multi parameters
     * Syntax: (p1, p2) -> System.out.println(p1 + " " + p2);
     */

    // functional interface parameter is passed
    static void funNoParam(NoParameter noParameter) {
        noParameter.print();
    }

    // functional interface parameter is passed
    static void funOneParam(OneParameter parameter, Integer num) {
        parameter.print(num);
    }

    // takes parameter of MultiParameter type followed by 2 integer parameters p1 and p2
    static void funMultiParam(MultiParameter multiParameter, Integer p1, Integer p2) {
        // calls the print function
        multiParameter.print(p1, p2);
    }

    static void fun(NoParameter noParameter) {
        noParameter.print();
    }

    public static void main(String[] args) {
        // lambda expression is passed without parameter to functional interface t
        funNoParam(() -> System.out.println("Hello No Parameter"));
        System.out.println("======================");


        // lambda expression is passed with a single parameter lambda expression is mapped to the
        // single argument abstract function in the functional interface OneParameter
        funOneParam(num -> System.out.println(num), 10);
        System.out.println("======================");


        // lambda expression is passed  with two parameters lambda expression is mapped to the
        // double argument abstract function in the functional interface Test3
        funMultiParam((num1, num2) -> System.out.println(num1 + " " + num2), 10, 20);
    }
}
