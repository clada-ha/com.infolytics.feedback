package com.infolytics.feedback.model;

import java.util.ArrayList;
import java.util.List;

public class Task {
    // zu welcher Aufgabe gehoert Feedback?
    private String taskHeader;
    private String taskDescription;
    private Employee taskCreator; // TODO Employee oder String (employeeID)
    private List<Employee> taskRecipient;
    private String URL;     // eineindeutige Identifikation; zB ueber GitLab, AufgabenWiki
    // wie implementieren? eigene (eindeutige) Zuordnung oder ohne Zuordnung >> Projektleitung ordnet selbst zu

    // CONSTRUCTORS
    public Task(String taskHeader, String taskDescription) {
        this.taskHeader = taskHeader;
        this.taskDescription = taskDescription;
    }

    public Task(String taskHeader) {
        this(taskHeader, "no description necessary");
    }


    // METHODS



    // getter, setter
    public String getTaskHeader() {
        return taskHeader;
    }

    public void setTaskHeader(String taskHeader) {
        this.taskHeader = taskHeader;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskCreator() {
        return taskCreator;
    }

    public void setTaskCreator(String taskCreator) {
        this.taskCreator = taskCreator;
    }

    public List<Employee> getTaskRecipient() {
        return taskRecipient;
    }

    public void addTaskRecipient(Employee employee) {
        this.taskRecipient.add(employee); // TODO sinnvoll, Employee als Parameter zu uebergeben?
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
