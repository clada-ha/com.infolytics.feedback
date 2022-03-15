package com.infolytics.feedback.controller;

import com.infolytics.feedback.model.EmployeeEntries;
import com.infolytics.feedback.model.Entry;

public class EntriesController {
    public static void printEntries(EmployeeEntries prints) {
        System.out.println("employee ID: " + prints.getEmployeeIdentifier());

        for (Entry entry : prints.getEntries()) {
            System.out.println(entry.getTimestamp());
            System.out.println(entry);
        }
    }

    public void modifyEntry() {
        // TODO UPDATE saved entry in DB
    }

    public void removeEntry() {
        // TODO DELETE saved entry from DB
    }

    // TODO save entries in txt file (BufferedWriter, BufferedReader)


}
