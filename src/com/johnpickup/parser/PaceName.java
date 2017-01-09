package com.johnpickup.parser;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Created by john on 07/01/2017.
 */
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
public class PaceName implements Pace {
    private final String name;
}
