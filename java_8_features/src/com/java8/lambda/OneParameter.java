package com.java8.lambda;

public interface OneParameter {
    // The void type and the Integer type is automatically inferred from here
    // and assigned to the lambda expression
    void print(Integer p);
}
