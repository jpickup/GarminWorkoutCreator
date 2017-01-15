package com.johnpickup.garmin.workout;

import com.garmin.fit.*;
import com.johnpickup.garmin.unit.Distance;
import com.johnpickup.garmin.unit.PaceTarget;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple workout the lasts a specific distance with a pace target
 */
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class RepeatingStepsWorkoutStep extends WorkoutStep {
    private final int intervalCount;
    private final List<WorkoutStep> steps;

    @Override
    public String getName() {
        String result = String.format("%d x (",intervalCount);
        for (WorkoutStep step : steps) {
            result += step.getName() + '+';
        }
        result = result.substring(0, result.length()-1) + ')';

        return result;
    }

    @Override
    public List<WorkoutStepMesg> generateWorkoutSteps() {
        List<WorkoutStepMesg> result = new ArrayList<>();

        int stepCount=0;

        for (WorkoutStep step : steps) {
            List<WorkoutStepMesg> workoutMesgs = step.generateWorkoutSteps();
            result.addAll(workoutMesgs);
            stepCount += workoutMesgs.size();
        }
        int startIntervalIndex = result.get(0).getMessageIndex();

        WorkoutStepMesg repeatStep = new WorkoutStepMesg();
        repeatStep.setIntensity(Intensity.INVALID);
        repeatStep.setDurationType(WktStepDuration.REPEAT_UNTIL_STEPS_CMPLT);
        repeatStep.setDurationValue((long)startIntervalIndex);
        repeatStep.setTargetType(WktStepTarget.INVALID);
        repeatStep.setTargetValue((long)intervalCount);
        repeatStep.setMessageIndex(stepCount);
        result.add(repeatStep);
        stepCount++;

        return result;
    }
}
