package com.johnpickup;

import com.johnpickup.converter.PaceConverter;
import com.johnpickup.converter.PaceConverterFactory;
import com.johnpickup.converter.PaceNameConverter;
import com.johnpickup.converter.WorkoutConverter;
import com.johnpickup.excel.ExcelWorkoutScheduleReader;
import com.johnpickup.garmin.WorkoutCreator;
import com.johnpickup.garmin.unit.PaceTarget;
import com.johnpickup.parser.Pace;
import com.johnpickup.parser.PaceName;
import com.johnpickup.parser.Workout;
import com.johnpickup.parser.WorkoutSchedule;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by john on 11/01/2017.
 */
public class GarminScheduleGenerator {
    private Map<String, PaceTarget> namedPaces = new HashMap<>();

    public static void main(String[] args) {
        try {
            GarminScheduleGenerator instance = new GarminScheduleGenerator();
            instance.init();
            instance.generate(args[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void init() {
        PaceNameConverter namedPaceConverter = new PaceNameConverter(namedPaces);
        PaceConverterFactory.getInstance().register(namedPaceConverter, PaceName.class);
    }

    private void generate(String inputFilename) throws IOException {
        ExcelWorkoutScheduleReader reader = new ExcelWorkoutScheduleReader();
        WorkoutSchedule workoutSchedule = reader.read(inputFilename);
        WorkoutConverter workoutConverter = new WorkoutConverter();
        WorkoutCreator workoutCreator = new WorkoutCreator();
        for (Map.Entry<String, Pace> namedPace : workoutSchedule.getPaces().entrySet()) {
            Pace pace = namedPace.getValue();
            namedPaces.put(namedPace.getKey(), PaceConverterFactory.getInstance().getPaceConverter(pace).convert(pace));
        }

        for (Workout workout : workoutSchedule.getWorkouts().values()) {
            com.johnpickup.garmin.workout.Workout garminWorkout = workoutConverter.convert(workout);
            workoutCreator.save(garminWorkout, generateWorkoutFilename(garminWorkout));
        }

    }

    private String generateWorkoutFilename(com.johnpickup.garmin.workout.Workout garminWorkout) {
        String name = garminWorkout.getName();
        return name.trim().replaceAll(" ","").replaceAll("/","")
                .replaceAll("\\(","").replaceAll("\\)","")
                .replaceAll(":","").replaceAll("\\+","") + ".fit";
    }
}
