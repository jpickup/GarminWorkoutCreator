package com.johnpickup.parser;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Created by john on 03/01/2017.
 */
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class IntervalStep extends Step {
    private final Distance intervalDistance;
    private final Pace intervalPace;
    private final Distance recoveryDistance;
    private final Pace recoveryPace;
    private final int repetitions;

    public IntervalStep(PaceStep intervalPaceStep, PaceStep recoveryPaceStep, int repetitions) {
        intervalDistance = intervalPaceStep.getDistance();
        intervalPace = intervalPaceStep.getPace();
        recoveryDistance = recoveryPaceStep.getDistance();
        recoveryPace = recoveryPaceStep.getPace();
        this.repetitions = repetitions;
    }
}
