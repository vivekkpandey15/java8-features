package com.java8.lambda;

/* @vivekkpandey157
 *
 */
public class LambdaTest {
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
