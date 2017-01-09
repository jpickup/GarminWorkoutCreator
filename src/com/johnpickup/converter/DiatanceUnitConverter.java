package com.johnpickup.converter;

import com.johnpickup.parser.DistanceUnit;

/**
 * Created by john on 09/01/2017.
 */
public class DiatanceUnitConverter {
    public static com.johnpickup.garmin.unit.DistanceUnit convert(DistanceUnit unit) {
        switch (unit) {
            case KILOMETRE:
                return com.johnpickup.garmin.unit.DistanceUnit.KILOMETRE;
            case METRE:
                return com.johnpickup.garmin.unit.DistanceUnit.METRE;
            case MILE:
                return com.johnpickup.garmin.unit.DistanceUnit.MILE;
            default:
                throw new RuntimeException("Unkown distance unit " + unit);
        }
    }
}
