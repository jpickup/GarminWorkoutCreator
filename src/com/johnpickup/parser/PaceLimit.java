package com.johnpickup.parser;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Created by john on 03/01/2017.
 */
@RequiredArgsConstructor
@EqualsAndHashCode
public class PaceLimit implements Pace {
    @Getter
    private final Time time;
    @Getter
    private final PaceUnit unit;

    @Override
    public String toString() {
        return String.format("%s%s", getTime(), getUnit());
    }
}
