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
@EqualsAndHashCode
public class SimplePaceWorkout extends WorkoutStep {
    private final Distance distance;
    private final PaceTarget paceTarget;

    @Override
    public String getName() {
        return distance.toString() + " " + paceTarget.toString();
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
        step.setTargetType(WktStepTarget.SPEED);
        step.setTargetValue(0L);
        step.setCustomTargetValueLow(paceTarget.getGarminLow());
        step.setCustomTargetValueHigh(paceTarget.getGarminHigh());

        List<Mesg> result = new ArrayList<>();
        result.add(workout);
        result.add(step);

        return result;
    }
}
