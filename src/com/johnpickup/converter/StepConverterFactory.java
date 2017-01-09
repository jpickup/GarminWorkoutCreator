package com.johnpickup.converter;

import com.johnpickup.parser.DistanceStep;
import com.johnpickup.parser.PaceStep;
import com.johnpickup.parser.RepeatingSteps;
import com.johnpickup.parser.Step;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by john on 09/01/2017.
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

    public void register(StepConverter converter,Class stepClass) {
        converters.put(stepClass, converter);
    }

    public StepConverter createFor(Step step) {
        return converters.get(step.getClass());
    }
}
