package com.infolytics.feedback.model;

import java.time.LocalDate;
import java.util.Date;

public class Entry {
    private String entry;
    private String identifierEmployee;
    private Date timestamp; //default = aktuell; aber anpassbar
    private boolean diaryMode; // privater oder oeffentlicher Eintrag

    // constructors
    public Entry(String entry, Date timestamp) {
        this.entry = entry;
        this.timestamp = timestamp;
    }

    public Entry(String entry) {
        this(entry, new Date()); // TODO korrekte Zeit des Eintrags einfuegen, check SimpleDateFormat
    }


    // getter, setter
    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getIdentifierEmployee() {
        return identifierEmployee;
    }

    public void setIdentifierEmployee(String identifierEmployee) {
        this.identifierEmployee = identifierEmployee;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isDiaryMode() {
        return diaryMode;
    }

    public void setDiaryMode(boolean diaryMode) {
        this.diaryMode = diaryMode;
    }

    public void modifyEntry() {
        // TODO UPDATE saved entry in DB
    }

    public void removeEntry() {
        // TODO DELETE saved entry from DB
    }
}
