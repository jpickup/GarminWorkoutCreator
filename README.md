# GarminWorkoutCreator
Create workouts and workout schedules for Garmin devices using an Excel spreadsheet to define them. 

What's the benefit? Why use this rather than Garmin Connect?

Garmin Connect allows you to build workouts and schedule them, however it's quite tedious to use it to build a long 
training programme, say the sort you would to train for a marathon. It's also not possible to take a programme that 
you've created and then reuse it to train for the next race.

The idea with this application is to allow the definition of workouts (using a simple text format) and a schedule 
which can then be transferred to a Garmin watch. This definition is created in Microsoft Excel, so the application 
simply translates the spreadsheet into a set of Garmin FIT files that can then be copied over to the watch.

## Workout Language
Workouts are defined as a series of steps, where a step is either a period of time or a distance. 
For example 10 minutes or 400 metres. A step can also have a target such as a pace or a heart rate. 
Steps are written as text, for example:

| `1mi` | A step of 1 mile |
| `400m` | A step of 400 metres |
| `100m@4:00-5:00/km` | A step of 100 metres with a target pace between 4 and 5 minutes per kilometre |
| `1mi>6mph` | 1 mile faster than 6 miles per hour |

Steps can also be strung together with a `+` character, repeated using `*n` and grouped using brackets, for example:
| `1mi + (400m@7:00-8:30/mi + 200m@10:00-12:00/mi) * 4 + 1mi` | An interval session comprising 4 repeats of 400m with 200m recoveries plus a mile of warm-up and cool-down |
 
More examples can be found in `ExampleWorkoutSchedule.xls` 

The grammar for the language is defined in `grammar/Workout.g4`, which is an ANTLR4 grammar that is used to generate 
Java code.

## Building
The ant build script is `GarminWorkoutCreator.iml`. This creates a macOS bundle with a JRE included meaning that it runs 
without the need for a Java installation on the target machine
