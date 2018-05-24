package com.johnpickup.garmin.unit;

import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * Heart Rate target - a minimum and maximum HR
 */
@EqualsAndHashCode
public class HeartRateTarget {
    @Getter
    private final HeartRate maxHeartRate;
    @Getter
    private final HeartRate minHeartRate;

    public HeartRateTarget(long min, long max, HeartRateUnit unit) {
        this.minHeartRate = new HeartRate(min, unit);
        this.maxHeartRate = new HeartRate(max, unit);
    }

    @Override
    public String toString() {
        return minHeartRate.toValueString() + "-" + maxHeartRate.toString();
    }

    public Long getGarminLow() {
        if (minHeartRate.toGarminHeartRate() < maxHeartRate.toGarminHeartRate())
            return minHeartRate.toGarminHeartRate();
        else
            return maxHeartRate.toGarminHeartRate();
    }

    public Long getGarminHigh() {
        if (minHeartRate.toGarminHeartRate() < maxHeartRate.toGarminHeartRate())
            return maxHeartRate.toGarminHeartRate();
        else
            return minHeartRate.toGarminHeartRate();
    }
}
