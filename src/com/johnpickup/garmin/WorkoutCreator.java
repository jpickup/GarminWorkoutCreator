package com.johnpickup.garmin;

import com.garmin.fit.*;
import com.johnpickup.garmin.fit.FitGenerator;
import com.johnpickup.garmin.schedule.ScheduledWorkout;
import com.johnpickup.garmin.schedule.TrainingSchedule;
import com.johnpickup.garmin.unit.*;
import com.johnpickup.garmin.workout.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by john on 19/11/2016.
 */
@Slf4j
public class WorkoutCreator {

    public void save(FitGenerator fitGenerator, String filename) {
        FileEncoder encode = new FileEncoder( new java.io.File(filename), Fit.ProtocolVersion.V1_0);
        encode.write(fitGenerator.generate());
        encode.close();
        log.info("Saved {} as {}", fitGenerator, filename);
    }

    public static void main(String[] args) {
        WorkoutCreator app = new WorkoutCreator();

        WorkoutStep testDistance = new SimpleDistanceWorkout(new Distance(2, DistanceUnit.MILE));
        Workout testDistanceWorkout = new Workout(Collections.singletonList(testDistance));
        app.save(testDistanceWorkout, "testDist.fit");

        WorkoutStep testPace = new SimplePaceWorkout(new Distance(2, DistanceUnit.MILE), new PaceTarget(null, 5, 6, PaceUnit.MIN_PER_MILE));
        Workout testPaceWorkout = new Workout(Collections.singletonList(testPace));
        app.save(testPaceWorkout, "testPace.fit");

        WorkoutStep testInterval = new PaceIntervalWorkout(
                4,
                new Distance(1, DistanceUnit.MILE),
                new Distance(400, DistanceUnit.METRE),
                new PaceTarget("Brisk", 5, 7, PaceUnit.MIN_PER_MILE),
                new PaceTarget(null, 9, 12, PaceUnit.MIN_PER_MILE));
        Workout testIntervalWorkout = new Workout(Collections.singletonList(testInterval));
        testIntervalWorkout.setName("4x1mi No WU");
        app.save(testIntervalWorkout, "testInterval1.fit");

        WorkoutStep warmcool = new SimpleDistanceWorkout(new Distance(1, DistanceUnit.KILOMETRE));
        WorkoutStep testInterval2 = new PaceIntervalWorkout(
                3,
                new Distance(1, DistanceUnit.KILOMETRE),
                new Distance(200, DistanceUnit.METRE),
                new PaceTarget("Fast", 4, 6, PaceUnit.MIN_PER_MILE),
                new PaceTarget(null, 9, 12, PaceUnit.MIN_PER_MILE));
        WorkoutStep[] interval2Steps = {warmcool, testInterval2, warmcool};

        Workout testIntervalWorkout2 = new Workout(Arrays.asList(interval2Steps));
        testIntervalWorkout2.setName("3x1km WUCD");
        app.save(testIntervalWorkout2, "testInterval2.fit");

        TrainingSchedule trainingSchedule = new TrainingSchedule();
        trainingSchedule.addScheduledWorkout(new ScheduledWorkout(testDistanceWorkout, new Date()));
        trainingSchedule.addScheduledWorkout(new ScheduledWorkout(testPaceWorkout, new Date(new Date().getTime() + TimeUnit.DAYS.toMillis(1))));
        //trainingSchedule.addScheduledWorkout(new ScheduledWorkout(testInterval, new Date(2017,1,3)));
        app.save(trainingSchedule, "testSchedule.fit");

    }
}
