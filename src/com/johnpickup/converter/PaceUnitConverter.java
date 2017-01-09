package com.johnpickup.converter;

import com.johnpickup.parser.PaceUnit;

/**
 * Created by john on 09/01/2017.
 */
public class PaceUnitConverter {
    public static com.johnpickup.garmin.unit.PaceUnit convert(PaceUnit unit) {
        switch (unit) {
            case KILOMETRE_PER_HOUR:
                return com.johnpickup.garmin.unit.PaceUnit.KILOMETRE_PER_HOUR;
            case MILE_PER_HOUR:
                return com.johnpickup.garmin.unit.PaceUnit.MILE_PER_HOUR;
            case MIN_PER_KILOMETRE:
                return com.johnpickup.garmin.unit.PaceUnit.MIN_PER_KILOMETRE;
            case MIN_PER_MILE:
                return com.johnpickup.garmin.unit.PaceUnit.MIN_PER_MILE;
            default:
                throw new RuntimeException("Unknown pace unit " + unit);
        }
    }
}
