package com.pan.test;

/**
 * Created by OneOpiece on 2017/9/21.
 */
public class Test {
    public static void main(String[] args) {
        Employee e = new Employee("123");
        System.out.println(e.empID);
    }
}
    class Person {
        String name = "No name";
        public Person(String nm) {
            name = nm;
        }
    }

    class Employee extends Person {
        String empID = "0000";
        public  Employee(String id) {
            super(id);
            empID = id;
        }
    }
