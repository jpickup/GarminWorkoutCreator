package com.johnpickup.parser;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john on 03/01/2017.
 */
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class RepeatingSteps extends Step {
    @Getter
    private final List<Step> steps = new ArrayList<>();
    @Getter
    @Setter
    private int repetitions = 1;

    public RepeatingSteps(Step firstStep) {
        steps.add(firstStep);
    }

    public void addStep(Step step) {
        steps.add(step);
    }
}
