package com.johnpickup.garmin.workout;

import com.garmin.fit.*;
import com.johnpickup.garmin.fit.FitGenerator;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class WorkoutStep {
    protected abstract List<Mesg> generateWorkout();
    public abstract String getName();
}
