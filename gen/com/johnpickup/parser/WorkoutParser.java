// Generated from /Users/john/Development/GarminWorkoutCreator/grammar/Workout.g4 by ANTLR 4.6
package com.johnpickup.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WorkoutParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, LETTER=13, DIGIT=14, POINT=15, COLON=16, 
		WS=17;
	public static final int
		RULE_workout = 0, RULE_stepList = 1, RULE_step = 2, RULE_distance_step = 3, 
		RULE_distance_pace_step = 4, RULE_time_step = 5, RULE_time_pace_step = 6, 
		RULE_repeating_steps = 7, RULE_distance = 8, RULE_distance_unit = 9, RULE_pace = 10, 
		RULE_pace_range = 11, RULE_time = 12, RULE_number = 13, RULE_cardinal = 14, 
		RULE_name = 15;
	public static final String[] ruleNames = {
		"workout", "stepList", "step", "distance_step", "distance_pace_step", 
		"time_step", "time_pace_step", "repeating_steps", "distance", "distance_unit", 
		"pace", "pace_range", "time", "number", "cardinal", "name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'<'", "'>'", "'@'", "'('", "')'", "'*'", "'m'", "'mi'", 
		"'km'", "'/'", "'-'", null, null, "'.'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "LETTER", "DIGIT", "POINT", "COLON", "WS"
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
			setState(32);
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
			setState(35);
			((StepListContext)_localctx).s0 = step();
			((StepListContext)_localctx).steps =  new ArrayList<>(); _localctx.steps.add(((StepListContext)_localctx).s0.value);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(37);
				match(T__0);
				setState(38);
				((StepListContext)_localctx).s1 = step();
				_localctx.steps.add(((StepListContext)_localctx).s1.value);
				}
				}
				setState(45);
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
		public Time_stepContext time_step;
		public Time_pace_stepContext time_pace_step;
		public Repeating_stepsContext repeating_steps;
		public Distance_stepContext distance_step() {
			return getRuleContext(Distance_stepContext.class,0);
		}
		public Distance_pace_stepContext distance_pace_step() {
			return getRuleContext(Distance_pace_stepContext.class,0);
		}
		public Time_stepContext time_step() {
			return getRuleContext(Time_stepContext.class,0);
		}
		public Time_pace_stepContext time_pace_step() {
			return getRuleContext(Time_pace_stepContext.class,0);
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
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				((StepContext)_localctx).distance_step = distance_step();
				((StepContext)_localctx).value =  ((StepContext)_localctx).distance_step.value;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				((StepContext)_localctx).distance_pace_step = distance_pace_step();
				((StepContext)_localctx).value =  ((StepContext)_localctx).distance_pace_step.value;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				((StepContext)_localctx).time_step = time_step();
				((StepContext)_localctx).value =  ((StepContext)_localctx).time_step.value;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				((StepContext)_localctx).time_pace_step = time_pace_step();
				((StepContext)_localctx).value =  ((StepContext)_localctx).time_pace_step.value;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
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
			setState(63);
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
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				((Distance_pace_stepContext)_localctx).distance = distance();
				setState(67);
				match(T__1);
				setState(68);
				((Distance_pace_stepContext)_localctx).pace = pace();
				((Distance_pace_stepContext)_localctx).value =  new DistancePaceStep(((Distance_pace_stepContext)_localctx).distance.value, new MaximumPace(((Distance_pace_stepContext)_localctx).pace.value));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				((Distance_pace_stepContext)_localctx).distance = distance();
				setState(72);
				match(T__2);
				setState(73);
				((Distance_pace_stepContext)_localctx).pace = pace();
				((Distance_pace_stepContext)_localctx).value =  new DistancePaceStep(((Distance_pace_stepContext)_localctx).distance.value, new MinimumPace(((Distance_pace_stepContext)_localctx).pace.value));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				((Distance_pace_stepContext)_localctx).distance = distance();
				setState(77);
				match(T__3);
				setState(78);
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
		enterRule(_localctx, 10, RULE_time_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
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
		enterRule(_localctx, 12, RULE_time_pace_step);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				((Time_pace_stepContext)_localctx).time = time();
				setState(87);
				match(T__1);
				setState(88);
				((Time_pace_stepContext)_localctx).pace = pace();
				((Time_pace_stepContext)_localctx).value =  new TimePaceStep(((Time_pace_stepContext)_localctx).time.value, new MaximumPace(((Time_pace_stepContext)_localctx).pace.value));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				((Time_pace_stepContext)_localctx).time = time();
				setState(92);
				match(T__2);
				setState(93);
				((Time_pace_stepContext)_localctx).pace = pace();
				((Time_pace_stepContext)_localctx).value =  new TimePaceStep(((Time_pace_stepContext)_localctx).time.value, new MinimumPace(((Time_pace_stepContext)_localctx).pace.value));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				((Time_pace_stepContext)_localctx).time = time();
				setState(97);
				match(T__3);
				setState(98);
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
		enterRule(_localctx, 14, RULE_repeating_steps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__4);
			setState(104);
			((Repeating_stepsContext)_localctx).s1 = step();
			((Repeating_stepsContext)_localctx).value =  new RepeatingSteps(((Repeating_stepsContext)_localctx).s1.value);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(106);
				match(T__0);
				setState(107);
				((Repeating_stepsContext)_localctx).s2 = step();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_localctx.value.addStep(((Repeating_stepsContext)_localctx).s2.value);
			setState(114);
			match(T__5);
			setState(115);
			match(T__6);
			setState(116);
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
		enterRule(_localctx, 16, RULE_distance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			((DistanceContext)_localctx).number = number();
			setState(120);
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
		enterRule(_localctx, 18, RULE_distance_unit);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(T__7);
				((Distance_unitContext)_localctx).value =  DistanceUnit.METRE;
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(T__8);
				((Distance_unitContext)_localctx).value =   DistanceUnit.MILE;
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				match(T__9);
				((Distance_unitContext)_localctx).value =   DistanceUnit.KILOMETRE;
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
		enterRule(_localctx, 20, RULE_pace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			((PaceContext)_localctx).time = time();
			setState(132);
			match(T__10);
			setState(133);
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
		enterRule(_localctx, 22, RULE_pace_range);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				((Pace_rangeContext)_localctx).t1 = time();
				setState(137);
				match(T__11);
				setState(138);
				((Pace_rangeContext)_localctx).t2 = time();
				setState(139);
				match(T__10);
				setState(140);
				((Pace_rangeContext)_localctx).distance_unit = distance_unit();
				((Pace_rangeContext)_localctx).value =  new PaceRange(((Pace_rangeContext)_localctx).t1.value, ((Pace_rangeContext)_localctx).t2.value, PaceUnit.perDistanceUnit(((Pace_rangeContext)_localctx).distance_unit.value));
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
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
		enterRule(_localctx, 24, RULE_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(148);
				match(DIGIT);
				}
				}
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(153);
			match(COLON);
			setState(154);
			match(DIGIT);
			setState(155);
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
		enterRule(_localctx, 26, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(158);
				match(DIGIT);
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POINT) {
				{
				setState(163);
				match(POINT);
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(164);
					match(DIGIT);
					}
					}
					setState(167); 
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
		enterRule(_localctx, 28, RULE_cardinal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(173);
				match(DIGIT);
				}
				}
				setState(176); 
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
		enterRule(_localctx, 30, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(LETTER);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETTER || _la==DIGIT) {
				{
				{
				setState(181);
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
				setState(186);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23\u00be\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6T\n\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"h\n\b\3\t\3\t\3\t\3\t\3\t\7\to\n\t\f\t\16\tr\13\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0084\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0095\n\r"+
		"\3\16\6\16\u0098\n\16\r\16\16\16\u0099\3\16\3\16\3\16\3\16\3\16\3\17\6"+
		"\17\u00a2\n\17\r\17\16\17\u00a3\3\17\3\17\6\17\u00a8\n\17\r\17\16\17\u00a9"+
		"\5\17\u00ac\n\17\3\17\3\17\3\20\6\20\u00b1\n\20\r\20\16\20\u00b2\3\20"+
		"\3\20\3\21\3\21\7\21\u00b9\n\21\f\21\16\21\u00bc\13\21\3\21\2\2\22\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\3\2\17\20\u00c0\2\"\3\2\2\2\4"+
		"%\3\2\2\2\6?\3\2\2\2\bA\3\2\2\2\nS\3\2\2\2\fU\3\2\2\2\16g\3\2\2\2\20i"+
		"\3\2\2\2\22y\3\2\2\2\24\u0083\3\2\2\2\26\u0085\3\2\2\2\30\u0094\3\2\2"+
		"\2\32\u0097\3\2\2\2\34\u00a1\3\2\2\2\36\u00b0\3\2\2\2 \u00b6\3\2\2\2\""+
		"#\5\4\3\2#$\b\2\1\2$\3\3\2\2\2%&\5\6\4\2&-\b\3\1\2\'(\7\3\2\2()\5\6\4"+
		"\2)*\b\3\1\2*,\3\2\2\2+\'\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\5\3\2"+
		"\2\2/-\3\2\2\2\60\61\5\b\5\2\61\62\b\4\1\2\62@\3\2\2\2\63\64\5\n\6\2\64"+
		"\65\b\4\1\2\65@\3\2\2\2\66\67\5\f\7\2\678\b\4\1\28@\3\2\2\29:\5\16\b\2"+
		":;\b\4\1\2;@\3\2\2\2<=\5\20\t\2=>\b\4\1\2>@\3\2\2\2?\60\3\2\2\2?\63\3"+
		"\2\2\2?\66\3\2\2\2?9\3\2\2\2?<\3\2\2\2@\7\3\2\2\2AB\5\22\n\2BC\b\5\1\2"+
		"C\t\3\2\2\2DE\5\22\n\2EF\7\4\2\2FG\5\26\f\2GH\b\6\1\2HT\3\2\2\2IJ\5\22"+
		"\n\2JK\7\5\2\2KL\5\26\f\2LM\b\6\1\2MT\3\2\2\2NO\5\22\n\2OP\7\6\2\2PQ\5"+
		"\30\r\2QR\b\6\1\2RT\3\2\2\2SD\3\2\2\2SI\3\2\2\2SN\3\2\2\2T\13\3\2\2\2"+
		"UV\5\32\16\2VW\b\7\1\2W\r\3\2\2\2XY\5\32\16\2YZ\7\4\2\2Z[\5\26\f\2[\\"+
		"\b\b\1\2\\h\3\2\2\2]^\5\32\16\2^_\7\5\2\2_`\5\26\f\2`a\b\b\1\2ah\3\2\2"+
		"\2bc\5\32\16\2cd\7\6\2\2de\5\30\r\2ef\b\b\1\2fh\3\2\2\2gX\3\2\2\2g]\3"+
		"\2\2\2gb\3\2\2\2h\17\3\2\2\2ij\7\7\2\2jk\5\6\4\2kp\b\t\1\2lm\7\3\2\2m"+
		"o\5\6\4\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2"+
		"st\b\t\1\2tu\7\b\2\2uv\7\t\2\2vw\5\36\20\2wx\b\t\1\2x\21\3\2\2\2yz\5\34"+
		"\17\2z{\5\24\13\2{|\b\n\1\2|\23\3\2\2\2}~\7\n\2\2~\u0084\b\13\1\2\177"+
		"\u0080\7\13\2\2\u0080\u0084\b\13\1\2\u0081\u0082\7\f\2\2\u0082\u0084\b"+
		"\13\1\2\u0083}\3\2\2\2\u0083\177\3\2\2\2\u0083\u0081\3\2\2\2\u0084\25"+
		"\3\2\2\2\u0085\u0086\5\32\16\2\u0086\u0087\7\r\2\2\u0087\u0088\5\24\13"+
		"\2\u0088\u0089\b\f\1\2\u0089\27\3\2\2\2\u008a\u008b\5\32\16\2\u008b\u008c"+
		"\7\16\2\2\u008c\u008d\5\32\16\2\u008d\u008e\7\r\2\2\u008e\u008f\5\24\13"+
		"\2\u008f\u0090\b\r\1\2\u0090\u0095\3\2\2\2\u0091\u0092\5 \21\2\u0092\u0093"+
		"\b\r\1\2\u0093\u0095\3\2\2\2\u0094\u008a\3\2\2\2\u0094\u0091\3\2\2\2\u0095"+
		"\31\3\2\2\2\u0096\u0098\7\20\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2"+
		"\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c"+
		"\7\22\2\2\u009c\u009d\7\20\2\2\u009d\u009e\7\20\2\2\u009e\u009f\b\16\1"+
		"\2\u009f\33\3\2\2\2\u00a0\u00a2\7\20\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00ab\3\2\2\2\u00a5"+
		"\u00a7\7\21\2\2\u00a6\u00a8\7\20\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3"+
		"\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab"+
		"\u00a5\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\b\17"+
		"\1\2\u00ae\35\3\2\2\2\u00af\u00b1\7\20\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\b\20\1\2\u00b5\37\3\2\2\2\u00b6\u00ba\7\17\2\2\u00b7\u00b9\t\2"+
		"\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb!\3\2\2\2\u00bc\u00ba\3\2\2\2\17-?Sgp\u0083\u0094"+
		"\u0099\u00a3\u00a9\u00ab\u00b2\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}