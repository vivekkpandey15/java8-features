package com.java8.functionalinterface;

/* Java Functional Interface
 *===============================
 * A functional interface is an interface that contains only one abstract methods.
 * In Java 8 lambda expression is used to represent the instance of a functional interface.
 *
 * A functional interface can have any number of default methods, but can have only one abstract methods.
 *
 * Runnable, ActionListener and Comparable are some of the examples of functional interfaces.
 *
 * Functional interface in java introduced to support the functional programming.
 *
 * To create Functional interface we need to use the @FunctionalInterface annotation at class level.
 *
 * @Vivek Pandey
 */

@FunctionalInterface
public interface FunctionalInterfaceExample {
    //abstract keyword is optional
    int square(int num);

     /* We have built in java functional interface and abstract method-
  * 1. Runnable -> This interface only contains the run() method.
  * 2. Comparable -> This interface only contains the compareTo() method.
  * 3. Callable -> This interface only contains the call() method.
  * 4. ActionListener -> This interface only contains the actionPerformed() method

 //   -----------------------------------------------------------------------------------------------------
 * In Java 8 these are the functional interfaces -
 * 1. Consumer
 * 2. Predicate
 * 3. Function
 * 4. Supplier
 *
 * Consumer, Predicate, and Function, likewise have addition types
 * Consumer -> Bi-Consumer
 * Predicate -> Bi-Predicate
 * Function -> Bi-Function, Unary Operator, Binary Operator
 *
 * ----------------------------------------------------------------------------------------------------------------------------
 * 1. Consumer:
 *  The consumer interface of the functional interface is the one that accepts only one argument. The .consumer
 * interface has no rerun value. There are also functional variants of the Consumer - DoubleConsumer, IntConsumer and LongConsumer.
 * These variants accept primitive values as arguments.
 *
 * Bi-Consumer - Bi-Consumer is the most exciting variant of the Consumer interface. The consumer interface takes only
 * one argument, but on the other side, by the Bi-Consumer interface takes two arguments.
 * Both Consumer and Bi-Consumer have no return value. It is used in iterating through the entries of the map.
 *
 * Syntax : Consumer<Integer> consumer = value -> System.out.println(value);
 *-------------------------------------------------------------------------------------------------------------------
 *
 * 2. Predicate - A function that accepts an argument and in return, generates a boolean values as an answer is
 * known as a predicate.
 * A predicate functional interface of java is a type function that accepts a single value or argument and does sort
 * of processing on it, and returns a boolean (True/False) answer.
 * The implementation of the Predicate functional interface also encapsulate the logic of filtering.
 *
 * Bi-Predicate - Bi-Predicate is an extension of the Predicate functional interface, which instead of one,
 * takes two arguments, does some processing and return the booleans values
 *
 * Syntax - Predicate = (value) -> value != null;
 *----------------------------------------------------------------------------------------------------------
 *
 * 3. Function - A function is a type of functional interface in Java that receives only a single argument and
 *  returns a value after the required processing. There are many versions of Function interfaces because a primitive
 *  type can't imply a general type argument, so we need these versions of version of function interface.
 *
 *  Bi-Function - The Bi-Function is substantially related to a Function. Besides, it takes two arguments, whereas
 *  Function accepts one argument.
 *
    //The prototype and syntax of Bi-Function is given below -

    @FunctionalInterface
    public interface BiFunction<T, U, R>
    {
        R apply(T t, U u);
    }
    // In the above code of i nterface, T and U are the inputs, and there is only one output which is R.


   * Unary Operator and Binary Operator
   * -----------------------------------
   * There are also two other functional interfaces which are named Unary Operator and Binary Operator.
   * They both extend the Function and Bi-Function, respectively. In simple words, Unary Operator extends
   * Function, and Binary Operator extends Bi-Function.
   *
   * The prototype of the Unary Operator and Binary Operator is mentioned below :
   *

  //1. Unary Operator
  @FunctionalInterface
  public interface BinaryOperator<T> extends BiFunction<T, U, R> {

  }

  //2. Binary Operator
  @FunctionalInterface
    public interface UnaryOperator<T> extends Function<T, U>{

  }


  * Unary Operator accepts only one argument and return a single argument only. Still in Unary Operator
  * both the input and output values must be identical and of the same type.
  *
  * On the other way, Binary Operator takes two values and returns one value comparable to Bi-Function
  * but similar to a Unary Operator, the input and output value types must be identical and of the same type.

  4. Supplier
  * ============
  *  The Supplier functional interface is also a type of functional interface that does not take any input or
  *  argument and yet returns a single output. This type of functional interface is generally used in the lazy
  *  generation of the values.

    @FunctionalInterface
    public interface Supplier<T>{
        //get a result

       //return the specific result
    // T.get();
 }

  /* Here are some significant points regarding Functional interfaces in Java:
  * ==========================================================================
  * 1. In functional interfaces, there is only one abstract method supported. If the annotation of a functional interface,
  *  i.e., @FunctionalInterface is not implemented or written with a function interface, more than one abstract method
  *  can be declared inside it. However, in this situation with more than one functions, that interface will not be
  * called a functional interface. It is called a non-functional interface.
  * 2. There is no such need for the @FunctionalInterface annotation as it is voluntary only. This is written because
  * it helps in checking the compiler level. Besides this, it is optional.
  * 3. An infinite number of methods (whether static or default) can be added to the functional interface. In simple
  * words, there is no limit to a functional interface containing static and default methods.
  * 4. Overriding methods from the parent class do not violate the rules of a functional interface in Java.
  * 5. The java.util.function package contains many built-in functional interfaces in Java 8.
   */

}
