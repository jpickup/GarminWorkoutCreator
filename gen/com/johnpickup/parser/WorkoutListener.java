// Generated from /Users/john/Development/GarminWorkoutCreator/grammar/Workout.g4 by ANTLR 4.7
package com.johnpickup.parser;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WorkoutParser}.
 */
public interface WorkoutListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WorkoutParser#workout}.
	 * @param ctx the parse tree
	 */
	void enterWorkout(WorkoutParser.WorkoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkoutParser#workout}.
	 * @param ctx the parse tree
	 */
	void exitWorkout(WorkoutParser.WorkoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorkoutParser#stepList}.
	 * @param ctx the parse tree
	 */
	void enterStepList(WorkoutParser.StepListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkoutParser#stepList}.
	 * @param ctx the parse tree
	 */
	void exitStepList(WorkoutParser.StepListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorkoutParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(WorkoutParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkoutParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(WorkoutParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorkoutParser#distance_step}.
	 * @param ctx the parse tree
	 */
	void enterDistance_step(WorkoutParser.Distance_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkoutParser#distance_step}.
	 * @param ctx the parse tree
	 */
	void exitDistance_step(WorkoutParser.Distance_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorkoutParser#distance_pace_step}.
	 * @param ctx the parse tree
	 */
	void enterDistance_pace_step(WorkoutParser.Distance_pace_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkoutParser#distance_pace_step}.
	 * @param ctx the parse tree
	 */
	void exitDistance_pace_step(WorkoutParser.Distance_pace_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorkoutParser#distance_hr_step}.
	 * @param ctx the parse tree
	 */
	void enterDistance_hr_step(WorkoutParser.Distance_hr_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkoutParser#distance_hr_step}.
	 * @param ctx the parse tree
	 */
	void exitDistance_hr_step(WorkoutParser.Distance_hr_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorkoutParser#time_step}.
	 * @param ctx the parse tree
	 */
	void enterTime_step(WorkoutParser.Time_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkoutParser#time_step}.
	 * @param ctx the parse tree
	 */
	void exitTime_step(WorkoutParser.Time_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorkoutParser#time_pace_step}.
	 * @param ctx the parse tree
	 */
	void enterTime_pace_step(WorkoutParser.Time_pace_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkoutParser#time_pace_step}.
	 * @param ctx the parse tree
	 */
	void exitTime_pace_step(WorkoutParser.Time_pace_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorkoutParser#time_hr_step}.
	 * @param ctx the parse tree
	 */
	void enterTime_hr_step(WorkoutParser.Time_hr_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkoutParser#time_hr_step}.
	 * @param ctx the parse tree
	 */
	void exitTime_hr_step(WorkoutParser.Time_hr_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorkoutParser#repeating_steps}.
	 * @param ctx the parse tree
	 */
	void enterRepeating_steps(WorkoutParser.Repeating_stepsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkoutParser#repeating_steps}.
	 * @param ctx the parse tree
	 */
	void exitRepeating_steps(WorkoutParser.Repeating_stepsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorkoutParser#distance}.
	 * @param ctx the parse tree
	 */
	void enterDistance(WorkoutParser.DistanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkoutParser#distance}.
	 * @param ctx the parse tree
	 */
	void exitDistance(WorkoutParser.DistanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorkoutParser#distance_unit}.
	 * @param ctx the parse tree
	 */
	void enterDistance_unit(WorkoutParser.Distance_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkoutParser#distance_unit}.
	 * @param ctx the parse tree
	 */
	void exitDistance_unit(WorkoutParser.Distance_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorkoutParser#pace}.
	 * @param ctx the parse tree
	 */
	void enterPace(WorkoutParser.PaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkoutParser#pace}.
	 * @param ctx the parse tree
	 */
	void exitPace(WorkoutParser.PaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorkoutParser#pace_range}.
	 * @param ctx the parse tree
	 */
	void enterPace_range(WorkoutParser.Pace_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkoutParser#pace_range}.
	 * @param ctx the parse tree
	 */
	void exitPace_range(WorkoutParser.Pace_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorkoutParser#hr_range}.
	 * @param ctx the parse tree
	 */
	void enterHr_range(WorkoutParser.Hr_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkoutParser#hr_range}.
	 * @param ctx the parse tree
	 */
	void exitHr_range(WorkoutParser.Hr_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorkoutParser#hr_unit}.
	 * @param ctx the parse tree
	 */
	void enterHr_unit(WorkoutParser.Hr_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkoutParser#hr_unit}.
	 * @param ctx the parse tree
	 */
	void exitHr_unit(WorkoutParser.Hr_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorkoutParser#hr_zone}.
	 * @param ctx the parse tree
	 */
	void enterHr_zone(WorkoutParser.Hr_zoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkoutParser#hr_zone}.
	 * @param ctx the parse tree
	 */
	void exitHr_zone(WorkoutParser.Hr_zoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorkoutParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(WorkoutParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkoutParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(WorkoutParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorkoutParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(WorkoutParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkoutParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(WorkoutParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorkoutParser#cardinal}.
	 * @param ctx the parse tree
	 */
	void enterCardinal(WorkoutParser.CardinalContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkoutParser#cardinal}.
	 * @param ctx the parse tree
	 */
	void exitCardinal(WorkoutParser.CardinalContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorkoutParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(WorkoutParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorkoutParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(WorkoutParser.NameContext ctx);
}