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
public class PaceRange extends Pace {
    private final Time minimum;
    private final Time maximum;
    private final PaceUnit unit;
}
