package com.johnpickup.parser;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Created by john on 03/01/2017.
 */
@EqualsAndHashCode
@RequiredArgsConstructor
@ToString
public class Time {
    private final Integer minutes;
    private final Integer seconds;

    public static Time parseTime(String text) {
        String[] parts = text.split(":");
        if (parts.length == 2) {
            return new Time(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
        }
        else {
            throw new RuntimeException("Invalid time " + text);
        }
    }

    public Double asDouble() {
        if (minutes != null && seconds != null) {
            return minutes + (seconds * 1.0)/60;
        }
        return null;
    }
}
