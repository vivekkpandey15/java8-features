package com.java8.methodreference;

import java.util.Arrays;
import java.util.function.BiFunction;

public class MethodReferencesExample {
    /* The Method references can only be used to replace a single method of the lambda expression.
     * Method references to refer to the method of functional interface. It is an easy way of
     * writing lambda expressions used to call a method.
     *
     * In method reference, the :: operator divides the method name from the class or object name.
     *
     * Types of Method References:
     *
     * 1. Static Method Reference: This method reference is used to refer to a static method that is defined in a class.
     * Syntax: (args) -> Class.staticMethod(args)
     *
     * 2. Instance Method Reference of a particular object:
     *    This type of method reference refers to non-static method by a class object.
     * Syntax: (args) -> object.instanceMethod(args)
     *
     * 3. Instance Method Reference of arbitrary object of a particular type:
     *  This methods reference refers to non-static instance methods without creating a custom object.
     *  It uses an anonymous object to refer to the instance method.
     * Syntax: (object, args) -> object.instanceMethod(args)
     *
     * 4. Constructor Reference:
     * This type of method reference refers to a constructor by using the new keyword.
     * Syntax: (args) -> new ClassName(args)
     *
     * Method reference refers to the method via the use of an :: operator.
     * A method reference in Java 8 can execute only a single method call like a lambda expression but a shorter code.
     * Java 8 allows the method reference to static methods, instance methods, and constructors.
     *
     */

    public static void main(String[] args) {

        //1. Static Method Reference:
        BiFunction<Double, Double, Double> sum = Sum::sum;
        Double result = sum.apply(10.0, 20.0);
        System.out.println("The Sum of Two Number is : " + result);
        System.out.println("=================================");


        //2. Instance Method Reference of a particular object
        MethodReferencesExample reference = new MethodReferencesExample();
        // Reference to the method using the object of the class printMessage
        ShowMessage ref = reference::printMessage;
        // Calling the method inside the functional interface ShowMessage
        ref.dispayMessage();
        System.out.println("=================================");


        //3. Method reference to an instance method of an arbitrary object of a specific type
        String[] stringArray = {"Ram", "Bharat", "Laxman", "Satrughan"};
        // Method reference to an instance method of an arbitrary object of a particular type
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        for (String str : stringArray) {
            System.out.println(str);
        }
        System.out.println("=================================");


        //4. Method reference to a constructor
        DisplayMessageInterface messageRef = DisplayMessage::new;
        messageRef.displayMessage("Java 8 Method Reference to a Constructor!");

    }

    public void printMessage() {
        System.out.println("Java 8 Method Reference!");
    }
}
