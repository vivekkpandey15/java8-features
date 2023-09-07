package com.java8.lambda;

public class ThreadWithLambdaExample {
    /* We use the Runnable Interface to create the thread
     *
     * 1. Create the Runnable interface reference and write the Lambda expression for the run() method.
     * 2. Create a Thread class object passing the above-created reference of the Runnable interface
     *    since the start() method is defined in the Thread class its object need to be created.
     * 3. Invoke the start() method to run the thread
     */

    public static void main(String[] args) {
        //1. Creating lambda expression for run() method in functional interface Runnable
        Runnable myThread = () -> {
            //Thread.currentThread().setName("My Thread");
            System.out.println(Thread.currentThread().getName() + " is running.");
        };

        //Instantiating Thread class by passing Runnable reference to Thread constructor
        Thread thread = new Thread(myThread);

        //starting the thread
        thread.start();

        //=========================================================
        //2. Creating multiple thread
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);

        //Running two thread for the same task
        thread1.start();
        thread2.start();
    }
}
