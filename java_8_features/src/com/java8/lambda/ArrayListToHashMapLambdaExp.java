package com.java8.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListToHashMapLambdaExp {
    public static void main(String[] args) {
        //Create the Employee Object
        List<Employee> employeeList = new ArrayList<Employee>();

        //Add the Employee in the list
        employeeList.add(new Employee(1, "Ram"));
        employeeList.add(new Employee(2, "Laxman"));
        employeeList.add(new Employee(3, "Bharat"));

        //Map which will store the list items
        Map<Integer, String> map = new HashMap<>();

        //Convert list into map
        employeeList.forEach(emp -> {
            map.put(emp.getEmpId(), emp.getEmpName());
        });

        //print the given map
        System.out.println("Map : " + map);
    }
}
