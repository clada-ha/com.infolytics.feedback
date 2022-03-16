package com.infolytics.feedback.app;

import com.infolytics.feedback.model.Employee;
import com.infolytics.feedback.model.Entry;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestApp {
    public static void main(String[] args) {

        Employee emp1 = new Employee("clda", "harder", "c@info.com");
        System.out.println(emp1.getFirstname());

        Employee emp2 = new Employee("dada@info.com");
        System.out.println(emp2.getFirstname());

        Entry entry1 = new Entry("this is a test entry\nline2\nline3\nblabla");
        entry1.setIdentifierEmployee(emp2.getIdentifier());
        System.out.println(entry1.getIdentifierEmployee() + " created an entry: " + entry1.getEntry());
        System.out.println("entry timestamp: " + entry1.getTimestamp());

        Entry entry2 = new Entry("test two, with specified timestamp", LocalDate.of(2022, 03, 16), LocalTime.now(), false);
        System.out.println(" timestamp: " + entry2.getTimestamp() + ", date: " + entry2.getEntryDate());

        entry1.saveEntry(entry1);
        entry1.retrieveEntry("entry_2022-03-16");




    }
}
