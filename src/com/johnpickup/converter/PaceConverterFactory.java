package com.johnpickup.converter;

import com.johnpickup.parser.Pace;
import com.johnpickup.parser.PaceRange;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by john on 09/01/2017.
 */
public class PaceConverterFactory {
    private static PaceConverterFactory instance;
    private Map<Class, PaceConverter> converters = new HashMap<>();

    private PaceConverterFactory() {
        register(new PaceRangeConverter(), PaceRange.class);
    }

    private void register(PaceConverter converter, Class aClass) {
        converters.put(aClass, converter);
    }

    public static PaceConverterFactory getInstance() {
        if (instance == null) {
            instance = new PaceConverterFactory();
        }
        return instance;
    }

    public PaceConverter getPaceConverter(Pace pace) {
        return converters.get(pace.getClass());
    }
}
