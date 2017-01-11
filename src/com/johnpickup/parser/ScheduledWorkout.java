package com.johnpickup.parser;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * Created by john on 11/01/2017.
 */
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class ScheduledWorkout {
    private final Date date;
    private final Workout workout;
}
