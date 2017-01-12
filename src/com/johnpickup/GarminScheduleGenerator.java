package com.johnpickup;

import com.johnpickup.converter.*;
import com.johnpickup.excel.ExcelWorkoutScheduleReader;
import com.johnpickup.garmin.WorkoutSaver;
import com.johnpickup.parser.WorkoutSchedule;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;


/**
 * Simple class with command-line interface that takes an Excel definition of a workout schedule and proceduces a set
 * of FIT files for loading onto the Garmin device
 */
@Slf4j
public class GarminScheduleGenerator {

    public static void main(String[] args) {
        try {
            GarminScheduleGenerator instance = new GarminScheduleGenerator();
            instance.generate(args[0]);
        } catch (Exception e) {
            log.error("Failed to generate workout schedule", e);
        }
    }

    private void generate(String inputFilename) throws IOException {
        log.info("Converting {}", inputFilename);
        ExcelWorkoutScheduleReader reader = new ExcelWorkoutScheduleReader();
        WorkoutScheduleConverter converter = new WorkoutScheduleConverter();
        WorkoutSaver workoutSaver = new WorkoutSaver();
        log.info("Reading workout schedule");
        WorkoutSchedule workoutSchedule = reader.read(inputFilename);

        log.info("Converting workout schedule");
        converter.convert(workoutSchedule);

        log.info("Saving workouts");
        for (com.johnpickup.garmin.workout.Workout garminWorkout : converter.getGarminWorkouts()) {
            String workoutFilename = generateWorkoutFilename(garminWorkout);
            workoutSaver.save(garminWorkout, workoutFilename);
            log.info("Saved workout {} as {}", garminWorkout.getName(), workoutFilename);
        }

        log.info("Saving schedule");
        String scheduleFilename = "schedule.fit";
        workoutSaver.save(converter.getTrainingSchedule(), scheduleFilename);
        log.info("Saved workout schedule as {}", scheduleFilename);
    }

    private String generateWorkoutFilename(com.johnpickup.garmin.workout.Workout garminWorkout) {
        String name = garminWorkout.getName();
        return name.trim().replaceAll(" ","").replaceAll("/","")
                .replaceAll("\\(","").replaceAll("\\)","")
                .replaceAll(":","").replaceAll("\\+","") + ".fit";
    }
}
