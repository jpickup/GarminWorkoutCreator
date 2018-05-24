// Generated from /Users/john/Development/GarminWorkoutCreator/grammar/Workout.g4 by ANTLR 4.7
package com.johnpickup.parser;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WorkoutParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WorkoutVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WorkoutParser#workout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWorkout(WorkoutParser.WorkoutContext ctx);
	/**
	 * Visit a parse tree produced by {@link WorkoutParser#stepList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStepList(WorkoutParser.StepListContext ctx);
	/**
	 * Visit a parse tree produced by {@link WorkoutParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(WorkoutParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link WorkoutParser#distance_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistance_step(WorkoutParser.Distance_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link WorkoutParser#distance_pace_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistance_pace_step(WorkoutParser.Distance_pace_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link WorkoutParser#distance_hr_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistance_hr_step(WorkoutParser.Distance_hr_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link WorkoutParser#time_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_step(WorkoutParser.Time_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link WorkoutParser#time_pace_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_pace_step(WorkoutParser.Time_pace_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link WorkoutParser#time_hr_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_hr_step(WorkoutParser.Time_hr_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link WorkoutParser#repeating_steps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeating_steps(WorkoutParser.Repeating_stepsContext ctx);
	/**
	 * Visit a parse tree produced by {@link WorkoutParser#distance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistance(WorkoutParser.DistanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link WorkoutParser#distance_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistance_unit(WorkoutParser.Distance_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link WorkoutParser#pace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPace(WorkoutParser.PaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link WorkoutParser#pace_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPace_range(WorkoutParser.Pace_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WorkoutParser#hr_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHr_range(WorkoutParser.Hr_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WorkoutParser#hr_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHr_unit(WorkoutParser.Hr_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link WorkoutParser#hr_zone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHr_zone(WorkoutParser.Hr_zoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link WorkoutParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(WorkoutParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WorkoutParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(WorkoutParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link WorkoutParser#cardinal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCardinal(WorkoutParser.CardinalContext ctx);
	/**
	 * Visit a parse tree produced by {@link WorkoutParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(WorkoutParser.NameContext ctx);
}