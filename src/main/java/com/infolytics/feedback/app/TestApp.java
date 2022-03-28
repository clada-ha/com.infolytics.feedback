package com.infolytics.feedback.app;

import com.infolytics.feedback.model.Entry;
import com.infolytics.feedback.model.FeedbackEntry;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestApp {
    public static void main(String[] args) {


        FeedbackEntry entry1 = new FeedbackEntry("this is a test entry\nline2\nline3\nblabla");
        System.out.println(entry1.getIdentifierEmployee() + " created an entry: " + entry1.getEntry());
        System.out.println("entry timestamp: " + entry1.getTimestamp());

        Entry entry2 = new FeedbackEntry("test two, with specified timestamp", LocalDate.of(2022, 3, 16), LocalTime.now(), false);
        System.out.println(" timestamp: " + entry2.getTimestamp() + ", date: " + entry2.getEntryDate());
        entry2.setIdentifierEmployee("ch@info.com");
        // TODO check diff in instantiating as Entry vs FeedbackEntry

        Entry entry3 = new FeedbackEntry("test entry3");
//
//        entry1.saveEntry(entry1);
//        entry1.retrieveEntry("entry_2022-03-16");




    }
}
