package com.infolytics.feedback.app;

import com.infolytics.feedback.model.Employee;

public class TestApp {
    public static void main(String[] args) {

        Employee emp1 = new Employee("clda", "harder", "c@info.com");
        System.out.println(emp1.getFirstname());

        Employee emp2 = new Employee("dada@info.com");
        System.out.println(emp2.getFirstname());
    }
}
