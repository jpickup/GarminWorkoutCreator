package com.johnpickup.parser;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Created by john on 03/01/2017.
 */
@ToString
@EqualsAndHashCode
public class MinimumPace extends PaceLimit {
    public MinimumPace(PaceLimit paceLimit) {
        super(paceLimit.getTime(), paceLimit.getUnit());
    }
}
