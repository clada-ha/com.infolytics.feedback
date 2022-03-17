package com.infolytics.feedback.model;

import java.util.ArrayList;
import java.util.List;

public class FeedbackEntry extends Entry{
    private List<String> recipients;

    public FeedbackEntry() {
        recipients = new ArrayList<>();
    }

    // TODO add constructor w recipient
    public FeedbackEntry(String recipient) {
        this();
        recipients.add(recipient);  // ??!?
    }


    // METHODS
    public void addRecipient(String recipient) {
        recipients.add(recipient);
    }
}
