package com.infolytics.feedback.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeEntries {
    private final List<Entry> entries; // TODO check if final makes sense
    private String employeeIdentifier;


    // constructors
    public EmployeeEntries() {
        entries = new ArrayList<>();
    }

    public EmployeeEntries(Employee employee) {
        this();
        setEmployeeIdentifier(employee.getIdentifier()); // TODO besser verstehen
    }



    // getter & setter
    public List<Entry> getEntries() {
        return entries;
    }

    public void addEntry(Entry entry) {
        entries.add(entry);
    }


    public String getEmployeeIdentifier() {
        return employeeIdentifier;
    }

    public void setEmployeeIdentifier(String employeeIdentifier) {
        this.employeeIdentifier = employeeIdentifier;
    }
}
