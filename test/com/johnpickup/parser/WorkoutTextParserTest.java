package com.johnpickup.parser;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by john on 03/01/2017.
 */
public class WorkoutTextParserTest {
    private WorkoutTextParser classUnderTest;
    @Before
    public void setUp() throws Exception {
        classUnderTest = new WorkoutTextParser();

    }

    @Test
    public void parseSimpleDistance() throws Exception {
        Workout actual = classUnderTest.parse("1mi");
        Workout expected = new Workout(Collections.singletonList(new DistanceStep(new Distance(1, DistanceUnit.MILE))));
        assertEquals(expected, actual);
    }

    @Test
    public void parseSimpleDistancePace() throws Exception {
        Workout actual = classUnderTest.parse("1mi@08:00-09:30/mi");
        Workout expected = new Workout(Collections.singletonList(new DistancePaceStep(new Distance(1, DistanceUnit.MILE), new PaceRange(new Time(8,0), new Time(9, 30), PaceUnit.MIN_PER_MILE))));
        assertEquals(expected, actual);
    }

    @Test
    public void parseSimpleTime() throws Exception {
        Workout actual = classUnderTest.parse("10:00");
        Workout expected = new Workout(Collections.singletonList(new TimeStep(new Time(10,0))));
        assertEquals(expected, actual);
    }

    @Test
    public void parseSimpleTimePace() throws Exception {
        Workout actual = classUnderTest.parse("10:00@08:00-09:30/mi");
        Workout expected = new Workout(Collections.singletonList(new TimePaceStep(new Time(10,0), new PaceRange(new Time(8,0), new Time(9, 30), PaceUnit.MIN_PER_MILE))));
        assertEquals(expected, actual);
    }
    @Test
    public void parseSimpleNamedPace() throws Exception {
        Workout actual = classUnderTest.parse("1mi@FAST");
        Workout expected = new Workout(Collections.singletonList(new DistancePaceStep(new Distance(1, DistanceUnit.MILE), new PaceName("FAST"))));
        assertEquals(expected, actual);
    }

    @Test
    public void parseMultiStep() throws Exception {
        Workout actual = classUnderTest.parse("1mi + 4mi@08:00-09:30/mi + 1mi");
        List<Step> steps = new ArrayList<>();
        steps.add(new DistanceStep(new Distance(1, DistanceUnit.MILE)));
        steps.add(new DistancePaceStep(new Distance(4, DistanceUnit.MILE), new PaceRange(new Time(8,0), new Time(9, 30), PaceUnit.MIN_PER_MILE)));
        steps.add(new DistanceStep(new Distance(1, DistanceUnit.MILE)));
        Workout expected = new Workout(steps);
        assertEquals(expected, actual);
    }


    @Test
    public void parseInterval() throws Exception {
        Workout actual = classUnderTest.parse("(1mi@08:00-09:30/mi + 400m@10:00-12:30/mi) * 4");
        RepeatingSteps repeatingSteps = new RepeatingSteps(new DistancePaceStep(new Distance(1, DistanceUnit.MILE), new PaceRange(new Time(8,0), new Time(9, 30), PaceUnit.MIN_PER_MILE)));
        repeatingSteps.addStep(new DistancePaceStep(new Distance(400, DistanceUnit.METRE), new PaceRange(new Time(10,0), new Time(12, 30), PaceUnit.MIN_PER_MILE)));
        repeatingSteps.setRepetitions(4);
        Workout expected = new Workout(Collections.singletonList(repeatingSteps));
        assertEquals(expected, actual);
    }
}