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
public class PaceIntervalWorkout extends WorkoutStep {
    private final int intervalCount;
    private final Distance intervalDistance;
    private final Distance recoveryDistance;
    private final PaceTarget intervalPaceTarget;
    private final PaceTarget recoveryPaceTarget;

    @Override
    public String getName() {
        return String.format("%dx%s %s", intervalCount, intervalDistance.toString(), intervalPaceTarget.toString());
    }

    @Override
    public List<Mesg> generateWorkout() {
        List<Mesg> result = new ArrayList<>();
        WorkoutMesg workout = new WorkoutMesg();
        workout.setWktName(getName());
        workout.setSport(Sport.RUNNING);
        workout.setCapabilities(32L);
        result.add(workout);
        int stepCount=0;
        
        WorkoutStepMesg intervalStep = new WorkoutStepMesg();
        intervalStep.setIntensity(Intensity.ACTIVE);
        intervalStep.setDurationType(WktStepDuration.DISTANCE);
        intervalStep.setDurationDistance(intervalDistance.toGarminDistance());
        intervalStep.setTargetType(WktStepTarget.SPEED);
        intervalStep.setTargetValue(0L);
        intervalStep.setCustomTargetValueLow(intervalPaceTarget.getGarminLow());
        intervalStep.setCustomTargetValueHigh(intervalPaceTarget.getGarminHigh());
        intervalStep.setMessageIndex(stepCount);
        int startIntervalIndex = stepCount;
        result.add(intervalStep);
        stepCount++;

        WorkoutStepMesg recoveryStep = new WorkoutStepMesg();
        recoveryStep.setIntensity(Intensity.ACTIVE);
        recoveryStep.setDurationType(WktStepDuration.DISTANCE);
        recoveryStep.setDurationDistance(recoveryDistance.toGarminDistance());
        recoveryStep.setTargetType(WktStepTarget.SPEED);
        recoveryStep.setTargetValue(0L);
        recoveryStep.setCustomTargetValueLow(recoveryPaceTarget.getGarminLow());
        recoveryStep.setCustomTargetValueHigh(recoveryPaceTarget.getGarminHigh());
        recoveryStep.setMessageIndex(stepCount);
        result.add(recoveryStep);
        stepCount++;

        WorkoutStepMesg repeatStep = new WorkoutStepMesg();
        repeatStep.setIntensity(Intensity.INVALID);
        repeatStep.setDurationType(WktStepDuration.REPEAT_UNTIL_STEPS_CMPLT);
        repeatStep.setDurationValue((long)startIntervalIndex);
        repeatStep.setTargetType(WktStepTarget.INVALID);
        repeatStep.setTargetValue((long)intervalCount);
        repeatStep.setMessageIndex(stepCount);
        result.add(repeatStep);
        stepCount++;

        workout.setNumValidSteps(stepCount);

        return result;
    }
}
