package com.johnpickup.garmin.schedule;

import com.garmin.fit.*;
import com.johnpickup.garmin.fit.FitGenerator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Collection of scheduled workouts that can be converted into a FIT message collection
 */
public class TrainingSchedule implements FitGenerator {
    private final List<ScheduledWorkout> workouts = new ArrayList<>();

    public void addScheduledWorkout(ScheduledWorkout workout) {
        workouts.add(workout);
    }

    protected List<Mesg> createMessageHeader() {
        List<Mesg> messages = new ArrayList<>();
        FileIdMesg fileIdMesg = new FileIdMesg();
        fileIdMesg.setManufacturer( Manufacturer.GARMIN );
        fileIdMesg.setType(File.SCHEDULES);
        fileIdMesg.setProduct(PRODUCT_ID);
        fileIdMesg.setSerialNumber(SERIAL_NO);
        fileIdMesg.setTimeCreated(new DateTime(new Date()));
        messages.add(fileIdMesg);

        FileCreatorMesg fileCreatorMesg = new FileCreatorMesg();
        fileCreatorMesg.setSoftwareVersion(SOFTWARE_VERSION);
        fileCreatorMesg.setHardwareVersion(HARDWARE_VERSION);
        messages.add(fileCreatorMesg);

        return messages;
    }

    @Override
    public List<Mesg> generate() {
        List<Mesg> messages = createMessageHeader();

        for (ScheduledWorkout scheduledWorkout : workouts) {
            ScheduleMesg scheduleMesg = new ScheduleMesg();
            scheduleMesg.setManufacturer(Manufacturer.GARMIN);
            scheduleMesg.setProduct(65534);
            scheduleMesg.setType(Schedule.WORKOUT);
            scheduleMesg.setTimeCreated(new DateTime(scheduledWorkout.getWorkout().getTimestamp()));
            scheduleMesg.setScheduledTime(scheduledWorkout.getGarminTime());
            scheduleMesg.setSerialNumber(SERIAL_NO);
            scheduleMesg.setCompleted(Bool.FALSE);
            messages.add(scheduleMesg);
        }

        return messages;
    }
}
