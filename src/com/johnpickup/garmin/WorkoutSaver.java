package com.johnpickup.garmin;

import com.garmin.fit.FileEncoder;
import com.garmin.fit.Fit;
import com.johnpickup.garmin.fit.FitGenerator;

/**
 * Class that can save output from a FitGenerator to a fie
 */
public class WorkoutSaver {

    public void save(FitGenerator fitGenerator, String filename) {
        FileEncoder encode = new FileEncoder( new java.io.File(filename), Fit.ProtocolVersion.V1_0);
        encode.write(fitGenerator.generate());
        encode.close();
    }
}
