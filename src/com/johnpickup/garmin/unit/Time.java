package com.johnpickup.garmin.unit;

import lombok.RequiredArgsConstructor;

/**
 * Garmin time unit. value is in seconds.
 * Value in fit files is in milliseconds so we multiply by 1000 when emitting this
 */
@RequiredArgsConstructor
public class Time {
    private final double value;
    public Float toGarminTime() {
        return (float)(value * 1000);
    }
}
