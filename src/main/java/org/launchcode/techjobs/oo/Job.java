package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private String location;
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
        this.location = String.valueOf(location);
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public String toString() {
        String name = (this.getName() == "") ? "Data not avaliable" : getName();
        Boolean TorF = false;

        return name;
    }
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
    public String getLocation() {
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

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

}