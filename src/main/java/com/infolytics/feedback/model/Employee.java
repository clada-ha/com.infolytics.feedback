package com.infolytics.feedback.model;

import java.util.List;

public class Employee {
    private String firstname;
    private String lastname;
    private String identifier;
    private List<String> aliases;

    // CONSTRUCTORS
    public Employee(String firstname, String lastname, String identifier) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.identifier = identifier;
    }

    public Employee(String identifier) {
        this("Vorname unbekannt", "Nachname unbekannt", identifier);
    }


    // GETTER & SETTER
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier; // TODO secure input of email address
    }

    public List<String> getAliases() {
        return aliases;
    }

    public void addAlias(String alias) {
        aliases.add(alias);
    }
}
