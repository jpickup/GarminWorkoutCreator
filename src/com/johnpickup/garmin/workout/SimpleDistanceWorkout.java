package com.johnpickup.garmin.workout;

import com.garmin.fit.*;
import com.johnpickup.garmin.unit.Distance;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple workout the lasts a specific distance, no pace targets
 */
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class SimpleDistanceWorkout extends WorkoutStep {
    private final Distance distance;

    @Override
    public String getName() {
        return distance.toString();
    }

    @Override
    public List<Mesg> generateWorkout() {
        WorkoutMesg workout = new WorkoutMesg();
        workout.setNumValidSteps(1);
        workout.setWktName(getName());
        workout.setSport(Sport.RUNNING);
        workout.setCapabilities(32L);

        WorkoutStepMesg step = new WorkoutStepMesg();
        step.setIntensity(Intensity.ACTIVE);
        step.setDurationType(WktStepDuration.DISTANCE);
        step.setDurationDistance(distance.toGarminDistance());
        step.setTargetType(WktStepTarget.OPEN);
        step.setTargetValue(0L);

        List<Mesg> result = new ArrayList<>();
        result.add(workout);
        result.add(step);

        return result;
    }
}
