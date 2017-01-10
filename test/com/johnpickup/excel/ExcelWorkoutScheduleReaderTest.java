package com.johnpickup.excel;

import com.johnpickup.parser.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by john on 10/01/2017.
 */
public class ExcelWorkoutScheduleReaderTest {
    private final static String EXCEL_TEST_FILE = "ExampleWorkoutSchedule.xls";
    @Test
    public void read() throws Exception {
        ExcelWorkoutScheduleReader reader = new ExcelWorkoutScheduleReader();
        WorkoutSchedule actual = reader.read(EXCEL_TEST_FILE);

        WorkoutSchedule expected = new WorkoutSchedule();
        expected.getPaces().put("Fast", new PaceRange(new Time(6,0), new Time(7,0), PaceUnit.MIN_PER_MILE));
        expected.getPaces().put("Brisk", new PaceRange(new Time(7,0), new Time(8,0), PaceUnit.MIN_PER_MILE));
        expected.getPaces().put("Steady", new PaceRange(new Time(7,30), new Time(8,30), PaceUnit.MIN_PER_MILE));
        expected.getPaces().put("Easy", new PaceRange(new Time(9,0), new Time(10,30), PaceUnit.MIN_PER_MILE));
        expected.getPaces().put("Slow", new PaceRange(new Time(10,0), new Time(15,0), PaceUnit.MIN_PER_MILE));

        assertEquals(expected, actual);
    }

}

/* PACE TEST DATA
Name	Value
Fast	6:00-7:00/mi
Brisk	7:00-8:00/mi
Steady	07:30-08:30/mi
Easy	09:00-10:30/mi
Slow	10:00-15:00/mi
*/