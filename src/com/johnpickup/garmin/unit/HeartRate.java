package com.johnpickup.garmin.unit;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * Encapsulation of various pace/speed standards with human-readable toString plus a conversion to Garmin units
 */
@RequiredArgsConstructor
@EqualsAndHashCode
public class HeartRate {
    private final long value;
    private final HeartRateUnit unit;

    @Override
    public String toString() {
        return String.format("%s%s", toValueString(), unit.getShortName());
    }

    public Long toGarminHeartRate() {
        // Garmin HR units are in bpm + 100 ( 0 .. 100 reserved for HR zones)
        switch (unit) {
            case BEATS_PER_MINUTE: return value + 100;
        }
        return null;
    }

    public String toValueString() {
        switch (unit) {
            case BEATS_PER_MINUTE:
                return String.format("%d", value);
        }
        return null;
    }
}
