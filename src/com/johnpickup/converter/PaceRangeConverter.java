package com.johnpickup.converter;

import com.johnpickup.garmin.unit.PaceTarget;
import com.johnpickup.garmin.unit.PaceUnit;
import com.johnpickup.parser.Pace;
import com.johnpickup.parser.PaceRange;

/**
 * Created by john on 09/01/2017.
 */
public class PaceRangeConverter implements PaceConverter {
    @Override
    public PaceTarget convert(Pace pace) {
        PaceRange paceRange = (PaceRange)pace;
        double min = TimeConverter.convert(paceRange.getMinimum());
        double max = TimeConverter.convert(paceRange.getMaximum());
        PaceUnit unit = PaceUnitConverter.convert(paceRange.getUnit());
        return new PaceTarget(min, max, unit);
    }
}
