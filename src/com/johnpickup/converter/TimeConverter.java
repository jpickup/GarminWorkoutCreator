package com.johnpickup.converter;

import com.johnpickup.parser.Time;

/**
 * Created by john on 09/01/2017.
 */
public class TimeConverter {
    public static double convert(Time time) {
        return time.asDouble();
    }
}
