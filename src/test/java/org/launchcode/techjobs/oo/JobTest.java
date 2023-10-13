package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job job1 = new Job("LaunchCode Handler", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Remote"), new CoreCompetency("Javascript"));
        Job job2 = new Job("MasterCard", new Employer("MasterCard"), new Location("St. Charles"), new PositionType("In Office"), new CoreCompetency("Java"));

        assertNotEquals(job1.getId(), job2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields()
    {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester" , job1.getName());
        assertEquals("ACME", job1.getEmployer().getValue());
        assertEquals("Desert", job1.getLocation().getValue());
        assertEquals("Quality control", job1.getPositionType().getValue());
        assertEquals("Persistence", job1.getCoreCompetency().getValue());
        assertTrue(job1 instanceof Job);
        assertTrue(job1.getEmployer() instanceof Employer);
        assertTrue(job1.getLocation() instanceof Location);
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);

    }
    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("LaunchCode Handler", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Remote"), new CoreCompetency("Javascript"));
        Job job2 = new Job("LaunchCode Handler", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Remote"), new CoreCompetency("Javascript"));

        assertNotEquals(job1.getId(), job2.getId());
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job("LaunchCode Handler", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Remote"), new CoreCompetency("Javascript"));

        String convertedToString = job1.toString();

        assertTrue(convertedToString.startsWith(System.lineSeparator()));
        assertTrue(convertedToString.endsWith(System.lineSeparator()));
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job1 = new Job("LaunchCode Handler", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Remote"), new CoreCompetency("Javascript"));
        String actualPrint = System.lineSeparator() + "ID: " +job1.getId() + System.lineSeparator() +
                                "Name: " + job1.getName() + System.lineSeparator() +
                                "Employer: " +job1.getEmployer() + System.lineSeparator() +
                                "Location: " + job1.getLocation() + System.lineSeparator() +
                                "Position Type: " + job1.getPositionType() + System.lineSeparator() +
                                "Core Competency: " +job1.getCoreCompetency() + System.lineSeparator();
        assertEquals(String.valueOf(job1), actualPrint);
    }
    @Test
    public void testToStringHandlesEmptyField() {
        Job job1 = new Job("LaunchCode Handler", new Employer(""), new Location(""), new PositionType("Remote"), new CoreCompetency("Java"));
        job1.toString();
        assertEquals(job1.getEmployer().getValue(), "Data not available");
        assertEquals(job1.getLocation().getValue(), "Data not available");
    }
}
