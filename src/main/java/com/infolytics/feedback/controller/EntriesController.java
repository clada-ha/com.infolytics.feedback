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
    public void printEntries(EmployeeEntries prints) { // static?
        System.out.println("employee ID: " + prints.getEmployeeIdentifier());

        for (Entry entry : prints.getEntries()) {
            LocalDate entryDate = entry.getEntryDate();
            LocalTime timestamp = entry.getTimestamp();
            DateTimeFormatter formatDateObj = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            DateTimeFormatter formatTimeObj = DateTimeFormatter.ofPattern("HH:mm");

            String formattedDate = entryDate.format(formatDateObj);
            String formattedTime = (timestamp.format(formatTimeObj) + " Uhr");

            System.out.printf("Datum des Eintrags: %s\n", formattedDate);
            System.out.println("Uhrzeit: " + formattedTime);
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
//        // TODO how to modify entries in txt files? (StringBuilder?)
//        // use try w resources?
//    }
//
//    public void removeEntry() {
//        // TODO DELETE saved entry from DB
//    }

    // TODO save entries in txt file (BufferedWriter, BufferedReader)


}
