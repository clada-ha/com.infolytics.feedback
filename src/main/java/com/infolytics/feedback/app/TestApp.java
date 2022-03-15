package com.infolytics.feedback.app;

import com.infolytics.feedback.model.Employee;
import com.infolytics.feedback.model.Entry;

public class TestApp {
    public static void main(String[] args) {

        Employee emp1 = new Employee("clda", "harder", "c@info.com");
        System.out.println(emp1.getFirstname());

        Employee emp2 = new Employee("dada@info.com");
        System.out.println(emp2.getFirstname());

        Entry entry1 = new Entry("this is a test entry");
        entry1.setIdentifierEmployee(emp2.getIdentifier());
        System.out.println(entry1.getIdentifierEmployee() + " created an entry: " + entry1.getEntry());
        System.out.println("entry timestamp: " + entry1.getTimestamp());
    }
}
