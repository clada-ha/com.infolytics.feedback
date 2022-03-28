package com.infolytics.feedback.controller;

import com.infolytics.feedback.model.EmployeeEntries;
import com.infolytics.feedback.model.Entry;

import java.io.*;
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

    // TODO sinnvolle Konstruktoren fuer einen Controller?




    // write into local file
    public void saveEntry(Entry entry) { //  useful parameter variable
        String entryFilename = entry.getEntryDate().toString();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("/home/claudia/Documents/projekte/feedback/test_dir/entry_" + entryFilename+ ".txt" ))) {
            // TODO modify fileName >> add increment / date / ... or better save entries in one continuing file?
            writer.write(entry.getEntry());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // retrieve from local file
    public void retrieveEntry(String entryFilename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/home/claudia/Documents/projekte/feedback/test_dir/" + entryFilename + ".txt"));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) { // FileNotFoundException
            e.printStackTrace();
        }
    }

    //
//    public void modifyEntry() {
//        // TODO UPDATE saved entry in DB
//        // TODO how to modify entries in txt files? (StringBuilder?)
//        // use try w resources?
//    }

//    public void removeEntry() {
//        // TODO DELETE saved entry from DB
//    }

}
