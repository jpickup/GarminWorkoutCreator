package com.johnpickup.parser;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class HeartRateZone implements HeartRate {
    private final Zone zone;
    private HeartRateZone(Zone zone) {
        this.zone = zone;
    }

    public static HeartRateZone Z1 = new HeartRateZone(Zone.Z1);
    public static HeartRateZone Z2 = new HeartRateZone(Zone.Z2);
    public static HeartRateZone Z3 = new HeartRateZone(Zone.Z3);
    public static HeartRateZone Z4 = new HeartRateZone(Zone.Z4);
    public static HeartRateZone Z5 = new HeartRateZone(Zone.Z5);

    @Override
    public String toString() {
        return zone.name();
    }

    enum Zone {
        Z1,
        Z2,
        Z3,
        Z4,
        Z5
    }
}
