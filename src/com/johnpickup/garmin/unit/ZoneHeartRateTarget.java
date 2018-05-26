package com.johnpickup.garmin.unit;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ZoneHeartRateTarget extends HeartRateTarget {
    private final Long zone;

    @Override
    public Long getGarminLow() {
        return zone;
    }

    @Override
    public Long getGarminHigh() {
        return 0L;
    }

    @Override
    public Long getTargetValue() {
        return 0L;
    }
}
