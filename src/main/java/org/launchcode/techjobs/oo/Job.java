package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Employer getEmployer() {
        return employer;
    }
    public Location getLocation() {
        return location;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    @Override
    public String toString() {
        String empty = "";
        this.name = (this.name == null || this.name == empty) ? "Data is not avaliable" : name;
        if (this.employer.getValue() == null || this.employer.getValue() == "")
        {
            this.employer.setValue("Data not available");
        }
        if (this.location.getValue() == null || this.location.getValue() == "")
        {
            this.location.setValue("Data not available");
        }
        if (this.coreCompetency.getValue() == null || this.coreCompetency.getValue() == "")
        {
            this.coreCompetency.setValue("Data not available");
        }
        if(this.positionType.getValue() == null || this.positionType.getValue() == "")
        {
            this.positionType.setValue("Data not available");
        }
        String newline = System.getProperty("line.separator");
        return "ID: " +this.id+ newline+
                "Name: " + this.name + newline +
                "Employer: " + this.employer + newline+
                "Location: " +this.location + newline +
                "Position Type: " + this.positionType + newline +
                "Core Competency: " + this.coreCompetency+ newline;
    }
}