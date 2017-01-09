package com.johnpickup.parser;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * Created by john on 03/01/2017.
 */
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
public class Workout {
    private final List<? extends Step> steps;
}
