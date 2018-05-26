# GarminWorkoutCreator
Create workouts and workout schedules for Garmin devices using an Excel spreadsheet to define them. 

What's the benefit? Why use this rather than Garmin Connect?

Garmin Connect allows you to build workouts and schedule them, however it's quite tedious to use it to build a long training programme, say the sort you would to train for a marathon. It's also not possible to take a programme that you've created and then reuse it to train for the next race.

The idea with this application is to allow the definition of workouts (using a simple text format) and a schedule which can then be transfered to a Garmin watch. This definition is created in Microsoft Excel, so the application simply translates the spreadhsheet into a set of Garmin FIT files that can then be copied over to the watch.

## Workout Language
Workouts are defined as a series of steps, where a step is either a period of time or a distance. For example 10 minutes or 400 metres. A step can also have a target such as a pace or a heart rate. 
