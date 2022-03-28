package com.infolytics.feedback.model;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EntriesFileDAO extends EntriesDAO {

    // write into local file
    public void createEntry(Entry entry) { //  useful parameter variable?
        String entryFilename = entry.getEntryDate().toString();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("/home/claudia/Documents/projekte/feedback/test_dir/entry_" + entryFilename+ ".txt" ))) {
            // TODO modify fileName >> add increment / date / ... or better save entries in one continuing file?
            writer.write(entry.getEntry());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // retrieve from local file
    public void readEntry(String entryFilename) {
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


    public void updateEntry() {
        // TODO create updateEntry method
    }

    public void deleteEntry() {
        // TODO create deleteEntry method
    }


//    public void printEntries(Entry prints) {
//        System.out.println("employee ID: " + prints.getIdentifierEmployee());
//
//        for (Entry entry : prints.getEntries()) {   // TODO how to get several entries
//            LocalDate entryDate = entry.getEntryDate();
//            LocalTime timestamp = entry.getTimestamp();
//            DateTimeFormatter formatDateObj = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//            DateTimeFormatter formatTimeObj = DateTimeFormatter.ofPattern("HH:mm");
//
//            String formattedDate = entryDate.format(formatDateObj);
//            String formattedTime = (timestamp.format(formatTimeObj) + " Uhr");
//
//            System.out.printf("Datum des Eintrags: %s\n", formattedDate);
//            System.out.printf("Uhrzeit: %s\n\n", formattedTime);
//            System.out.println(entry);
//        }
//    }

}
