package com.johnpickup.excel;

import com.johnpickup.parser.ScheduledWorkout;
import com.johnpickup.parser.WorkoutSchedule;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;


/**
 * Class to read all the content of a Workout Schedule Excel workbook
 */
public class ExcelWorkoutScheduleReader {
    private PaceSheetReader paceReader = new PaceSheetReader();
    private WorkoutSheetReader workoutReader = new WorkoutSheetReader();
    private ScheduleSheetReader scheduleReader = new ScheduleSheetReader();

    public WorkoutSchedule read(String filename) throws IOException {
        WorkoutSchedule result = new WorkoutSchedule();
        FileInputStream inputFile = new FileInputStream(filename);

        Workbook wb = new HSSFWorkbook(inputFile);
        result.getPaces().putAll(paceReader.readPaces(wb.getSheet("Pace")));
        result.getWorkouts().putAll(workoutReader.readWorkouts(wb.getSheet("Workout")));
        List<ScheduledWorkout> scheduledWorkouts = scheduleReader.readSchedule(wb.getSheet("Schedule"), result.getWorkouts());
        result.getSchedule().addAll(scheduledWorkouts);

        wb.close();

        return result;
    }
}
