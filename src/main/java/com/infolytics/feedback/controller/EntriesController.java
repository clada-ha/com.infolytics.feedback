package com.infolytics.feedback.controller;

import com.infolytics.feedback.model.EmployeeEntries;
import com.infolytics.feedback.model.Entry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EntriesController {
    public static void printEntries(EmployeeEntries prints) {
        System.out.println("employee ID: " + prints.getEmployeeIdentifier());

        for (Entry entry : prints.getEntries()) {
            LocalDate entryDate = entry.getEntryDate();
            LocalTime timestamp = entry.getTimestamp();
            DateTimeFormatter formatDateObj = DateTimeFormatter.ofPattern("dd.MM.yyyy");

            String formattedDate = entryDate.format(formatDateObj);

            System.out.printf("date of entry: %s\n", formattedDate);
            System.out.println(entry.getTimestamp());
            System.out.println(entry);
        }
    }

    // sinnvolle Konstruktoren fuer einen Controller?



//    public Entry retrieveEntry() {
//        // TODO call entry from local file
//        // try w resources?
//    }
//
//    public void modifyEntry() {
//        // TODO UPDATE saved entry in DB
//        // use try w resources?
//    }
//
//    public void removeEntry() {
//        // TODO DELETE saved entry from DB
//    }

    // TODO save entries in txt file (BufferedWriter, BufferedReader)


}
