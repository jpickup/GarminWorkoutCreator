package com.johnpickup.parser;

import lombok.EqualsAndHashCode;
import lombok.Getter;
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
    @Getter
    private final Date date;
    @Getter
    private final Workout workout;
}
