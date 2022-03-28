package com.infolytics.feedback.model;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Entry {
    private String entry;
    private String identifierEmployee;
    private LocalDate entryDate; //default = heute; aber anpassbar
    private LocalTime timestamp; // default = jetzt; aber anpassbar

    // TODO better use LocalDateTime? >> see DateTimeFormatter.ofPattern
    private boolean diaryMode; // true: DiaryEntry, false: FeedbackEntry

    // constructors
    public Entry() {
        // why do I need this default constructor to extend Diary- & FeedbackEntry?
    }

    public Entry(String entry, LocalDate entryDate, LocalTime timestamp, boolean diaryMode) {   // besserer constructor? >>  Parameter: int year , int month, int day
        this.entry = entry;
        this.entryDate = LocalDate.now();    // LocalDate.of(2022, 3, 16), LocalDate.of(2022, Month.March, 16)
        this.timestamp = timestamp;
        this.diaryMode = diaryMode;
    }

    public Entry(String entry, LocalTime timestamp) { // TODO check if useful constructor
        this(entry, LocalDate.now(), timestamp, true);
    }

    public Entry(String entry) {
        this(entry, LocalDate.now(), LocalTime.now(), true); // TODO korrekte Zeit des Eintrags einfuegen, check SimpleDateFormat
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

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public LocalTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalTime timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isDiaryMode() {
        return diaryMode;
    }

    public void setDiaryMode(boolean diaryMode) {
        this.diaryMode = diaryMode;
    }


}
