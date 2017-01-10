package com.johnpickup.converter;

import com.johnpickup.garmin.unit.Distance;
import com.johnpickup.garmin.unit.PaceTarget;
import com.johnpickup.garmin.workout.SimplePaceWorkoutStep;
import com.johnpickup.garmin.workout.WorkoutStep;
import com.johnpickup.parser.PaceStep;
import com.johnpickup.parser.Step;

/**
 * Convert independent pace steps into the Garmin equivalent
 */
public class PaceStepConverter implements StepConverter {
    @Override
    public WorkoutStep convert(Step step) {
        PaceStep paceStep = (PaceStep)step;

        Distance d = new Distance(
                paceStep.getDistance().getQuantity(),
                DiatanceUnitConverter.convert(paceStep.getDistance().getUnit()));
        PaceTarget p = PaceConverterFactory.getInstance().getPaceConverter(paceStep.getPace()).convert(paceStep.getPace());
        SimplePaceWorkoutStep simplePaceWorkoutStep = new SimplePaceWorkoutStep(d, p);
        return simplePaceWorkoutStep;
    }
}
