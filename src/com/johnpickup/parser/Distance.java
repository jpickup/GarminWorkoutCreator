package com.johnpickup.parser;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Created by john on 03/01/2017.
 */
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
public class Distance {
    private final double quantity;
    private final DistanceUnit unit;

}
