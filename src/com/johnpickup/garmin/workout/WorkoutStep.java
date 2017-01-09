package com.johnpickup.garmin.workout;

import com.garmin.fit.*;
import com.johnpickup.garmin.fit.FitGenerator;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class WorkoutStep {
    private static int stepIndex = 0;

    public static void startNewWorkout() {
        stepIndex = 0;
    }

    protected abstract List<WorkoutStepMesg> generateWorkoutSteps();
    public abstract String getName();
    protected Integer generateWorkoutStepIndex() {
        return stepIndex++;
    }
}
