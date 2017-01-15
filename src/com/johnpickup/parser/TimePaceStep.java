package com.johnpickup.parser;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Created by john on 03/01/2017.
 */
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class TimePaceStep extends Step {
    @Getter
    private final Time time;
    @Getter
    private final Pace pace;
}
