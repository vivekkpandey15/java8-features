package com.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class LambdaWithCollection {
    public static void main(String[] args) {

        //Sorting ArrayList element
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(250);
        arrayList.add(310);
        arrayList.add(46);
        arrayList.add(50);

        System.out.println("Print the unsorted ArrayList : " + arrayList);

        // Sorting elements of the List using Lambda
        Collections.sort(arrayList, (obj1, obj2) -> (obj1 > obj2) ? -1 : (obj1 < obj2) ? 1 : 0);
        System.out.println("Sorted ArrayList: " + arrayList);
        System.out.println("======================================================");

        //Sorting TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>((obj1, obj2) -> (obj1 > obj2) ? -1 : (obj1 < obj2) ? 1 : 0);
        treeSet.add(1001);
        treeSet.add(123);
        treeSet.add(652);
        treeSet.add(510);
        treeSet.add(15);

        System.out.println("Sorting TreeSet in Descending Order : " + treeSet);

    }
}
