package com.infolytics.feedback.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeEntries {
    private final List<Entry> entries; // TODO check if final makes sense
    private String employeeIdentifier;
    private int entryCounter = 0; // pruefen, ob sinnvoll?


    // constructors
    public EmployeeEntries() {
        entries = new ArrayList<>();
    }

    public EmployeeEntries(Employee employee) {     // TODO constructor besser verstehen
        this();
        setEmployeeIdentifier(employee.getIdentifier());
    }



    // getter & setter
    public List<Entry> getEntries() {
        return entries;
    }

    public void addEntry(Entry entry) {
        entries.add(entry);
        entryCounter++;
        // increment a counter to later add it to filename?
    }


    public String getEmployeeIdentifier() {
        return employeeIdentifier;
    }

    public void setEmployeeIdentifier(String employeeIdentifier) {
        this.employeeIdentifier = employeeIdentifier;
    }
}
