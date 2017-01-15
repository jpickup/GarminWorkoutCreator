/*
WORKOUT GRAMMAR
Examples:
    1 mi                        - 1 mile with no pace target
    2 mi@STEADY                 - 2 miles as a named pace target
    3 km < 5:00/km              - 3km faster than 5 minutes per km
    8 km @ 5:00 - 7:00 / km     - 8km at a pace target defined as a range
    (1 mi@FAST + 400m@EASY) * 8 - interval session of 8 repeats of 1 mile fast with 400m recoveries
*/

grammar Workout;

@header {
import java.util.ArrayList;
}

workout returns [Workout w]
   : stepList           {$w = new Workout($stepList.steps);}
   ;

stepList returns [List<Step> steps]
   : s0=step {$steps = new ArrayList<>(); $steps.add($s0.value);}
     ('+' s1=step       {$steps.add($s1.value);})*
   ;
    
step returns [Step value]
   : distance_step      {$value = $distance_step.value;}
   | distance_pace_step {$value = $distance_pace_step.value;}
   | time_step          {$value = $time_step.value;}
   | time_pace_step     {$value = $time_pace_step.value;}
   | repeating_steps    {$value = $repeating_steps.value;}
   ;
   
distance_step returns [DistanceStep value]
   : distance           {$value = new DistanceStep($distance.value);}
   ;

distance_pace_step returns [DistancePaceStep value]
   : distance '<' pace          {$value = new DistancePaceStep($distance.value, new MaximumPace($pace.value));}
   | distance '>' pace          {$value = new DistancePaceStep($distance.value, new MinimumPace($pace.value));}
   | distance '@' pace_range    {$value = new DistancePaceStep($distance.value, $pace_range.value);}
   ;

time_step returns [TimeStep value]
   : time               {$value = new TimeStep($time.value);}
   ;

time_pace_step returns [TimePaceStep value]
   : time '<' pace          {$value = new TimePaceStep($time.value, new MaximumPace($pace.value));}
   | time '>' pace          {$value = new TimePaceStep($time.value, new MinimumPace($pace.value));}
   | time '@' pace_range    {$value = new TimePaceStep($time.value, $pace_range.value);}
   ;

repeating_steps returns [RepeatingSteps value]
   : '('
     s1=step            {$value = new RepeatingSteps($s1.value);}
     ('+' s2=step )*    {$value.addStep($s2.value);}
     ')'
     '*' cardinal       {$value.setRepetitions($cardinal.value);}
   ;
    
distance returns [Distance value]
   : number distance_unit   {$value = new Distance($number.value, $distance_unit.value);}
   ;
   
distance_unit returns [DistanceUnit value]
   : 'm'                {$value = DistanceUnit.METRE;}
   | 'mi'               {$value =  DistanceUnit.MILE;}
   | 'km'               {$value =  DistanceUnit.KILOMETRE;}
   ;

pace returns [PaceLimit value]
   : time '/' distance_unit {$value = new PaceLimit($time.value, PaceUnit.perDistanceUnit($distance_unit.value));}
   ;
   
pace_range returns [Pace value]
   : t1=time '-' t2=time '/' distance_unit      {$value = new PaceRange($t1.value, $t2.value, PaceUnit.perDistanceUnit($distance_unit.value));}
   | name                                       {$value = new PaceName($text);}
   ;
     
time returns [Time value]
   : DIGIT + COLON DIGIT DIGIT {$value = Time.parseTime($text);}
   ;
     

number returns [double value]
   : DIGIT + (POINT DIGIT +)?   {$value = Double.parseDouble($text);}
   ;

cardinal returns [int value]
   : DIGIT +            {$value = Integer.parseInt($text);}
   ;

name
   : LETTER (LETTER | DIGIT)*
   ;

LETTER
   : ('a' .. 'z') | ('A' .. 'Z')
   ;


DIGIT
   : ('0' .. '9')
   ;


POINT
   : '.'
   ;
   
COLON
   : ':'
   ;


WS
   : [ \r\n] -> skip
   ;
