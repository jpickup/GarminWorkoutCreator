package com.johnpickup.converter;

import com.johnpickup.garmin.workout.WorkoutStep;
import com.johnpickup.parser.RepeatingSteps;
import com.johnpickup.parser.Step;

/**
 * Created by john on 09/01/2017.
 */
public class RepeatingStepsConverter implements StepConverter {
    @Override
    public WorkoutStep convert(Step step) {
        RepeatingSteps repeatingSteps = (RepeatingSteps)step;
        return null;
    }
}
