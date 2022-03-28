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
            System.out.printf("Uhrzeit: %s\n\n", formattedTime);
            System.out.println(entry);
        }
    }

    // sinnvolle Konstruktoren fuer einen Controller?



}
