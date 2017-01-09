package com.johnpickup.converter;

import com.johnpickup.garmin.unit.PaceTarget;
import com.johnpickup.parser.Pace;

/**
 * Created by john on 09/01/2017.
 */
public interface PaceConverter {
    PaceTarget convert(Pace pace);
}
