// Generated from /Users/john/Development/GarminWorkoutCreator/grammar/Workout.g4 by ANTLR 4.7
package com.johnpickup.parser;

import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WorkoutParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, LETTER=19, DIGIT=20, POINT=21, COLON=22, WS=23;
	public static final int
		RULE_workout = 0, RULE_stepList = 1, RULE_step = 2, RULE_distance_step = 3, 
		RULE_distance_pace_step = 4, RULE_distance_hr_step = 5, RULE_time_step = 6, 
		RULE_time_pace_step = 7, RULE_time_hr_step = 8, RULE_repeating_steps = 9, 
		RULE_distance = 10, RULE_distance_unit = 11, RULE_pace = 12, RULE_pace_range = 13, 
		RULE_hr_range = 14, RULE_hr_unit = 15, RULE_hr_zone = 16, RULE_time = 17, 
		RULE_number = 18, RULE_cardinal = 19, RULE_name = 20;
	public static final String[] ruleNames = {
		"workout", "stepList", "step", "distance_step", "distance_pace_step", 
		"distance_hr_step", "time_step", "time_pace_step", "time_hr_step", "repeating_steps", 
		"distance", "distance_unit", "pace", "pace_range", "hr_range", "hr_unit", 
		"hr_zone", "time", "number", "cardinal", "name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'<'", "'>'", "'@'", "'('", "')'", "'*'", "'m'", "'mi'", 
		"'km'", "'/'", "'-'", "'bpm'", "'Z1'", "'Z2'", "'Z3'", "'Z4'", "'Z5'", 
		null, null, "'.'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "LETTER", "DIGIT", "POINT", 
		"COLON", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Workout.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WorkoutParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class WorkoutContext extends ParserRuleContext {
		public Workout w;
		public StepListContext stepList;
		public StepListContext stepList() {
			return getRuleContext(StepListContext.class,0);
		}
		public WorkoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_workout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterWorkout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitWorkout(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitWorkout(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WorkoutContext workout() throws RecognitionException {
		WorkoutContext _localctx = new WorkoutContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_workout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			((WorkoutContext)_localctx).stepList = stepList();
			((WorkoutContext)_localctx).w =  new Workout(((WorkoutContext)_localctx).stepList.steps);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StepListContext extends ParserRuleContext {
		public List<Step> steps;
		public StepContext s0;
		public StepContext s1;
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public StepListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stepList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterStepList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitStepList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitStepList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepListContext stepList() throws RecognitionException {
		StepListContext _localctx = new StepListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stepList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			((StepListContext)_localctx).s0 = step();
			((StepListContext)_localctx).steps =  new ArrayList<>(); _localctx.steps.add(((StepListContext)_localctx).s0.value);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(47);
				match(T__0);
				setState(48);
				((StepListContext)_localctx).s1 = step();
				_localctx.steps.add(((StepListContext)_localctx).s1.value);
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StepContext extends ParserRuleContext {
		public Step value;
		public Distance_stepContext distance_step;
		public Distance_pace_stepContext distance_pace_step;
		public Distance_hr_stepContext distance_hr_step;
		public Time_stepContext time_step;
		public Time_pace_stepContext time_pace_step;
		public Time_hr_stepContext time_hr_step;
		public Repeating_stepsContext repeating_steps;
		public Distance_stepContext distance_step() {
			return getRuleContext(Distance_stepContext.class,0);
		}
		public Distance_pace_stepContext distance_pace_step() {
			return getRuleContext(Distance_pace_stepContext.class,0);
		}
		public Distance_hr_stepContext distance_hr_step() {
			return getRuleContext(Distance_hr_stepContext.class,0);
		}
		public Time_stepContext time_step() {
			return getRuleContext(Time_stepContext.class,0);
		}
		public Time_pace_stepContext time_pace_step() {
			return getRuleContext(Time_pace_stepContext.class,0);
		}
		public Time_hr_stepContext time_hr_step() {
			return getRuleContext(Time_hr_stepContext.class,0);
		}
		public Repeating_stepsContext repeating_steps() {
			return getRuleContext(Repeating_stepsContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_step);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				((StepContext)_localctx).distance_step = distance_step();
				((StepContext)_localctx).value =  ((StepContext)_localctx).distance_step.value;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				((StepContext)_localctx).distance_pace_step = distance_pace_step();
				((StepContext)_localctx).value =  ((StepContext)_localctx).distance_pace_step.value;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				((StepContext)_localctx).distance_hr_step = distance_hr_step();
				((StepContext)_localctx).value =  ((StepContext)_localctx).distance_hr_step.value;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				((StepContext)_localctx).time_step = time_step();
				((StepContext)_localctx).value =  ((StepContext)_localctx).time_step.value;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				((StepContext)_localctx).time_pace_step = time_pace_step();
				((StepContext)_localctx).value =  ((StepContext)_localctx).time_pace_step.value;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				((StepContext)_localctx).time_hr_step = time_hr_step();
				((StepContext)_localctx).value =  ((StepContext)_localctx).time_hr_step.value;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				((StepContext)_localctx).repeating_steps = repeating_steps();
				((StepContext)_localctx).value =  ((StepContext)_localctx).repeating_steps.value;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Distance_stepContext extends ParserRuleContext {
		public DistanceStep value;
		public DistanceContext distance;
		public DistanceContext distance() {
			return getRuleContext(DistanceContext.class,0);
		}
		public Distance_stepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distance_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterDistance_step(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitDistance_step(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitDistance_step(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Distance_stepContext distance_step() throws RecognitionException {
		Distance_stepContext _localctx = new Distance_stepContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_distance_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			((Distance_stepContext)_localctx).distance = distance();
			((Distance_stepContext)_localctx).value =  new DistanceStep(((Distance_stepContext)_localctx).distance.value);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Distance_pace_stepContext extends ParserRuleContext {
		public DistancePaceStep value;
		public DistanceContext distance;
		public PaceContext pace;
		public Pace_rangeContext pace_range;
		public DistanceContext distance() {
			return getRuleContext(DistanceContext.class,0);
		}
		public PaceContext pace() {
			return getRuleContext(PaceContext.class,0);
		}
		public Pace_rangeContext pace_range() {
			return getRuleContext(Pace_rangeContext.class,0);
		}
		public Distance_pace_stepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distance_pace_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterDistance_pace_step(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitDistance_pace_step(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitDistance_pace_step(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Distance_pace_stepContext distance_pace_step() throws RecognitionException {
		Distance_pace_stepContext _localctx = new Distance_pace_stepContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_distance_pace_step);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				((Distance_pace_stepContext)_localctx).distance = distance();
				setState(83);
				match(T__1);
				setState(84);
				((Distance_pace_stepContext)_localctx).pace = pace();
				((Distance_pace_stepContext)_localctx).value =  new DistancePaceStep(((Distance_pace_stepContext)_localctx).distance.value, new MaximumPace(((Distance_pace_stepContext)_localctx).pace.value));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				((Distance_pace_stepContext)_localctx).distance = distance();
				setState(88);
				match(T__2);
				setState(89);
				((Distance_pace_stepContext)_localctx).pace = pace();
				((Distance_pace_stepContext)_localctx).value =  new DistancePaceStep(((Distance_pace_stepContext)_localctx).distance.value, new MinimumPace(((Distance_pace_stepContext)_localctx).pace.value));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				((Distance_pace_stepContext)_localctx).distance = distance();
				setState(93);
				match(T__3);
				setState(94);
				((Distance_pace_stepContext)_localctx).pace_range = pace_range();
				((Distance_pace_stepContext)_localctx).value =  new DistancePaceStep(((Distance_pace_stepContext)_localctx).distance.value, ((Distance_pace_stepContext)_localctx).pace_range.value);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Distance_hr_stepContext extends ParserRuleContext {
		public DistanceHeartRateStep value;
		public DistanceContext distance;
		public Hr_rangeContext hr_range;
		public Hr_zoneContext hr_zone;
		public DistanceContext distance() {
			return getRuleContext(DistanceContext.class,0);
		}
		public Hr_rangeContext hr_range() {
			return getRuleContext(Hr_rangeContext.class,0);
		}
		public Hr_zoneContext hr_zone() {
			return getRuleContext(Hr_zoneContext.class,0);
		}
		public Distance_hr_stepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distance_hr_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterDistance_hr_step(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitDistance_hr_step(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitDistance_hr_step(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Distance_hr_stepContext distance_hr_step() throws RecognitionException {
		Distance_hr_stepContext _localctx = new Distance_hr_stepContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_distance_hr_step);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				((Distance_hr_stepContext)_localctx).distance = distance();
				setState(100);
				match(T__3);
				setState(101);
				((Distance_hr_stepContext)_localctx).hr_range = hr_range();
				((Distance_hr_stepContext)_localctx).value =  new DistanceHeartRateStep(((Distance_hr_stepContext)_localctx).distance.value, ((Distance_hr_stepContext)_localctx).hr_range.value);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				((Distance_hr_stepContext)_localctx).distance = distance();
				setState(105);
				match(T__3);
				setState(106);
				((Distance_hr_stepContext)_localctx).hr_zone = hr_zone();
				((Distance_hr_stepContext)_localctx).value =  new DistanceHeartRateStep(((Distance_hr_stepContext)_localctx).distance.value, ((Distance_hr_stepContext)_localctx).hr_zone.value);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_stepContext extends ParserRuleContext {
		public TimeStep value;
		public TimeContext time;
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public Time_stepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterTime_step(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitTime_step(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitTime_step(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_stepContext time_step() throws RecognitionException {
		Time_stepContext _localctx = new Time_stepContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_time_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			((Time_stepContext)_localctx).time = time();
			((Time_stepContext)_localctx).value =  new TimeStep(((Time_stepContext)_localctx).time.value);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_pace_stepContext extends ParserRuleContext {
		public TimePaceStep value;
		public TimeContext time;
		public PaceContext pace;
		public Pace_rangeContext pace_range;
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public PaceContext pace() {
			return getRuleContext(PaceContext.class,0);
		}
		public Pace_rangeContext pace_range() {
			return getRuleContext(Pace_rangeContext.class,0);
		}
		public Time_pace_stepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_pace_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterTime_pace_step(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitTime_pace_step(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitTime_pace_step(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_pace_stepContext time_pace_step() throws RecognitionException {
		Time_pace_stepContext _localctx = new Time_pace_stepContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_time_pace_step);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				((Time_pace_stepContext)_localctx).time = time();
				setState(115);
				match(T__1);
				setState(116);
				((Time_pace_stepContext)_localctx).pace = pace();
				((Time_pace_stepContext)_localctx).value =  new TimePaceStep(((Time_pace_stepContext)_localctx).time.value, new MaximumPace(((Time_pace_stepContext)_localctx).pace.value));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				((Time_pace_stepContext)_localctx).time = time();
				setState(120);
				match(T__2);
				setState(121);
				((Time_pace_stepContext)_localctx).pace = pace();
				((Time_pace_stepContext)_localctx).value =  new TimePaceStep(((Time_pace_stepContext)_localctx).time.value, new MinimumPace(((Time_pace_stepContext)_localctx).pace.value));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				((Time_pace_stepContext)_localctx).time = time();
				setState(125);
				match(T__3);
				setState(126);
				((Time_pace_stepContext)_localctx).pace_range = pace_range();
				((Time_pace_stepContext)_localctx).value =  new TimePaceStep(((Time_pace_stepContext)_localctx).time.value, ((Time_pace_stepContext)_localctx).pace_range.value);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_hr_stepContext extends ParserRuleContext {
		public TimeHeartRateStep value;
		public TimeContext time;
		public Hr_rangeContext hr_range;
		public Hr_zoneContext hr_zone;
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public Hr_rangeContext hr_range() {
			return getRuleContext(Hr_rangeContext.class,0);
		}
		public Hr_zoneContext hr_zone() {
			return getRuleContext(Hr_zoneContext.class,0);
		}
		public Time_hr_stepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_hr_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterTime_hr_step(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitTime_hr_step(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitTime_hr_step(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_hr_stepContext time_hr_step() throws RecognitionException {
		Time_hr_stepContext _localctx = new Time_hr_stepContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_time_hr_step);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				((Time_hr_stepContext)_localctx).time = time();
				setState(132);
				match(T__3);
				setState(133);
				((Time_hr_stepContext)_localctx).hr_range = hr_range();
				((Time_hr_stepContext)_localctx).value =  new TimeHeartRateStep(((Time_hr_stepContext)_localctx).time.value, ((Time_hr_stepContext)_localctx).hr_range.value);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				((Time_hr_stepContext)_localctx).time = time();
				setState(137);
				match(T__3);
				setState(138);
				((Time_hr_stepContext)_localctx).hr_zone = hr_zone();
				((Time_hr_stepContext)_localctx).value =  new TimeHeartRateStep(((Time_hr_stepContext)_localctx).time.value, ((Time_hr_stepContext)_localctx).hr_zone.value);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Repeating_stepsContext extends ParserRuleContext {
		public RepeatingSteps value;
		public StepContext s1;
		public StepContext s2;
		public CardinalContext cardinal;
		public CardinalContext cardinal() {
			return getRuleContext(CardinalContext.class,0);
		}
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public Repeating_stepsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeating_steps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterRepeating_steps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitRepeating_steps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitRepeating_steps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeating_stepsContext repeating_steps() throws RecognitionException {
		Repeating_stepsContext _localctx = new Repeating_stepsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_repeating_steps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__4);
			setState(144);
			((Repeating_stepsContext)_localctx).s1 = step();
			((Repeating_stepsContext)_localctx).value =  new RepeatingSteps(((Repeating_stepsContext)_localctx).s1.value);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(146);
				match(T__0);
				setState(147);
				((Repeating_stepsContext)_localctx).s2 = step();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_localctx.value.addStep(((Repeating_stepsContext)_localctx).s2.value);
			setState(154);
			match(T__5);
			setState(155);
			match(T__6);
			setState(156);
			((Repeating_stepsContext)_localctx).cardinal = cardinal();
			_localctx.value.setRepetitions(((Repeating_stepsContext)_localctx).cardinal.value);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DistanceContext extends ParserRuleContext {
		public Distance value;
		public NumberContext number;
		public Distance_unitContext distance_unit;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Distance_unitContext distance_unit() {
			return getRuleContext(Distance_unitContext.class,0);
		}
		public DistanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterDistance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitDistance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitDistance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistanceContext distance() throws RecognitionException {
		DistanceContext _localctx = new DistanceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_distance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			((DistanceContext)_localctx).number = number();
			setState(160);
			((DistanceContext)_localctx).distance_unit = distance_unit();
			((DistanceContext)_localctx).value =  new Distance(((DistanceContext)_localctx).number.value, ((DistanceContext)_localctx).distance_unit.value);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Distance_unitContext extends ParserRuleContext {
		public DistanceUnit value;
		public Distance_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distance_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterDistance_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitDistance_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitDistance_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Distance_unitContext distance_unit() throws RecognitionException {
		Distance_unitContext _localctx = new Distance_unitContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_distance_unit);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(T__7);
				((Distance_unitContext)_localctx).value =  DistanceUnit.METRE;
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(T__8);
				((Distance_unitContext)_localctx).value =  DistanceUnit.MILE;
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(T__9);
				((Distance_unitContext)_localctx).value =  DistanceUnit.KILOMETRE;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PaceContext extends ParserRuleContext {
		public PaceLimit value;
		public TimeContext time;
		public Distance_unitContext distance_unit;
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public Distance_unitContext distance_unit() {
			return getRuleContext(Distance_unitContext.class,0);
		}
		public PaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterPace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitPace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitPace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaceContext pace() throws RecognitionException {
		PaceContext _localctx = new PaceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			((PaceContext)_localctx).time = time();
			setState(172);
			match(T__10);
			setState(173);
			((PaceContext)_localctx).distance_unit = distance_unit();
			((PaceContext)_localctx).value =  new PaceLimit(((PaceContext)_localctx).time.value, PaceUnit.perDistanceUnit(((PaceContext)_localctx).distance_unit.value));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pace_rangeContext extends ParserRuleContext {
		public Pace value;
		public TimeContext t1;
		public TimeContext t2;
		public Distance_unitContext distance_unit;
		public Distance_unitContext distance_unit() {
			return getRuleContext(Distance_unitContext.class,0);
		}
		public List<TimeContext> time() {
			return getRuleContexts(TimeContext.class);
		}
		public TimeContext time(int i) {
			return getRuleContext(TimeContext.class,i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Pace_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pace_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterPace_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitPace_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitPace_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pace_rangeContext pace_range() throws RecognitionException {
		Pace_rangeContext _localctx = new Pace_rangeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pace_range);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				((Pace_rangeContext)_localctx).t1 = time();
				setState(177);
				match(T__11);
				setState(178);
				((Pace_rangeContext)_localctx).t2 = time();
				setState(179);
				match(T__10);
				setState(180);
				((Pace_rangeContext)_localctx).distance_unit = distance_unit();
				((Pace_rangeContext)_localctx).value =  new PaceRange(((Pace_rangeContext)_localctx).t1.value, ((Pace_rangeContext)_localctx).t2.value, PaceUnit.perDistanceUnit(((Pace_rangeContext)_localctx).distance_unit.value));
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				name();
				((Pace_rangeContext)_localctx).value =  new PaceName(_input.getText(_localctx.start, _input.LT(-1)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hr_rangeContext extends ParserRuleContext {
		public HeartRate value;
		public CardinalContext h1;
		public CardinalContext h2;
		public Hr_unitContext hr_unit;
		public Hr_unitContext hr_unit() {
			return getRuleContext(Hr_unitContext.class,0);
		}
		public List<CardinalContext> cardinal() {
			return getRuleContexts(CardinalContext.class);
		}
		public CardinalContext cardinal(int i) {
			return getRuleContext(CardinalContext.class,i);
		}
		public Hr_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hr_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterHr_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitHr_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitHr_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hr_rangeContext hr_range() throws RecognitionException {
		Hr_rangeContext _localctx = new Hr_rangeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_hr_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			((Hr_rangeContext)_localctx).h1 = cardinal();
			setState(189);
			match(T__11);
			setState(190);
			((Hr_rangeContext)_localctx).h2 = cardinal();
			setState(191);
			((Hr_rangeContext)_localctx).hr_unit = hr_unit();
			((Hr_rangeContext)_localctx).value =  new HeartRateRange(((Hr_rangeContext)_localctx).h1.value, ((Hr_rangeContext)_localctx).h2.value, ((Hr_rangeContext)_localctx).hr_unit.value);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hr_unitContext extends ParserRuleContext {
		public HeartRateUnit value;
		public Hr_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hr_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterHr_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitHr_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitHr_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hr_unitContext hr_unit() throws RecognitionException {
		Hr_unitContext _localctx = new Hr_unitContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_hr_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__12);
			((Hr_unitContext)_localctx).value =  HeartRateUnit.BPM;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hr_zoneContext extends ParserRuleContext {
		public HeartRateZone value;
		public Hr_zoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hr_zone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterHr_zone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitHr_zone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitHr_zone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hr_zoneContext hr_zone() throws RecognitionException {
		Hr_zoneContext _localctx = new Hr_zoneContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_hr_zone);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(T__13);
				((Hr_zoneContext)_localctx).value =  HeartRateZone.Z1;
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(T__14);
				((Hr_zoneContext)_localctx).value =  HeartRateZone.Z2;
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(T__15);
				((Hr_zoneContext)_localctx).value =  HeartRateZone.Z3;
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				match(T__16);
				((Hr_zoneContext)_localctx).value =  HeartRateZone.Z4;
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(205);
				match(T__17);
				((Hr_zoneContext)_localctx).value =  HeartRateZone.Z5;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeContext extends ParserRuleContext {
		public Time value;
		public TerminalNode COLON() { return getToken(WorkoutParser.COLON, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(WorkoutParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(WorkoutParser.DIGIT, i);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(209);
				match(DIGIT);
				}
				}
				setState(212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(214);
			match(COLON);
			setState(215);
			match(DIGIT);
			setState(216);
			match(DIGIT);
			((TimeContext)_localctx).value =  Time.parseTime(_input.getText(_localctx.start, _input.LT(-1)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public double value;
		public List<TerminalNode> DIGIT() { return getTokens(WorkoutParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(WorkoutParser.DIGIT, i);
		}
		public TerminalNode POINT() { return getToken(WorkoutParser.POINT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(219);
				match(DIGIT);
				}
				}
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POINT) {
				{
				setState(224);
				match(POINT);
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(225);
					match(DIGIT);
					}
					}
					setState(228); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
			}

			((NumberContext)_localctx).value =  Double.parseDouble(_input.getText(_localctx.start, _input.LT(-1)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CardinalContext extends ParserRuleContext {
		public int value;
		public List<TerminalNode> DIGIT() { return getTokens(WorkoutParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(WorkoutParser.DIGIT, i);
		}
		public CardinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cardinal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterCardinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitCardinal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitCardinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CardinalContext cardinal() throws RecognitionException {
		CardinalContext _localctx = new CardinalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cardinal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(234);
				match(DIGIT);
				}
				}
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			((CardinalContext)_localctx).value =  Integer.parseInt(_input.getText(_localctx.start, _input.LT(-1)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(WorkoutParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(WorkoutParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(WorkoutParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(WorkoutParser.DIGIT, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WorkoutListener ) ((WorkoutListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WorkoutVisitor ) return ((WorkoutVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(LETTER);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETTER || _la==DIGIT) {
				{
				{
				setState(242);
				_la = _input.LA(1);
				if ( !(_la==LETTER || _la==DIGIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00fb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3\66\n\3\f\3\16\39\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6d\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7p\n\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0084\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0090\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\7\13\u0097\n\13\f\13\16\13\u009a\13\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ac\n\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00bd"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d2\n\22\3\23\6\23\u00d5\n\23\r"+
		"\23\16\23\u00d6\3\23\3\23\3\23\3\23\3\23\3\24\6\24\u00df\n\24\r\24\16"+
		"\24\u00e0\3\24\3\24\6\24\u00e5\n\24\r\24\16\24\u00e6\5\24\u00e9\n\24\3"+
		"\24\3\24\3\25\6\25\u00ee\n\25\r\25\16\25\u00ef\3\25\3\25\3\26\3\26\7\26"+
		"\u00f6\n\26\f\26\16\26\u00f9\13\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*\2\3\3\2\25\26\2\u0100\2,\3\2\2\2\4/\3\2\2\2\6O"+
		"\3\2\2\2\bQ\3\2\2\2\nc\3\2\2\2\fo\3\2\2\2\16q\3\2\2\2\20\u0083\3\2\2\2"+
		"\22\u008f\3\2\2\2\24\u0091\3\2\2\2\26\u00a1\3\2\2\2\30\u00ab\3\2\2\2\32"+
		"\u00ad\3\2\2\2\34\u00bc\3\2\2\2\36\u00be\3\2\2\2 \u00c4\3\2\2\2\"\u00d1"+
		"\3\2\2\2$\u00d4\3\2\2\2&\u00de\3\2\2\2(\u00ed\3\2\2\2*\u00f3\3\2\2\2,"+
		"-\5\4\3\2-.\b\2\1\2.\3\3\2\2\2/\60\5\6\4\2\60\67\b\3\1\2\61\62\7\3\2\2"+
		"\62\63\5\6\4\2\63\64\b\3\1\2\64\66\3\2\2\2\65\61\3\2\2\2\669\3\2\2\2\67"+
		"\65\3\2\2\2\678\3\2\2\28\5\3\2\2\29\67\3\2\2\2:;\5\b\5\2;<\b\4\1\2<P\3"+
		"\2\2\2=>\5\n\6\2>?\b\4\1\2?P\3\2\2\2@A\5\f\7\2AB\b\4\1\2BP\3\2\2\2CD\5"+
		"\16\b\2DE\b\4\1\2EP\3\2\2\2FG\5\20\t\2GH\b\4\1\2HP\3\2\2\2IJ\5\22\n\2"+
		"JK\b\4\1\2KP\3\2\2\2LM\5\24\13\2MN\b\4\1\2NP\3\2\2\2O:\3\2\2\2O=\3\2\2"+
		"\2O@\3\2\2\2OC\3\2\2\2OF\3\2\2\2OI\3\2\2\2OL\3\2\2\2P\7\3\2\2\2QR\5\26"+
		"\f\2RS\b\5\1\2S\t\3\2\2\2TU\5\26\f\2UV\7\4\2\2VW\5\32\16\2WX\b\6\1\2X"+
		"d\3\2\2\2YZ\5\26\f\2Z[\7\5\2\2[\\\5\32\16\2\\]\b\6\1\2]d\3\2\2\2^_\5\26"+
		"\f\2_`\7\6\2\2`a\5\34\17\2ab\b\6\1\2bd\3\2\2\2cT\3\2\2\2cY\3\2\2\2c^\3"+
		"\2\2\2d\13\3\2\2\2ef\5\26\f\2fg\7\6\2\2gh\5\36\20\2hi\b\7\1\2ip\3\2\2"+
		"\2jk\5\26\f\2kl\7\6\2\2lm\5\"\22\2mn\b\7\1\2np\3\2\2\2oe\3\2\2\2oj\3\2"+
		"\2\2p\r\3\2\2\2qr\5$\23\2rs\b\b\1\2s\17\3\2\2\2tu\5$\23\2uv\7\4\2\2vw"+
		"\5\32\16\2wx\b\t\1\2x\u0084\3\2\2\2yz\5$\23\2z{\7\5\2\2{|\5\32\16\2|}"+
		"\b\t\1\2}\u0084\3\2\2\2~\177\5$\23\2\177\u0080\7\6\2\2\u0080\u0081\5\34"+
		"\17\2\u0081\u0082\b\t\1\2\u0082\u0084\3\2\2\2\u0083t\3\2\2\2\u0083y\3"+
		"\2\2\2\u0083~\3\2\2\2\u0084\21\3\2\2\2\u0085\u0086\5$\23\2\u0086\u0087"+
		"\7\6\2\2\u0087\u0088\5\36\20\2\u0088\u0089\b\n\1\2\u0089\u0090\3\2\2\2"+
		"\u008a\u008b\5$\23\2\u008b\u008c\7\6\2\2\u008c\u008d\5\"\22\2\u008d\u008e"+
		"\b\n\1\2\u008e\u0090\3\2\2\2\u008f\u0085\3\2\2\2\u008f\u008a\3\2\2\2\u0090"+
		"\23\3\2\2\2\u0091\u0092\7\7\2\2\u0092\u0093\5\6\4\2\u0093\u0098\b\13\1"+
		"\2\u0094\u0095\7\3\2\2\u0095\u0097\5\6\4\2\u0096\u0094\3\2\2\2\u0097\u009a"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009b\u009c\b\13\1\2\u009c\u009d\7\b\2\2\u009d\u009e\7"+
		"\t\2\2\u009e\u009f\5(\25\2\u009f\u00a0\b\13\1\2\u00a0\25\3\2\2\2\u00a1"+
		"\u00a2\5&\24\2\u00a2\u00a3\5\30\r\2\u00a3\u00a4\b\f\1\2\u00a4\27\3\2\2"+
		"\2\u00a5\u00a6\7\n\2\2\u00a6\u00ac\b\r\1\2\u00a7\u00a8\7\13\2\2\u00a8"+
		"\u00ac\b\r\1\2\u00a9\u00aa\7\f\2\2\u00aa\u00ac\b\r\1\2\u00ab\u00a5\3\2"+
		"\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\31\3\2\2\2\u00ad\u00ae"+
		"\5$\23\2\u00ae\u00af\7\r\2\2\u00af\u00b0\5\30\r\2\u00b0\u00b1\b\16\1\2"+
		"\u00b1\33\3\2\2\2\u00b2\u00b3\5$\23\2\u00b3\u00b4\7\16\2\2\u00b4\u00b5"+
		"\5$\23\2\u00b5\u00b6\7\r\2\2\u00b6\u00b7\5\30\r\2\u00b7\u00b8\b\17\1\2"+
		"\u00b8\u00bd\3\2\2\2\u00b9\u00ba\5*\26\2\u00ba\u00bb\b\17\1\2\u00bb\u00bd"+
		"\3\2\2\2\u00bc\u00b2\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd\35\3\2\2\2\u00be"+
		"\u00bf\5(\25\2\u00bf\u00c0\7\16\2\2\u00c0\u00c1\5(\25\2\u00c1\u00c2\5"+
		" \21\2\u00c2\u00c3\b\20\1\2\u00c3\37\3\2\2\2\u00c4\u00c5\7\17\2\2\u00c5"+
		"\u00c6\b\21\1\2\u00c6!\3\2\2\2\u00c7\u00c8\7\20\2\2\u00c8\u00d2\b\22\1"+
		"\2\u00c9\u00ca\7\21\2\2\u00ca\u00d2\b\22\1\2\u00cb\u00cc\7\22\2\2\u00cc"+
		"\u00d2\b\22\1\2\u00cd\u00ce\7\23\2\2\u00ce\u00d2\b\22\1\2\u00cf\u00d0"+
		"\7\24\2\2\u00d0\u00d2\b\22\1\2\u00d1\u00c7\3\2\2\2\u00d1\u00c9\3\2\2\2"+
		"\u00d1\u00cb\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2#\3"+
		"\2\2\2\u00d3\u00d5\7\26\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7\30"+
		"\2\2\u00d9\u00da\7\26\2\2\u00da\u00db\7\26\2\2\u00db\u00dc\b\23\1\2\u00dc"+
		"%\3\2\2\2\u00dd\u00df\7\26\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2"+
		"\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e8\3\2\2\2\u00e2\u00e4"+
		"\7\27\2\2\u00e3\u00e5\7\26\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2"+
		"\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e2"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\b\24\1\2"+
		"\u00eb\'\3\2\2\2\u00ec\u00ee\7\26\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\b\25\1\2\u00f2)\3\2\2\2\u00f3\u00f7\7\25\2\2\u00f4\u00f6\t\2\2"+
		"\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8+\3\2\2\2\u00f9\u00f7\3\2\2\2\22\67Oco\u0083\u008f\u0098"+
		"\u00ab\u00bc\u00d1\u00d6\u00e0\u00e6\u00e8\u00ef\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}