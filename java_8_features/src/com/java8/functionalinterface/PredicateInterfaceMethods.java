package com.java8.functionalinterface;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateInterfaceMethods {
    /* Predicate - A function that accepts an argument and return a boolean values as an answer.
     * A predicate functional interface accepts a single value or argument and does sort
     * of processing on it, and returns a boolean (True/False) answer.
     * The implementation of the Predicate functional interface also encapsulate the logic of filtering.
     *
     * Predicate having below methods to perform operation and return the values:
     *
     * 1. isEqual(Object targetReference) : Return a predicate that tests if two arguments are equal according to
     *  Objects.equal(Object, Object)
     * Syntax : static  Predicate isEqual(Object targetRef)
     *
     * 2. and(Predicate other): Return the logical AND.
     *
     * 3. negate() : Returns a predicate that represents the logical negation of this predicate.
     *
     * 4. or(Predicate other): Returns a composed predicate that represents logical OR.
     *
     * 5. test(T t) : Evaluates this predicate on the given argument.boolean test(T t) and
     *     returns true if the input argument matches the predicate, otherwise false
     */


    public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
        @Override
        public boolean test(String t) {
            return t.length() > 10;
        }
    };

    public static void predicateOr() {

        Predicate<String> containsLetterA = p -> p.contains("A");
        String containsA = "And";
        boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA);
        System.out.println(outcome);
    }

    public static void predicateAnd() {
        Predicate<String> nonNullPredicate = Objects::nonNull;

        String nullString = null;

        boolean outcome = nonNullPredicate.and(hasLengthOf10).test(nullString);
        System.out.println(outcome);

        String lengthGTThan10 = "Welcome to the Java 8";
        boolean outcome2 = nonNullPredicate.and(hasLengthOf10).test(lengthGTThan10);

    }

    public static void predicateNegate() {

        String lengthCheck = "you can learning everything about java8 ";

        boolean outcome = hasLengthOf10.negate().test(lengthCheck);
        System.out.println(outcome);
    }

    public static void main(String[] args) {
        predicateOr();
        System.out.println("==============");
        predicateAnd();
        System.out.println("==============");
        predicateNegate();
    }
}
