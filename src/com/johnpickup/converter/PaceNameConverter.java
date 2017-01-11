package com.johnpickup.converter;

import com.johnpickup.garmin.unit.PaceTarget;
import com.johnpickup.garmin.unit.PaceUnit;
import com.johnpickup.parser.Pace;
import com.johnpickup.parser.PaceName;
import com.johnpickup.parser.PaceRange;
import lombok.RequiredArgsConstructor;

import java.util.Map;

/**
 * Convert an independent pace range into a Garmin pace target
 */
@RequiredArgsConstructor
public class PaceNameConverter implements PaceConverter {
    private final Map<String, PaceTarget> namedPaceTargets;
    @Override
    public PaceTarget convert(Pace pace) {
        PaceName paceName = (PaceName)pace;
        return namedPaceTargets.get(paceName.getName());
    }
}
