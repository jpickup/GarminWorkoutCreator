package com.johnpickup.converter;

import com.johnpickup.parser.DistanceStep;
import com.johnpickup.parser.PaceStep;
import com.johnpickup.parser.RepeatingSteps;
import com.johnpickup.parser.Step;

import java.util.HashMap;
import java.util.Map;

/**
 * Factory that given a type of workout step with return an instance of the appropriate converter class
 */
public class StepConverterFactory {
    private static StepConverterFactory instance;
    private Map<Class, StepConverter> converters = new HashMap<>();

    private StepConverterFactory() {
        register(new DistanceStepConverter(), DistanceStep.class);
        register(new PaceStepConverter(), PaceStep.class);
        register(new RepeatingStepsConverter(), RepeatingSteps.class);
    }

    public static StepConverterFactory getInstance() {
        if (instance == null) {
            instance = new StepConverterFactory();
        }
        return instance;
    }

    private void register(StepConverter converter,Class stepClass) {
        converters.put(stepClass, converter);
    }

    public StepConverter createFor(Step step) {
        return converters.get(step.getClass());
    }
}
